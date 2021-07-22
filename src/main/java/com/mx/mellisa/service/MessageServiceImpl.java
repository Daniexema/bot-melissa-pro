package com.mx.mellisa.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MessageServiceImpl implements MessageService{

	@Override
	public String getMessageResponse(String bodyMsg) {
		String result = "";
		 try (FileReader reader = new FileReader("src/main/resources/messages/services.json"))
	        {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(reader);
			JSONObject jsonObject = (JSONObject) jsonArray.get(0);
			result = (String) jsonObject.get("servicios");
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		 return result;
	}

}
