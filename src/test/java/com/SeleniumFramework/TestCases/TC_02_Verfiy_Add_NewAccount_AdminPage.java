package com.SeleniumFramework.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.AdminPage;
import PageObjects.LoginPage;
import Utils.ConstantsHelper;

public class TC_02_Verfiy_Add_NewAccount_AdminPage extends BaseTest{
	
	@Test
	public void AddAccountValidation(){
		LoginPage loginPage = new LoginPage(driver);
    	AdminPage adminPage= loginPage.Login(ConstantsHelper.username, ConstantsHelper.password); 
    	adminPage.addAccount();
    	adminPage.SelectUser();
    	adminPage.SelectEmployee();
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
    	wait.until(ExpectedConditions.visibilityOfAllElements(adminPage.employeeNames()));
    	for(WebElement empy:adminPage.employeeNames()) {
    		String empynName =empy.getText();
    		if(empynName.contains("Peter Mac")) {
    			empy.click();
    		}	
    	}
    	adminPage.SelectStatus();
    	String username ="pravinueq";
    	String password ="pravinueq12";
    	adminPage.usernamePassword(username,password);
		
		
	}
	
	
	

}
