package com.Step_Definitions;

import java.net.SocketException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom_Test_Pages.OrangeHRM_AddEmp_POM;
import com.pom_Test_Pages.OrangeHRM_DeleteEmp_POM;
import com.pom_Test_Pages.OrangeHRM_Login_POM;
import com.pom_Test_Pages.OrangeHRM_VerifyEmp_POM;

import io.cucumber.java.en.*;


@Listeners
@Test
public class OrangeHRM_DeleteEmpSteps extends Base_Class {


	OrangeHRM_Login_POM log;
	OrangeHRM_AddEmp_POM addEmp;
	OrangeHRM_VerifyEmp_POM verify;
	OrangeHRM_DeleteEmp_POM del;
	Actions act;
	

	@Given("^Enter URL and Login$")
	public void enter_url_and_login() {
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		log=new OrangeHRM_Login_POM(driver);
		log.getText_User().sendKeys("Admin");
		log.getText_Pwd().sendKeys("admin123");
		log.getBtn_Login().click();
		
	}

	@When("clicks on PIM")
	public void clicks_on_pim() throws Throwable {
		 addEmp=new OrangeHRM_AddEmp_POM(driver);
		 Thread.sleep(2000);
		 act=new Actions(driver);
		 WebElement pim=addEmp.getText_PIM();
		 act.moveToElement(pim).perform();
		 act.click(pim).perform();
		 
	}

	@And("^enter the (.*)$")
	public void enter_the_emp_name(String empname) {
		 verify=new OrangeHRM_VerifyEmp_POM(driver);
		addEmp=new OrangeHRM_AddEmp_POM(driver);
		act=new Actions(driver);
		
		WebElement name=verify.getText_EmpName();
		act.click(name).sendKeys(empname).perform();
	}

	@When("clicks on Search")
	public void clicks_on_search() {
	 
	  verify.getBtn_Search().click();
	}



	@And("clicks on delete")
	public void clicks_on_delete() throws Throwable {
		del=new OrangeHRM_DeleteEmp_POM(driver);
//		Thread.sleep(2000);		 
//		del.getBtn_Delete().click();
//		del.getText_Confirm().click();
		
		  
	}

	@Then("deleted successful should come")
	public void deleted_successful_should_come() throws Throwable {

		driver.quit();
	}



	

}
