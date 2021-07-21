package com.mx.bot.mellissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mx.bot.mellissa.*"})
public class MelissaBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MelissaBotApplication.class, args);
	}

}
