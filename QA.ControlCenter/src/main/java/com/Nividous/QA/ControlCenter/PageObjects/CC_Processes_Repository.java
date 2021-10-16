package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;

import testBase.Base;

public class CC_Processes_Repository {

	private static CommonMethods common = new CommonMethods();
	
	public CC_Processes_Repository()

	{
		PageFactory.initElements(Base.getDriver(), this);
	}
		@FindBy ( id = "showScheduler")
		WebElement uploadDraftProcessBtn;
	
	@FindBy ( id = "uploadFiles")
	WebElement browseBtn;
	
	@FindBy (css = "i[class='glyphicon glyphicon-trash']")
	WebElement removeBtn;
	
	@FindBy ( xpath = "//*[@class='btn']")
	WebElement backToRepoBtn;
	
	@FindBy ( xpath = "//*[@class='fa fa-lock']")
	WebElement lockIcon;
	
	@FindBy ( xpath = "//*[@class='fa fa-list-ol']")
	WebElement listIcon;
	
	
	
	
}
