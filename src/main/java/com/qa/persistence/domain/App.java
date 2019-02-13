package com.qa.persistence.domain;

import java.util.logging.Logger;

public class App {
	private static final  Logger LOGGER = Logger.getLogger(App.class.getName());
	private App()
	{
		
	}
	public static void logger()
	{
	//LOGGER.info("Hello World");
	}
	
	public static String log()
	{
		logger();
		return "success";
	}
	
}
