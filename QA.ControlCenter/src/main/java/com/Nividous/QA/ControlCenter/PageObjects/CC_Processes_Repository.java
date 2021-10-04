package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Processes_Repository {

	@FindBy ( id = "showScheduler")
	WebElement uploadDraftProcessBtn;
	
	@FindBy ( id = "uploadFiles")
	WebElement browseBtn;
	
	@FindBy ( xpath = "//*[@class='btn']")
	WebElement backToRepoBtn;
	
	@FindBy ( xpath = "//*[@class='fa fa-lock']")
	WebElement lockIcon;
	
	@FindBy ( xpath = "//*[@class='fa fa-list-ol']")
	WebElement listIcon;
	
	
	
}
