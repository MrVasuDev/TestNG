package com.Test_Cases;

import java.awt.Point;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Control_Methods {

	@Test
	public  void browser_Control() throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		driver.get("https://stage.learningchain.in/login");
		driver.manage().window().maximize();
		
		Dimension d=new Dimension(350, 550);
		driver.manage().window().setSize(d);
		
	}
}
