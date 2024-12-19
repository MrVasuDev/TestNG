package com.Test_Cases;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender_Popup {

	@Test
	public void calender() {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
				
		driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
		String expdate="February 2025";
		
		while(true) {
		String actdate=	driver.findElement
				(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		
		if (actdate.contains(expdate)) {
			break;
		}
		
		else {
			driver.findElement(By.xpath("//button[@type='button'][2]")).click();
		}
		
	}

		driver.findElement(By.xpath("//div[text()='14']")).click();
		
		
	}
}
