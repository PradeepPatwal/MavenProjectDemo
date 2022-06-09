package com.qa.opencart.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.Constants;

public class RegistrationPageTest extends BaseTest{
	
	@Test
	public void registerAccount() {
		registerAccount.registrationPage();
		String registerAccountTitle = registerAccount.getRegisterPageTitle();
		System.out.println("Register Account Page Title is: "+registerAccountTitle);
		
		assertEquals(registerAccountTitle, Constants.Login_Page_Title);
		//registerAccount.enterRegisterationDetails();
	}

}
