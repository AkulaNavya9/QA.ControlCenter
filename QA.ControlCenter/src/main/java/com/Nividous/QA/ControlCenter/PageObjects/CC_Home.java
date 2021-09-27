package com.Nividous.QA.ControlCenter.PageObjects;

import testBase.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CC_Home extends Base{
 
	public CC_Home() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@href='http://localhost:8080/group/rpa/robots']")
	WebElement lblMenuDropdownRobot;
	
	@FindBy(css = "//a[@href='http://localhost:8080/group/rpa/robots']")
	WebElement Menu_Dropdown_Robots_CCAudit;
	
	
}
