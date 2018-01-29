package com.example.demo.service.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoh on 2018/1/24.
 */


public class Result implements Serializable {

    private static final long serialVersionUID = 5576237395711742681L;

    public static final int SUCCESS = 1;

    public static final int FAILURE = 0;

    private int code;

    private boolean success;

    private String msg = "";

    private Object data;

    /**
     * 构造方法当第一个参数为true时，第二个参数则为需要绑定的数据data，第三个参数为附带的信息msg
     * 构造方法当第一个参数为false时，第二个参数为附带的信息msg
     * @param isSuccess
     * @param objects
     */
    public Result(boolean isSuccess, Object... objects) {
        this.success = isSuccess;
        if(isSuccess){
            this.code = SUCCESS;
            if(objects.length>0){
                if(objects.length==1){
                    this.data = objects[0];
                }
                if(objects.length==2){
                    this.data = objects[0];
                    this.msg = (String)objects[1];
                }
            }
        }else{
            this.code = FAILURE;
            if(objects.length>0){
                if(objects.length==1){
                    this.msg = (String)objects[0];
                }
            }
        }
    }

    public int getCode() {
        return code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
        if(success){
            this.code = SUCCESS;
        }else{
            this.code = FAILURE;
        }
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", success=" + success +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
