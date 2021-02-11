package org.application.fileUtil;

import java.io.FileInputStream;
import java.util.Properties;

public class Property {

	public static String getPropertyValue(String filePath,String key)
	{
		String value="";
		Properties ppt=new Properties();
		try{
			ppt.load(new FileInputStream(filePath));
			value=ppt.getProperty(key);
		}
		catch(Exception e){}
		return value;
	}
	
	//end of class
}
