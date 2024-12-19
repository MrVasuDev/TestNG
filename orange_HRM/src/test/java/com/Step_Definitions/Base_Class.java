package com.Step_Definitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	
	
	public static Base_Class seleniumDriver;
	protected static WebDriver driver;
	private static WebDriverWait wait;
	private static Duration Time;
	private static int page_Load_TimeOut=40;
	
	public Base_Class() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, Time);
		driver.manage().timeouts().implicitlyWait(Time.ofSeconds(15));
//		driver.manage().timeouts().pageLoadTimeout(Time.ofSeconds(20));
		
	}	
	
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	
}
