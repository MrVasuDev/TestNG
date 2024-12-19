package com.Test_Cases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert_Popup {

	@Test(groups = "Functional")
	public void popUp() {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("alertBtn")).click();
		 
	Alert alt=driver.switchTo().alert();
	  String msg=alt.getText();
	  System.out.println(msg);
		alt.accept();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//	  Alert alt=	wait.until(ExpectedConditions.alertIsPresent());
//		alt.accept();
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		try {
//			js.executeScript("window.alert=function{};");
//	
//		} catch (Exception e) {
//
//		}		

		
		
		
	}
	
}
