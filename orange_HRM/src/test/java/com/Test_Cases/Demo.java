package com.Test_Cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {

	@Test(groups = "Functional")
	public void demo() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//ul[@class='top-menu']/child::li[2]"));
		act.moveToElement(ele).perform();

//		WebElement ele1=driver.findElement(By.xpath("//ul[@class='sublist firstLevel active']/li[2]"));
		WebElement ele1=driver.findElement(By.xpath("(//a[contains(text(),'Notebooks')])[1]"));
		act.moveToElement(ele1).perform();
		act.click(ele1);
		
	}
}
