package com.example.demo.common.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.example.demo.common.utils.AESEncryptUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.servlet.mvc.method.annotation.AbstractMessageConverterMethodArgumentResolver;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by xiaoh on 2018/2/2.
 */
public class FastJsonBodyDecryptConverter extends FastJsonHttpMessageConverter {
    /**
     * 该类方法主要实现对requestBody注解参数进行解密
     * 1.创建自定义HttpInputMessage对象（流是一次性的创建该对象为了从原始流中读取解密后将明文字符串赋给该对象）
     * 2.根据headers中的Authorization字段获取用户的token
     * 3.根据token获取对应的秘钥然后用该用户对应的秘钥进行解密
     * 4.将明文的参数转化为流赋给自定义HttpInputMessage对象
     */
    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        HttpInputMessageCustom httpInputMessageCustom = new HttpInputMessageCustom();
        httpInputMessageCustom.setHeaders(inputMessage.getHeaders());

        List<String> token = inputMessage.getHeaders().get("Authorization");
        String s = token.get(0);
        System.out.println(s);


        //获取body内容
        String body = IOUtils.toString(inputMessage.getBody());
        //解密
        String jsonStr = "";
        try {
            //获取密文和秘钥将密文进行解密生成明文字符串
            jsonStr = AESEncryptUtils.aesDecrypt(body, "UNGznGoz5ikOohrI");
            System.out.println(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        httpInputMessageCustom.setBody(IOUtils.toInputStream(jsonStr));
        return super.read(type, contextClass, httpInputMessageCustom);
    }
}
