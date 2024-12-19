package com.Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Validation_Methods {

	@Test
	public static void validation() throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	WebElement ele=	driver.findElement(By.xpath("//input[@id='RememberMe']"));
//		ele.click();
		boolean checkBox=ele.isSelected();
		if (checkBox==true) {
			System.out.println("check box is selected");
		} else {
			System.out.println("check box is not selected");
		}
		WebElement ele1=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		ele1.click();
		boolean button=ele1.isEnabled();
		if (button==true) {
			System.out.println("button is enabled");
		} else {
			System.out.println("button is not enabled");
		}
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//label[text()='Email:']"));
	boolean errMSG=ele2.isDisplayed();
		if (errMSG==true) {
			System.out.println("text is displayed");
		} else {
			System.out.println("text is not displayed");

		}
		
	
	}

}
