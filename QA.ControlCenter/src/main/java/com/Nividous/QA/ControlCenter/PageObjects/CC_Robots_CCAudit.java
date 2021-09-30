package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Robots_CCAudit {

	@FindBy(css = "#aui_3_4_0_1_690 > tr > td:nth-child(1) > a")
	WebElement robotName1;
	
	@FindBy ( css = "#registeredRobotsTableDiv")
	WebElement robotNameSort;
	
	
	@FindBy ( css = "#aui_3_4_0_1_772")
	WebElement ipAddressSort;
	
	@FindBy ( css = "#aui_3_4_0_1_932")
	WebElement authorization;
	
	@FindBy ( xpath = "//*[@id=\"aui_3_4_0_1_827\"]")
	WebElement ddAccess;
	
	
	@FindBy ( id = "authTabAddPermBtn")
	WebElement addPermissionBtn;
	
	
	@FindBy ( css = "#aui_3_4_0_1_892")
	WebElement closeBtn;
	
	@FindBy ( id = "createViewSavebtn")
	WebElement saveBtn;
	
	
	
}
