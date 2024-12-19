package com.Test_Cases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class File_Uploading {

	@Test
	public static void file() throws Throwable {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	    driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
	    driver.findElement(By.xpath("//div[text()='Upload File']")).click();
	    
	    StringSelection s=new StringSelection("C:\\Users\\Srinivasu_K\\Documents\\Naruto1.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	     Thread.sleep(3000);
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     r.keyRelease(KeyEvent.VK_V);
	     
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyPress(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
