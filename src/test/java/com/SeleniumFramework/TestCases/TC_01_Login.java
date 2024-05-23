package com.SeleniumFramework.TestCases;

import java.util.List;
import java.util.stream.Collectors;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
import PageObjects.AdminPage;
import PageObjects.LoginPage;
import Utils.ConstantsHelper;

public class TC_01_Login extends BaseTest {

	@Test
	public void LoginFlowValidation() {
		LoginPage loginPage = new LoginPage(driver);
    	AdminPage adminPage= loginPage.Login(ConstantsHelper.username, ConstantsHelper.password);  
    	List<String> users =adminPage.adminPageUsernames().stream().map(s->s.getText()).collect(Collectors.toList());
    	List<String> sortedUserNames= adminPage.adminPageUsernames().stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		Assert.assertTrue(sortedUserNames.equals(users));
    	
    	
	}
}
