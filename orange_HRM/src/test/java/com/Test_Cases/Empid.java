package com.Test_Cases;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.pom_Test_Pages.OrangeHRM_AddEmp_POM;
import com.pom_Test_Pages.OrangeHRM_Login_POM;

public class Empid {

	static OrangeHRM_AddEmp_POM add;
	static OrangeHRM_Login_POM login;
	static Random r=new Random();
	static int n=r.nextInt(100);
	static String firstname="Naruto";
	static String lastname="ozumaki";
	
	@Test
	public static void empID() {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.manage().window().maximize();
		 add=new OrangeHRM_AddEmp_POM(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		login=new OrangeHRM_Login_POM(driver);
		login.getText_User().sendKeys("Admin");
		login.getText_Pwd().sendKeys("admin123");
		login.getBtn_Login().click();
		
		Actions act=new Actions(driver);
		 WebElement pim=add.getText_PIM();
		 act.moveToElement(pim).perform();
		 act.click(pim).perform();
		 add.getBtn_Add().click();
		 
		 add.getText_FirstName().sendKeys(firstname+n);
		 add.getText_LastName().sendKeys(lastname+n);
			
	    WebElement ele=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	   
		
		add.getBtn_Save().click();
		driver.quit();
		
	}
}
