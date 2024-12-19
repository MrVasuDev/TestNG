package com.Step_Definitions;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom_Test_Pages.OrangeHRM_AddEmp_POM;
import com.pom_Test_Pages.OrangeHRM_Login_POM;

import io.cucumber.java.en.*;

@Listeners
@Test
public class OrangeHRM_AddEmpSteps extends Base_Class {


	OrangeHRM_Login_POM login;
	OrangeHRM_AddEmp_POM addEmp;
	
	
	@Given("enter url")
	public void enter_url() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login=new OrangeHRM_Login_POM(driver);
		login.getText_User().sendKeys("Admin");
		login.getText_Pwd().sendKeys("admin123");
		login.getBtn_Login().click();

	}

	@And("user clicks on pim and add")
	public void user_clicks_on_pim_and_add() throws Throwable {
		
		 addEmp=new OrangeHRM_AddEmp_POM(driver);
		 Thread.sleep(2000);
		Actions act=new Actions(driver);
		 WebElement pim=addEmp.getText_PIM();
		 act.moveToElement(pim).perform();
		 act.click(pim).perform();
		 addEmp.getBtn_Add().click();
	}

	@When("^User enter (.*)and(.*)$")
	public void user_enter_first_name_and_last_name
	(String firstname, String lastname) {
		Random r=new Random();
		int n=r.nextInt(10);
		
	addEmp.getText_FirstName().sendKeys(firstname+n);
	addEmp.getText_LastName().sendKeys(lastname);
	
	}

	@And("user can upload photo")
	public void user_can_upload_photo() throws Throwable {
		 Thread.sleep(3000);
		addEmp.getAdd_Img().click();
		 StringSelection s=new StringSelection("C:\\Users\\Srinivasu_K\\Documents\\Naruto1.jpg");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		    
		     Robot r=new Robot();
		     r.keyPress(KeyEvent.VK_CONTROL);
		     r.keyPress(KeyEvent.VK_V);
		     r.keyRelease(KeyEvent.VK_CONTROL);
		     r.keyRelease(KeyEvent.VK_V);
		     
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyPress(KeyEvent.VK_ENTER);
//	addEmp.getAdd_Img().sendKeys("C:/Users/Srinivasu_K/Documents/Naruto1.jpg");
	}

	@And("user clicks on save")
	public void user_clicks_on_save() {
	addEmp.getBtn_Save().click();
	}

	@Then("user should get successful message")
	public void user_should_get_successful_message() {
	   
	    driver.quit();
	}


}
