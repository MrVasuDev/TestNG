package com.pom_Test_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaukariPOM {

	
		   
		@FindBy
	    (xpath = "//div[@class='nI-gNb-dropdown undefined nI-gNb-dropdown__c3 nI-gNb-dropdown--expand nI-gNb-Companies']/ul")
	   private List<WebElement> ele;

	    public List<WebElement> getEle() {
		return ele;
	      }

	      public NaukariPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	       }


	
}
