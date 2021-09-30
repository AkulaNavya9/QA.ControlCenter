package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Robots_Vault {

	@FindBy(id = "txtIdentifierFilter")
	WebElement  identifier;
	
	@FindBy(id = "applyFilterBtn")
	WebElement  searchBtn;
	
	@FindBy(id = "resetFilter")
	WebElement resetBtn ;
	
	@FindBy(id = "btnAddVaultRecord")
	WebElement addVaultRecord ;
	
	@FindBy(xpath = "//*[@id=\"cmbTemplate\"]")
	WebElement ddSelectTemplate ;
	
	@FindBy(css = "#txtIdentifier")
	WebElement recordDetailsIdentifier;
	
	@FindBy(xpath = "//*[@id=\"aui_3_4_0_1_1685\"]")
	WebElement addIDentifierBtn ;
	
	@FindBy(xpath = "//*[@id=\"txt1Username\"]")
	WebElement vaultRecordUsername ;
	
	@FindBy(xpath = "//*[@id=\"txt1Url\"]")
	WebElement vaultRecordURL ;
	
	@FindBy(xpath = "//*[@id=\"txt1Password\"]")
	WebElement vaultRecordPassword ;
	
	@FindBy(xpath = "//*[@id=\"txt1Note\"]")
	WebElement vaultRecordNote ;
	
	@FindBy(xpath = "//*[@id=\"cmb1Bot\"]")
	WebElement  vaultRecordBot;
	
	@FindBy(id = "btnSaveWebEntry")
	WebElement  saveBtn;
	
	@FindBy(id = "btnBackWebEntry")
	WebElement  backBtn;
	
	@FindBy(xpath = "//*[@id=\"aui_3_4_0_1_721\"]")
	WebElement closeBtn ;
	
	

	@FindBy(xpath = "//*[@id=\"txt2Value\"]")
	WebElement  VariableValue;
	
	@FindBy(xpath = "//*[@id=\"txt2Note\"]")
	WebElement VariableNote ;
	
	@FindBy(xpath = "//*[@id=\"cmb2Bot\"]")
	WebElement VariableBot ;
	
	@FindBy(id = "btnSaveVariableEntry")
	WebElement VariableSaveButton ;
	
	@FindBy(xpath = "//*[@id=\"aui_3_4_0_1_864\"]")
	WebElement VariableBackButton ;
	
	@FindBy(xpath = "//*[@id=\"aui_3_4_0_1_721\"]")
	WebElement  VariableCloseButton;
	
	 
}

