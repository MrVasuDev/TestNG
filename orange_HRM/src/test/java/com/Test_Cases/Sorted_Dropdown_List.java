package com.Test_Cases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorted_Dropdown_List {

	public static void sorted() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		driver.findElement(By.id("animals"))
		Select dropDown=new Select(driver.findElement(By.id("colors")));
		
		ArrayList original=new ArrayList();
		ArrayList temp=new ArrayList();
		
		List<WebElement> option=dropDown.getOptions();
		for (WebElement webElement : option) {
			
			original.add(webElement.getText());
			temp.add(webElement.getText());
			
		}
		
		System.out.println("List before sorted :");
		System.out.println("Original list "+original);
		System.out.println("Temp list "+temp);
		
		Collections.sort(temp);
		
		System.out.println("List after sorted :");
		System.out.println("Original list "+original);
		System.out.println("Temp list "+temp);

		if (original.equals(temp)) {
			System.out.println("List is sorted");
		} 
		else {
            System.out.println("List is not sorted");
		}
		
		
	}
}
