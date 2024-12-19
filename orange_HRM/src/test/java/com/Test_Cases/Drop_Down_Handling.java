package com.Test_Cases;

import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Handling {

	@Test
	public void drop_Down() {

		WebDriver driver= new ChromeDriver();
	    driver.get("http://omayo.blogspot.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

WebElement ele=driver.findElement(By.id("multiselect1"));
          Select s=new Select(ele);
	  
//Printing all options
	    
	    List<WebElement> opt   = s.getOptions();
//	    for (WebElement webElement : opt) {
//			String option=webElement.getText();
//			System.out.println(option);
//	    	
//		}
//	  
//	    for (int i = 0; i <opt.size() ; i++) {       	    
//	    System.out.println(opt.get(i).getText());
//	    	
//		}
	    
	    //Printing even index elements
	    
//	 for (int i = 0; i < opt.size(); i++) {
//		if (i%2==0) {
//			System.out.println(opt.get(i).getText());
//		} 
		 
		 
	    //Printing odd index elements
	    
//	    for (int i = 0; i < opt.size(); i++) {
//			if (i%2==1) {
//				System.out.println(opt.get(i).getText());
//			}
		
	    //Printing all selected options
	    
//	    s.selectByIndex(0);
//	    s.selectByIndex(1);
//	    s.selectByIndex(2);
//	  List<WebElement>selOpt= s.getAllSelectedOptions();
//	  for (WebElement webElement : selOpt) {
//		String selected=webElement.getText();
//		System.out.println(selected);
//	}
	 
	    //Printing 1 selected option
	    
//	    WebElement sel1=s.getFirstSelectedOption();
//	     String first= sel1.getText();
//	     System.out.println(first);
//	
//	    
	
	}
}
