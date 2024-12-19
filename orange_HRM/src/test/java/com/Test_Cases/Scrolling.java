package com.Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

	public static void scroll() throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	    WebElement sear=	driver.findElement(By.xpath("//input[@type='text']"));
		sear.sendKeys("iphone");
		sear.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("(//div[text()='₹79,900'])[1]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		
		
	}

}
