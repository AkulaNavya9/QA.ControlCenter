package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CC_Management_BusinessDashboard {

	
	@FindBy(id = "deployButton")
	WebElement btnBusProcessDeploy;
	
	@FindBy(id = "reloadButton")
	WebElement btnBusProcessReload;
	
	@FindBy(id = "advanceSearchBtn")
	WebElement btnBusProcessCusFilter;
	
	
	@FindBy(css = "button[class='btn btn-xs btn-success']")
	WebElement btnBusProcessCusFilterAddRule;
	
	@FindBy(css = "button[class='btn btn-xs btn-danger']")
	WebElement btnBusProcessCusFilterDel;
	
	@FindBy(name = "builder-basic_rule_0_filter")
	WebElement txtBusProcessCusFilterAnd;
	 
	@FindBy(id = "applySearch")
	WebElement btnBusProcessCusFilterApply;
	
	@FindBy(id = "btn-reset")
	WebElement btnBusProcessCusFilterReset;
	
	
	
	
}
