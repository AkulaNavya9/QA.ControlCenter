package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.Base;

public class CC_Administration_ManagePermissions {

	public CC_Administration_ManagePermissions() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(css = "button[class='btn btn-default resource-link']")
	WebElement btnAdminManagePermisions;
	
	@FindBy(id = "authTabAddPermBtn")
	WebElement btnAdminManagePermisionsAddPerm;
	
	@FindBy(id = "saveAuthPermBtn")
	WebElement btnAdminManagePermisionsSavePerm;
	
	@FindBy(id = "selectResType")
	WebElement ddManagePermisionsPermset;
	 
	
	//will need common method for this
	Select sel = new Select(ddManagePermisionsPermset);
	
	
	public void selPermission(String value) {
		sel.selectByValue(value);
		
		
		
	}
	
}
