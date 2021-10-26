package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_SmartBot_ComputerVision {
	
	public static CC_SmartBot_ComputerVision smartbotCV = getSingletonsmartbotCV();
	
	public static CC_SmartBot_ComputerVision getSingletonsmartbotCV()
	{
	if (smartbotCV == null) {
		synchronized (CC_SmartBot_ComputerVision.class) {
			if (smartbotCV == null) {
				smartbotCV = new CC_SmartBot_ComputerVision();// instance will be created at request time
			}
		}
	}
	return smartbotCV;
}

	@FindBy(css = ".btn.btn-primary.activeBtn")
	WebElement templatesBtn;
	
	@FindBy(css = "#btnAddTemplate")
	WebElement addTemplateBtn;
	
	@FindBy(css = "#templateType")
	WebElement ddTemplateType;
	
	@FindBy(css = "#templateName")
	WebElement templateName;
	
	@FindBy(css = "#templateDesc")
	WebElement templateDescription ;
	
	@FindBy(css = "#uploadedFile")
	WebElement chooseFileBtn;
	
	@FindBy(xpath = "//input[@id='aui_3_4_0_1_790']")
	WebElement field;
	
	@FindBy(xpath = "//span[@id='aui_3_4_0_1_822']")
	WebElement isTableFieldcb;
	
	@FindBy(css = "#aui_3_4_0_1_822")
	WebElement addBtn;
	
	@FindBy(css = "#nextBtn")
	WebElement nextBtn;
	
	@FindBy(css = "#cancelBtn")
	WebElement cancelBtn;
	
	@FindBy(css = "#Custom-ML-Model")
	WebElement useModelYesCheckBox;
	
	@FindBy(css = "#CV-Template-Model")
	WebElement useModelNoCheckBox;
	
	@FindBy(css = "#ModelNameOption") 
	WebElement ddSemiStructuredmodelName;
	
	@FindBy(css = "#templateName")
	WebElement semiStructuredtemplateName;
	
	@FindBy(css = "#templateDesc")
	WebElement semistructuredTemplateDesc;
	
	@FindBy(css = "#nextBtn")
	WebElement semiStructuredSaveBtn;
	
	@FindBy(css = "#cancelBtn")
	WebElement semiStructuredCancelBtn;
	
	@FindBy(css = "#ModelOption")
	WebElement ddDomainSpecificModelType;
	
	@FindBy(css = "#templateName")
	WebElement domainSpecificTemplateName ;
	
	@FindBy(css = "#templateDesc")
	WebElement domianSpecificTemplateDecs;
	
	@FindBy(css = "#nextBtn")
	WebElement domainSpecifixSaveBtn;
	
	@FindBy(css = "#cancelBtn")
	WebElement domainSpecificCancelBtn;
	
	@FindBy(css = "#templateName")
	WebElement unstructuredTemplateName;
	
	@FindBy(css = "#templateDesc")
	WebElement unstructuredTemplateDesc;
	
	@FindBy(css = "#formFieldUn")
	WebElement unstructuredAddFieldName;
	
	@FindBy(css = "#aui_3_4_0_1_554")
	WebElement unstructuredAddBtn;
	
	@FindBy(css = "#tagField")
	WebElement tag;
	
	@FindBy(css = "#datatype")
	WebElement dddataType;
	
	@FindBy(css = "#pattern")
	WebElement pattern;
	
	@FindBy(css = "#totalWords")
	WebElement totalWords;
	
	@FindBy(css = "#nextBtn")
	WebElement unstructredSaveButton;
	
	@FindBy(css = "#cancelBtn")
	WebElement unstructredCancelButton;
	
	@FindBy(css = "#aui_3_4_0_1_448")
	WebElement modelsTabBtn;
	
	@FindBy(css = "#aui_3_4_0_1_464")
	WebElement refreshBtn;
	
	@FindBy(css = "#btnAddTemplate")
	WebElement addModelBtn;
	
	@FindBy(css = "#aui_3_4_0_1_530")
	WebElement ddEntries;
	
	@FindBy(css = "#modelName")
	WebElement modelDetails;
	
	@FindBy(css = "#modelDescription")
	WebElement modelDesc;
	
	@FindBy(css = "#dataSetPath")
	WebElement dataSetPath;
	
	@FindBy(css = "#entityField")
	WebElement entityName;
	
	@FindBy(css = "#aui_3_4_0_1_558")
	WebElement addEntityBtn;
	
	@FindBy(css = "#cancelBtn")
	WebElement modelCancelBtn;
	
	@FindBy(css = "#nextBtn")
	WebElement modelSaveBtn;
	
	@FindBy(id = "createReport")
	WebElement createReportBtn;
	
}
