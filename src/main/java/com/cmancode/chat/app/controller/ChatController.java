package com.cmancode.chat.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.cmancode.chat.app.modelo.Greeting;
import com.cmancode.chat.app.modelo.Mensaje;

@Controller
public class ChatController {
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting send(Mensaje mensaje) throws InterruptedException {
		Thread.sleep(1000);
		return new Greeting(mensaje.getUsuario() +" dice: "+ mensaje.getMensaje());
	}
		
}
