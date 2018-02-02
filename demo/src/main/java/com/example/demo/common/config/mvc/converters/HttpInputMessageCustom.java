package com.example.demo.common.config.mvc.converters;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpMethod;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xiaoh on 2018/2/2.
 */
public class HttpInputMessageCustom implements HttpInputMessage {

    private  HttpHeaders headers;

    private  InputStream body;

    @Override
    public InputStream getBody() throws IOException {
        return this.body;
    }

    @Override
    public HttpHeaders getHeaders() {
        return this.headers;
    }


    public void setHeaders(HttpHeaders headers) {
        this.headers = headers;
    }

    public void setBody(InputStream body) {
        this.body = body;
    }
}
