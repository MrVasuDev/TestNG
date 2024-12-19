package com.Test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.pom_Test_Pages.AmazonPOM;

public class Amazon {

	@Test(groups = "Functional")
	public void dropdown() throws Throwable {

	WebDriver driver= new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
 
       AmazonPOM ap=new AmazonPOM(driver);
       ap.getEle1().click();
       int count=0;
       List<WebElement> allEle=ap.getEle();
       
    for (WebElement data : allEle) {
      
    	count++;
    	
    	if (count>=6 && count<=11) {
           System.out.println(data.getText());
    	}
    	
    	
    }


}

	
}
