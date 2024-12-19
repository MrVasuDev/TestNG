package com.Test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Pseudo_Elements {

	@Test
	public static void psuedoEle() throws Throwable {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	List<WebElement> ele=driver.findElements(By.xpath("//form[@name='register']//label"));
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
	for (WebElement webElement : ele) {
		
		String script="return window.getComputedStyle(arguments[0],'::After').getPropertyValue('content');";
		String content=js.executeScript(script, webElement).toString();
		
		if (content.contains("*")) {
			System.out.println(webElement.getText()+"  mandatory");
		}
		
		else {
			System.out.println(webElement.getText()+"  not mandatory");
		}
		
//		System.out.println(webElement.getText());
		
	}
	
	
	
	}
	
}
