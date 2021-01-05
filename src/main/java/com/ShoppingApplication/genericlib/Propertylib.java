package com.ShoppingApplication.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Bharani
 *
 */

public class Propertylib implements AutoConstant{
	/**
	 * To read the data from the property file
	 * @param keyvalue
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getpropertydata(String keyvalue) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(propertyfilepath));
		String value1 = p.getProperty(keyvalue);
		return value1;
		
	}

}
