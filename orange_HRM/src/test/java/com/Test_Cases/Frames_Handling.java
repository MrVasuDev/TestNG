package com.Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames_Handling {

	@Test
	public static void frame() throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(3000);

//     Switching default frame;
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.name("username")).sendKeys("Mighty");
//		driver.findElement(By.id("password")).sendKeys("s007@");
		
//		Switching to multiple frames;
		
//		WebElement fr=driver.findElement
//		(By.xpath("(//section[@class='flex gap-10 w-full']/div/iframe)[1]"));
//	
//		driver.switchTo().frame(fr);
//		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys
//		("Admin@gmail.com",Keys.TAB,"Admin@1234",Keys.TAB,"Admin@1234");
//		
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(1);
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[text()='Username:']/following-sibling::input")).sendKeys
//		("SuperAdmin@gmail.com",Keys.TAB,"SuperAdmin@1234");
//		
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
//		driver.switchTo().frame(0);
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).clear();
//		

//		Switching to nested frame:
		
		driver.switchTo().frame(0).switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@1234",Keys.TAB);
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys("Admin@1234",Keys.TAB);
	    
	
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);

		driver.findElement(By.xpath("//button[@id='submitButton']")).click();	
	   
				
		
		
	}

}
