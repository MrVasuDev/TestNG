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
import com.pom_Test_Pages.OrangeHRM_Login_POM;
import com.pom_Test_Pages.OrangeHRM_VerifyEmp_POM;

import io.cucumber.java.en.*;
import io.netty.handler.codec.http.websocketx.extensions.WebSocketServerExtensionHandler;


@Listeners
@Test
public class OrangeHRM_VerifyEmpSteps extends Base_Class {

//	WebDriver driver=null;
	OrangeHRM_Login_POM login;
	OrangeHRM_AddEmp_POM add;
	OrangeHRM_VerifyEmp_POM verify;
	Actions act;
	
	
	
//	@Given("Open browser")
//	public void open_browser() {
//		 driver=new EdgeDriver();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//		 driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//
//		   driver.manage().window().maximize();
//	}

	@Given("Enter Url")
	public void enter_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login=new OrangeHRM_Login_POM(driver);
		login.getText_User().sendKeys("Admin");
		login.getText_Pwd().sendKeys("admin123");
		login.getBtn_Login().click();
	}

	@When("clicks on pim")
	public void clicks_on_pim() throws Throwable {
	 verify=new OrangeHRM_VerifyEmp_POM(driver);
	 Thread.sleep(2000);
	 act=new Actions(driver);
		WebElement Pim=verify.getText_PIM();
		act.moveToElement(Pim).perform();
		act.click(Pim).perform();
	}

	@When("^user enters (.*)$")
	public void user_enters_emp_name(String empName) {
		Random r=new Random();
			int n=r.nextInt(10);
		
		add=new OrangeHRM_AddEmp_POM(driver);
		act=new Actions(driver);
		WebElement name=verify.getText_EmpName();
		act.click(name).sendKeys(empName).perform();

		//	 verify.getText_EmpName().sendKeys(empName);
	}

	@When("clicks on search")
	public void clicks_on_search()   {
		verify.getBtn_Search().click();
	
	}

	@Then("user should get emp details")
	public void user_should_get_emp_details() {

	driver.quit();
	}




}
