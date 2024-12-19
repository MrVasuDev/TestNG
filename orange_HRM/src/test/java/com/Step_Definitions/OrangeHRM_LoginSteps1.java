package com.Step_Definitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom_Test_Pages.OrangeHRM_Home_POM;
import com.pom_Test_Pages.OrangeHRM_Login_POM;

import io.cucumber.java.en.*;

@Listeners
@Test
public class OrangeHRM_LoginSteps1 extends Base_Class {

//	WebDriver driver=null;
	OrangeHRM_Login_POM login;
	OrangeHRM_Home_POM home;
	Actions act;
	
//	@Given("open browser")
//	public void open_browser() {
////	   driver=new EdgeDriver();
////	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
////	   driver.manage().window().maximize();
//	}

	@Given("^enter Url$")
	public void enter_url() throws Throwable  {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	}

	@When("^user enter (.*)and(.*)$")
	public void user_enter_username_and_password
	(String username, String password) throws Throwable {
	  login=new OrangeHRM_Login_POM(driver);
	  
//	  login.getText_User().sendKeys(username);
//	  login.getText_Pwd().sendKeys(password);
//	  act=new Actions(driver);
//	  WebElement pass=login.getText_Pwd();
//	  act.click(pass).perform();
//	  login.getText_Pwd().sendKeys(password);
	  
	  login.getText_User().sendKeys(username);
	  login.getText_Pwd().sendKeys("admin123");
	
	  
	}

	@And("user clicks on Login")
	public void user_clicks_on_login() {
	 login.getBtn_Login().click();
	}

	@Then("then user navigates to homepage")
	public void then_user_navigates_to_homepage() {
	 home=new OrangeHRM_Home_POM(driver);
	 home.getText_DashBoard().isDisplayed();
	 driver.quit();
	 
	}

}
