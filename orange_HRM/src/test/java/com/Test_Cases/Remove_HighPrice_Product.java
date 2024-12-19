package com.Test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Remove_HighPrice_Product {

	@Test
	public static void removeProd() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//ul[@class='top-menu']/li[5]")).click();
				//Add three product one by one
			List<WebElement> adCart=driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement s : adCart) 
			{
				Thread.sleep(3000);
				s.click();
			}
				//print all product Price
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			List<WebElement> price=driver.findElements(By.xpath
			("//table[@class='cart']/child::thead/tr/th[4]/../../following-sibling::tbody/tr/td[6]"));
			
			int highest=0;
			for (WebElement a : price) {
		    	   String data=a.getText();
		    	   double p=Double.parseDouble(data); //str to double
			       int s=(int)p;       //double to int
				if (highest<s) {
					highest=s;
				}
					}
				System.out.println(highest);
		
		driver.findElement(By.xpath
	("//span[contains(text(),'"+highest+"')]/parent::td/parent::tr/child::td/child::input[@name='removefromcart']")).click();
		driver.findElement(By.name("updatecart")).click();
						
	}
}
