package com.Project.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
@CrossOrigin(origins = "*")
public class WebSocketConfig implements WebSocketConfigurer {



	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
	
		registry.addHandler(new MyHandler(), "/my-websocket-endpoint").setAllowedOrigins("*");
		
	}

}
