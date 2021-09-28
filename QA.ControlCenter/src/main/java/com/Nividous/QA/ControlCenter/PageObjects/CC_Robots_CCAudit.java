package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Robots_CCAudit {

	@FindBy(css = "#aui_3_4_0_1_690 > tr > td:nth-child(1) > a")
	WebElement RobotName1;
	
	@FindBy ( css = "#registeredRobotsTableDiv")
	WebElement RobotNameSort;
	
	
	@FindBy ( css = "#aui_3_4_0_1_772")
	WebElement IPAddressSort;
	
	@FindBy ( css = "#aui_3_4_0_1_932")
	WebElement Authorization;
	
	@FindBy ( xpath = "//*[@id=\"aui_3_4_0_1_827\"]")
	WebElement AccessDropdown;
	
	
	@FindBy ( id = "authTabAddPermBtn")
	WebElement addPermissionButton;
	
	
	@FindBy ( css = "#aui_3_4_0_1_892")
	WebElement closeButton;
	
	@FindBy ( id = "createViewSavebtn")
	WebElement saveButton;
	
	
	
}
