package com.Test_Cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dynamic_Dropdown_Handling {

	@Test
	public static void dynamic_Dropdown() {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Jobs']"));
		act.moveToElement(ele).perform();
		
		List<WebElement> jobs=	driver.findElements(By.xpath
		("(//ul[@class='nI-gNb-menus']/li/a/following-sibling::div/ul/li/following-sibling::li)"));
		
		for (int i = 0; i <jobs.size(); i++) {
			System.out.println(jobs.get(i).getText());
			
			if (jobs.get(i).getText().equals("Engineering jobs")) {
				break;
			}
		}
		
	}
}
