package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Processes_Business {

	@FindBy ( id = "deployButton")
	WebElement homeDeployBtn;
	
	@FindBy ( id = "advanceSearchBtn")
	WebElement customFilterBtn;
	
	@FindBy ( id = "reloadButton")
	WebElement reloadBtn;
	
	@FindBy ( id = "file")
	WebElement browseBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-default']")
	WebElement closeBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-primary']")
	WebElement deployBtn;
	
	@FindBy ( xpath = "//*[@name='builder-basic_rule_0_filter']")
	WebElement ddFilter;
	
	@FindBy ( id = "applySearch")
	WebElement filterApplyBtn;
	
	@FindBy ( id = "btn-reset")
	WebElement filterResetBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-xs btn-danger']")
	WebElement filterDeleteBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-xs btn-success']")
	WebElement addRuleBtn;
	
	
}
