package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class CC_Login {

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
	
	
}


