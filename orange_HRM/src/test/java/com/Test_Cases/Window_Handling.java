package com.Test_Cases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Window_Handling {

	@Test
	public static void window() {
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.amazon.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.swiggy.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.myntra.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> allID=driver.getWindowHandles();
		System.out.println(allID.size());
		
		for (String string : allID) {
		
		String title=driver.switchTo().window(string).getTitle();
		
		System.out.println(title);
		
		if (title.contains("Swiggy")) {
			break;
		}
		driver.close();
		}
		
	}
}
