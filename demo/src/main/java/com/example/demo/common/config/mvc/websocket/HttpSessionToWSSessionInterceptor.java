package com.example.demo.common.config.mvc.websocket;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * http session转换为websocket session拦截器
 * @author Administrator
 *
 */
@Component
public class HttpSessionToWSSessionInterceptor extends HttpSessionHandshakeInterceptor {

	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception ex) {
	System.out.println("HttpSessionHandshakeInterceptor(httpSession握手拦截器)-afterHandshake");
	}

	@Override
	public boolean beforeHandshake(ServerHttpRequest arg0, ServerHttpResponse arg1, WebSocketHandler arg2,
			Map<String, Object> arg3) throws Exception {
		System.out.println("HttpSessionHandshakeInterceptor(httpSession握手拦截器)-beforeHandshake");
		return super.beforeHandshake(arg0, arg1, arg2, arg3);
	}
	
	

}
