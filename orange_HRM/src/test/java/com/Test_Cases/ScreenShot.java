package com.Test_Cases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot {

	@Test
	public static void screenshot() throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement sear=	driver.findElement(By.xpath("//input[@type='text']"));			sear.sendKeys("iphone");
		sear.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		 TakesScreenshot sh=(TakesScreenshot)driver;
		 File src=	sh.getScreenshotAs(OutputType.FILE);
		 File dest= new File("C:\\Users\\Srinivasu_K\\eclipse-workspace\\sapphirus\\test-output.png");
		 Files.copy(src, dest);
				
		 WebElement ele=driver.findElement(By.xpath("(//div[text()='₹79,900']"));	
		
	}

}
