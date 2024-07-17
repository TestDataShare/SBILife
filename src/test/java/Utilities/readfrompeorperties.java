package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readfrompeorperties {
	
	String path="C:\\Users\\Admin\\eclipse-workspace\\seleniumByPawanKumar\\SBILife.co.in\\src\\test\\resources\\data.properties";
	
	public String readfrom(String key) throws IOException
	{
		Properties p = new Properties();
		FileInputStream file= new FileInputStream(path);
		p.load(file);
		return p.getProperty(key);
	
	}

}
