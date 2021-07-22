package com.mx.bot.mellissa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mx.mellisa.service.MessageService;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;

import org.apache.log4j.Logger;

@RestController
@RequestMapping("/tools")
public class MessageRestController {

	
	private static final Logger LOG = Logger.getLogger(MessageRestController.class);	

	@Autowired
	private MessageService messageService;
	
	@PostMapping(value = "/responseMsg")
	public String testPostRequest1(@RequestParam("Body") String body, @RequestParam("From") String from) {
		LOG.info("Inicia servicio...");
		return messageService.getMessageResponse(body);
	}
	
	
	
	
}
