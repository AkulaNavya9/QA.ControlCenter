package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;
import testBase.ConfigDetails;

import testBase.Base;

public class CC_Login {

	private static CommonMethods common = new CommonMethods();
	private static ConfigDetails configDetls = new ConfigDetails();
	
	public CC_Login() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	@FindBy(id = "txtUserName")
	WebElement txtUsername;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(id = "loginButton")
	WebElement btnLogin;

	@FindBy(css = "span[class='taglib-text']")
	WebElement linkForgotPassword;
	
	public void enterUsername() {
	common.sendKeys(txtUsername, configDetls.getUsername());	
	
	}
	
	public void enterPassword() {
	common.sendKeys(txtUsername, configDetls.getPassword());	
	
	}
	
	public void clickLogin() {
	try {
		common.clickButton(btnLogin);
	
	}
	catch(InterruptedException e) {
		Thread.currentThread().interrupt(); 
	}
}
	
	public void clickForgotPassword() {
	try {
		common.clickButton(linkForgotPassword);
	
	}
	catch(InterruptedException e) {
		Thread.currentThread().interrupt(); 
	}
}


}