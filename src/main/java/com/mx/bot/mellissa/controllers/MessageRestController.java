package com.mx.bot.mellissa.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;

import org.apache.log4j.Logger;

@RestController
@RequestMapping("/tools")
public class MessageRestController {

	
		private static final Logger LOG = Logger.getLogger(MessageRestController.class);	

	@PostMapping(value = "/responseMsg")
	public String testPostRequest1(@RequestParam("Body") String body, @RequestParam("From") String from) {
		LOG.info("Inicia servicio...");
		Body body2 = new Body.Builder(body).build();
	    Message message = new Message.Builder().body(body2).build();

	    MessagingResponse response = new MessagingResponse.Builder().message(message).build();
		LOG.info("Termina servicio...");	    
		return "Escribiste "+response.getTagName()+ "-->"+response.getChildren()+"-->to String "+response.toString();
	}
	
	
	
	
}
