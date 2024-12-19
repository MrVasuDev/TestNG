package com.Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Slider {

	public static void flipkart() throws Throwable {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
		   WebElement ele = driver.findElement(By.name("q"));
		   ele.sendKeys("iphone");
		    ele.submit();
		   
		    Actions act=new Actions(driver);
		       
		    WebElement ele1 = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/div"));
		    act.dragAndDropBy(ele1, 40, 0).perform();
		   Thread.sleep(3000);
		   WebElement ele2=driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']/div")); 
		  act.dragAndDropBy(ele2, -40, 0).perform();
		 
	}
}
