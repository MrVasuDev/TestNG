package com.Test_Cases;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Multi_Browser {

	@Test(groups = "Compatibility")
	public void multiBrows() {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.ajio.com/");
		
		Set<String> allWeb= driver.getWindowHandles();
		System.out.println(allWeb.size());
		
		for (String apps : allWeb) {
		   String title=driver.switchTo().window(apps).getTitle();
		   if (title.contains("Ajio.com")) {
			break;
		}
		   
		}
		
	}
}
