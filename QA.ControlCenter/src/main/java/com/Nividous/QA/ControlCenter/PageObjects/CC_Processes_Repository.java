package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;

import testBase.Base;

public class CC_Processes_Repository {


	public CC_Processes_Repository()

	{
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public static CC_Processes_Repository procrepo = getSingletonprocrepo();
	
	public static CC_Processes_Repository getSingletonprocrepo()
	{
	if (procrepo == null) {
		synchronized (CC_Processes_Repository.class) {
			if (procrepo == null) {
				procrepo = new CC_Processes_Repository();// instance will be created at request time
			}
		}
	}
	return procrepo;
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
