package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Robots_Vault {

	@FindBy(id = "txtIdentifierFilter")
	WebElement  Identifier;
	
	@FindBy(id = "applyFilterBtn")
	WebElement  SearchButton;
	
	@FindBy(id = "resetFilter")
	WebElement ResetButton ;
	
	@FindBy(id = "btnAddVaultRecord")
	WebElement AddVaultRecord ;
	
	@FindBy(xpath = "//*[@id=\"cmbTemplate\"]")
	WebElement SelectTemplateDrpDwn ;
	
	@FindBy(css = "#txtIdentifier")
	WebElement recordDetailsIdentifier;
	
	@FindBy(xpath = "//*[@id=\"aui_3_4_0_1_1685\"]")
	WebElement AddIDentifierButton ;
	
	@FindBy(xpath = "//*[@id=\"txt1Username\"]")
	WebElement VaultRecordUsername ;
	
	@FindBy(xpath = "//*[@id=\"txt1Url\"]")
	WebElement VaultRecordURL ;
	
	@FindBy(xpath = "//*[@id=\"txt1Password\"]")
	WebElement VaultRecordPassword ;
	
	@FindBy(xpath = "//*[@id=\"txt1Note\"]")
	WebElement VaultRecordNote ;
	
	@FindBy(xpath = "//*[@id=\"cmb1Bot\"]")
	WebElement  VaultRecordBot;
	
	@FindBy(id = "btnSaveWebEntry")
	WebElement  SaveButton;
	
	@FindBy(id = "btnBackWebEntry")
	WebElement  BackButton;
	
	@FindBy(xpath = "//*[@id=\"aui_3_4_0_1_721\"]")
	WebElement CloseButton ;
	
	

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

