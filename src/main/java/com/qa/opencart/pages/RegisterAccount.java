package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {
	
	private WebDriver driver;

	//Object Repository for Login Page
	//By Locators
	
	private By myAccount = By.xpath("//a[@title=\"My Account\"]");
	private By register = By.linkText("Register");
	private By registerAccount = By.cssSelector("#content h1");
	private By firstName = By.id("input-firstname");
	private By lastName = By.id("input-lasttname");
	private By email = By.id("input-email");
	private By telephone = By.id("input-telephone");
	private By password = By.id("input-password");
	private By pwdConfirm = By.id("input-confirm");
	private By subscribeYes = By.xpath("//input[@type='radio' and @value='1'])[1]");
	private By subscribeNo = By.xpath("//input[@type='radio' and @value='1'])[2]");
	private By policy = By.xpath("//input[@value='Continue']");
	
	
	//constructor of RegistrationPage
	public  RegisterAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public void registrationPage() {
		driver.findElement(myAccount).click();
		driver.findElement(register).click();
	}
	
	//Get Page title
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	
	//Registration Page
	public void enterRegisterationDetails(String email) {
		//driver.findElements(email).sendKeys(email);
	}
}
