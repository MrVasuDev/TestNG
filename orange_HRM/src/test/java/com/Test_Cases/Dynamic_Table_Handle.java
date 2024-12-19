package com.Test_Cases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Dynamic_Table_Handle {

	@Test(groups = "UI")
	public void dynamicTab() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		List<WebElement> ele=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		System.out.println("Number of rows :"+ele.size());
		
		for (int i = 1; i <ele.size(); i++) {
			WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[2]/td[1]"));
			if (name.getText().equals("Chrome")) {
	
		String cpuload=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr[2]/td[2]")).getText();
		 String value=driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
		  if (cpuload.equals(value)) {
			System.out.println("CPU load is same");
		} 
		  else {
			  System.out.println("CPU load is not same");
		}	
			} 
			
		}
	}
}
