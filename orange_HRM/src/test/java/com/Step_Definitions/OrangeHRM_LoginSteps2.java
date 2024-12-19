package com.Step_Definitions;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom_Test_Pages.OrangeHRM_Login_POM;

import io.cucumber.java.en.*;


@Listeners
@Test
public class OrangeHRM_LoginSteps2 extends Base_Class {

	OrangeHRM_Login_POM login;
	

	@Given("user enter the url")
	public void user_enter_the_url() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	}

	@And("^user should enter (.*)and(.*)$")
	public void user_should_enter_un_and_pwd(String username,String password) {
		login=new OrangeHRM_Login_POM(driver);
		login.getText_User().sendKeys(username);
		  login.getText_Pwd().sendKeys(password);
		
		
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		 login.getBtn_Login().click();

		
	}

	@Then("toaster message should display")
	public void toaster_message_should_display() {
	  
		login.getToas_Msg().isDisplayed();

		driver.quit();
	}




	
}
