package com.SeleniumFramework.TestCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import PageObjects.AdminPage;
import PageObjects.LoginPage;
import Utils.ConstantsHelper;

public class TC_02_Verfiy_Add_NewAccount_AdminPage extends BaseTest{
	
	@Test
	public void AddAccountValidation() throws InterruptedException{
		LoginPage loginPage = new LoginPage(driver);
    	AdminPage adminPage= loginPage.Login(ConstantsHelper.username, ConstantsHelper.password); 
    	adminPage.addAccount();
    	adminPage.SelectUser();
    	
    	Actions a =new Actions(driver);
    	a.moveToElement(adminPage.SelectEmployee()).click().sendKeys("Pete").build().perform();
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
    	wait.until(ExpectedConditions.textToBePresentInElement(adminPage.employeeName(), "Peter Mac Anderson"));
    	adminPage.employeeName().click();
    	adminPage.SelectStatus();
    	String username ="pravin44";
    	String password ="pravinueq12";
    	adminPage.usernamePassword(username,password);
		
		
	}
	
	
	

}
