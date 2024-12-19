package com.Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom_Test_Pages.NaukariPOM;

public class Naukari {

	@Test(groups = "UI")
	public void dropdown() throws Throwable {
		

		WebDriver driver= new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    driver.get("https://www.naukri.com/");
	   WebElement ele1= driver.findElement(By.xpath("//div[text()='Companies']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ele1).perform();
	   
	    NaukariPOM np=new NaukariPOM(driver);
	    
	    for (WebElement data : np.getEle()) {
	    	
	    	String actData=data.getText();
	    	String expData=data.getText();
	    	Assert.assertEquals(actData, expData);
	    	
	    	System.out.println(data.getText());
	    }
	
	
	}
}
