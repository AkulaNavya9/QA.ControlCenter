package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;
import testBase.*;

public class CC_Login {


	//private static ConfigDetails configDetls = new ConfigDetails();
	public static CC_Login login = getSingletonlogin();
	
	public static CC_Login getSingletonlogin()
	{
	if (login == null) {
		synchronized (CC_Login.class) {
			if (login == null) {
				login = new CC_Login();// instance will be created at request time
			}
		}
	}
	return login;
}
	


	@FindBy(id = "txtUserName")
	WebElement txtUsername;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(id = "loginButton")
	WebElement btnLogin;

	@FindBy(css = "span[class='taglib-text']")
	WebElement linkForgotPassword;
	
	public CC_Login() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public void enterUsername() {
		
	CommonMethods.getSingletonCommon().sendKeys(txtUsername, ReadConfigFile.getSingletonConfigDetails().getUsername());	
	
	}
	
	public void enterPassword() {
	CommonMethods.getSingletonCommon().sendKeys(txtPassword, ReadConfigFile.getSingletonConfigDetails().getPassword());	
	
	}
	
	public void clickLogin() {
	try {
		CommonMethods.getSingletonCommon().clickButton(btnLogin);
	
	}
	catch(InterruptedException e) {
		Thread.currentThread().interrupt(); 
	}
}
	
	public void clickForgotPassword() {
	try {
		CommonMethods.getSingletonCommon().clickButton(linkForgotPassword);
	
	}
	catch(InterruptedException e) {
		Thread.currentThread().interrupt(); 
	}
}


}