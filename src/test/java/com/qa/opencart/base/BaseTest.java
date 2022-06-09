package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.RegisterAccount;

public class BaseTest {
	
	public WebDriver driver;
	
	public DriverFactory df;
	public RegisterAccount registerAccount;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		driver = df.init_driver("chrome");
		registerAccount = new RegisterAccount(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit(); 
	}
}
