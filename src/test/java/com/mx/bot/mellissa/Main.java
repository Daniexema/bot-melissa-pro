package com.mx.bot.mellissa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) {
		         
	        try (FileReader reader = new FileReader("src/main/resources/messages/services.json"))
	        {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(reader);
			JSONObject jsonObject = (JSONObject) jsonArray.get(0);
			System.out.println(jsonObject.get("servicios"));
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	}

}
