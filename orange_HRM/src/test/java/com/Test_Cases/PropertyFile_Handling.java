package com.Test_Cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class PropertyFile_Handling {

	@Test
	
	public void properties() throws Throwable  {
		
		FileInputStream file=new 
				
		FileInputStream("file_path");
		Properties pobj=new Properties();
		pobj.load(file);
		String data=pobj.getProperty("user");
		System.out.println(data);
	
			
	}
}
