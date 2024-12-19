package com.pom_Test_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_DeleteEmp_POM {

	@FindBy(xpath = "//button[@type='button'][2]")
	WebElement btn_Delete;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash oxd-button-icon'])")
	WebElement text_Confirm;
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement btn_YesDel;
	
	@FindBy()
	
	WebDriver driver;
	public OrangeHRM_DeleteEmp_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn_Delete() {
		return btn_Delete;
	}

	public WebElement getText_Confirm() {
		return text_Confirm;
	}

	public WebElement getBtn_YesDel() {
		return btn_YesDel;
	}
	
	
	
}
