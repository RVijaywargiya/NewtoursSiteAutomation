package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utilities {
	
	public String getDataPropertyFile(String dataName) throws Exception{		
		File file=new File("src/main/resources/config.properties");
		FileInputStream stream=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(stream);
		return prop.getProperty(dataName);		  
	}

}
