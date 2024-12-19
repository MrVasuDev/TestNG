package com.pom_Test_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPOM {

	@FindBy(className = "hm-icon-label")
	private WebElement ele1;

	@FindBy(xpath = "//div[@id='hmenu-content']/ul/li")
	private List<WebElement> ele;
	

	public AmazonPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	public List<WebElement> getEle() {
		return ele;
	}
	
	public WebElement getEle1() {
		return ele1;
	}
    
}

