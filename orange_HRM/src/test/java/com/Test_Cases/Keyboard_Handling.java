package com.Test_Cases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Keyboard_Handling {

	@Test
	public static void keyboard() throws Throwable {

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Johnwick",Keys.TAB,"S@1231.com",Keys.TAB);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_9);
		r.keyPress(KeyEvent.VK_8);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_3);
		r.keyPress(KeyEvent.VK_7);
		
		r.keyRelease(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_7);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.id("textarea")).sendKeys("Street 21, California, USA");
		
		
		
		
		
		
		
		
		
		
	}

}
