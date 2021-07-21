package com.mx.bot.mellissa.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.apache.log4j.Logger;

@RestController
@RequestMapping("/tools")
public class MessageRestController {

	
		private static final Logger LOG = Logger.getLogger(MessageRestController.class);	
		public static final String ACCOUNT_SID = "ACdb36de274ec80c6285d406b4d2998f56";
		public static final String AUTH_TOKEN = "c6f9b903dba70226a8ac0e08bcbea95c";

		
	@PostMapping(value = "/sendMsg")
	public String testPostRequest(@RequestParam String number,@RequestParam String msg) {

		
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
	        Message message = Message.creator(
	                new com.twilio.type.PhoneNumber("whatsapp:+521"+number),
	                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
	                msg)
	            .create();
	        
	        LOG.info(message.getSid());
		
	        return message.getSid();

	}
	
	
	@PostMapping(value = "/responseMsg")
	public String testPostRequest1(@RequestParam("Body") String body, @RequestParam("From") String from) {

		  Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
          Message messagem = Message.creator(
                   new com.twilio.type.PhoneNumber(from),
                   new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                  body+": RESPONDO A TU MENSAJE")
              .create();
          
          LOG.info(messagem.getSid());
          
		return messagem.getSid();
	}	
}
