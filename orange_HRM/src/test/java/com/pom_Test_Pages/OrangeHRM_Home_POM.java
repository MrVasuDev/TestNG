package com.pom_Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Home_POM {

	@FindBy(xpath = "//h6[text()='Dashboard']")
	WebElement text_DashBoard;
	
	@FindBy(xpath = "//span[text()='PIM']")
	WebElement PIM;
	
	WebDriver driver;
	public OrangeHRM_Home_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getText_DashBoard() {
		return text_DashBoard;
	}
	public WebElement getPIM() {
		return PIM;
	}
	
	
	
}
