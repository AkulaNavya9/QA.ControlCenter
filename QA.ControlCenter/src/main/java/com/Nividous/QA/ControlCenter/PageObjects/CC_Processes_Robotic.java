package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Processes_Robotic {

	@FindBy ( id = "newProcessViewId")
	WebElement createProcessBtn; 
	
	@FindBy ( id = "processName")
	WebElement processName;
	
	@FindBy ( id = "draftProcess")
	WebElement ddDraftProcess;
	
	@FindBy ( id = "version")
	WebElement ddVersion;
	
	@FindBy ( id = "description")
	WebElement description;
	
	@FindBy ( css = "#aui_3_4_0_1_805")
	WebElement saveBtn;
	
	@FindBy ( css = "#close")
	WebElement closeBtn;
	
	@FindBy ( id = "aui_3_4_0_1_505")
	WebElement nameSort;
	
	@FindBy ( id = "aui_3_4_0_1_1401")
	WebElement draftProcessSort;
	
	@FindBy ( id = "aui_3_4_0_1_1429")
	WebElement versionSort;
	
	@FindBy ( id = "aui_3_4_0_1_1444")
	WebElement authorSort;
	
	@FindBy ( id = "aui_3_4_0_1_1460")
	WebElement createdDateSort;
	
	
}
