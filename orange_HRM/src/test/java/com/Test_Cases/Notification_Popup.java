package com.Test_Cases;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Notification_Popup {

	@Test
	public void notification() {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
