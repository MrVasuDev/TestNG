package com.pom_Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login_POM {

	@FindBy(name = "username")
	WebElement text_User;
	
	@FindBy(css = "input[type='password']")
	WebElement text_Pwd;
	
	@FindBy(css =  "button[type='submit']")
	WebElement btn_Login;

	@FindBy(xpath = "//p[text()='Invalid credentials']")
	WebElement toas_Msg;
	

	WebDriver driver;
	public OrangeHRM_Login_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getText_User() {
		return text_User;
	}

	public WebElement getText_Pwd() {
		return text_Pwd;
	}

	public WebElement getBtn_Login() {
		return btn_Login;
	}
	
	public WebElement getToas_Msg() {
		return toas_Msg;
	}
	
	
}
