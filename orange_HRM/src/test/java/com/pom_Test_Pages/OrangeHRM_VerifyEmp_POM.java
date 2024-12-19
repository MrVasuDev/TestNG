package com.pom_Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_VerifyEmp_POM {


	@FindBy(xpath = "//span[text()='PIM']")
	WebElement text_PIM;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button'])[2]")
	WebElement btn_EmpInfo;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement text_EmpId;
	
	@FindBy(xpath = "(//div[@class='oxd-autocomplete-wrapper'])[1]")
	WebElement text_EmpName;
	
	@FindBy(xpath = "(//button[text()=' Search '])")
	WebElement btn_Search;
	
	@FindBy(xpath = "(//div[@role='table'])")
	WebElement tab_Role;
	
	WebDriver driver;
	public OrangeHRM_VerifyEmp_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getText_PIM() {
		return text_PIM;
	}

	public WebElement getBtn_EmpInfo() {
		return btn_EmpInfo;
	}

	public WebElement getText_EmpId() {
		return text_EmpId;
	}

	public WebElement getText_EmpName() {
		return text_EmpName;
	}

	public WebElement getBtn_Search() {
		return btn_Search;
	}

	public WebElement getTab_Role() {
		return tab_Role;
	}
	
}
