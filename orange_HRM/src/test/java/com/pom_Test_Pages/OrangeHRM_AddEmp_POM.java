package com.pom_Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AddEmp_POM {

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement text_PIM;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']/i")
	WebElement btn_Add;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus']")
	WebElement add_Img;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement text_FirstName;
	
	@FindBy(xpath = "//input[@name='middleName']")
	WebElement text_MiddleName;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement text_LastName;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement text_EmpID;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement btn_Save;
	
	@FindBy(xpath="//p[text()='Successfully Saved']")
	WebElement toast_Msg;
	
	WebDriver driver;
	public OrangeHRM_AddEmp_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getText_PIM() {
		return text_PIM;
	}

	public WebElement getBtn_Add() {
		return btn_Add;
	}

	public WebElement getAdd_Img() {
		return add_Img;
	}

	public WebElement getText_FirstName() {
		return text_FirstName;
	}

	public WebElement getText_MiddleName() {
		return text_MiddleName;
	}

	public WebElement getText_LastName() {
		return text_LastName;
	}

	public WebElement getText_EmpID() {
		return text_EmpID;
		
	}

	public WebElement getBtn_Save() {
		return btn_Save;
	}

	public WebElement getToast_Msg() {
		return toast_Msg;
	}


}
