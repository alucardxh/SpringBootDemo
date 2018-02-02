package com.example.demo.common.config.mvc;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.example.demo.common.config.mvc.converters.FastJsonBodyDecryptConverter;
import com.example.demo.common.config.mvc.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by xiaoh on 2018/2/1.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    private LoginInterceptor loginInterceptor;

    //消息(参数)解析器配置
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        /**1  预先定义一个Converters 转换消息的对象
         * 2 添加fastjson的配置信息
         * 3 早converter中添加配置信息
         * 4.将converter添加到converters中
         */
        super.configureMessageConverters(converters);//
        FastJsonBodyDecryptConverter fastConstructor=new FastJsonBodyDecryptConverter();//1
        FastJsonConfig fastJsonConfig=new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);//2
        fastConstructor.setFastJsonConfig(fastJsonConfig);//3
        converters.add(fastConstructor);//4
    }

    //该方法是将拦截器挂载到连接器链上
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(loginInterceptor).addPathPatterns("/api/**");
    }




}
