package com.example.demo.common.config.mvc.websocket;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.util.HashMap;
import java.util.Map;


@Component
public class SystemWebSocketHandler implements  WebSocketHandler{
	
	public static Map<String, WebSocketSession> webSession = new HashMap<String, WebSocketSession>();

	public void afterConnectionClosed(WebSocketSession session, CloseStatus arg1) throws Exception {
		System.out.println("WebSocketHandler afterConnectionClosed");
		webSession.remove(session.getId());
		
	}


	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		webSession.put(session.getId(), session);
		System.out.println("WebSocketHandler afterConnectionEstablished");
		
	}


	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		System.out.println("WebSocketHandler handleMessage");
		System.out.println(message.getPayload().toString());
		session.sendMessage(new TextMessage(message.getPayload().toString()));
		
	}


	public void handleTransportError(WebSocketSession arg0, Throwable arg1) throws Exception {
		System.out.println("WebSocketHandler handleTransportError");

	}

	
	public boolean supportsPartialMessages() {
		System.out.println("WebSocketHandler supportsPartialMessages");
		// TODO Auto-generated method stub
		return false;
	}
	

}
