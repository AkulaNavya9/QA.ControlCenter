package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_SmartBot_ComputerVision {

	@FindBy(css = ".btn.btn-primary.activeBtn")
	WebElement templates;
	
	@FindBy(css = "#btnAddTemplate")
	WebElement AddTemplate;
	
	@FindBy(css = "#templateType")
	WebElement TemplateType;
	
	@FindBy(css = "#templateName")
	WebElement TemplateName;
	
	@FindBy(css = "#templateDesc")
	WebElement TemplateDescription ;
	
	@FindBy(css = "#uploadedFile")
	WebElement ChooseFile;
	
	@FindBy(xpath = "//input[@id='aui_3_4_0_1_790']")
	WebElement Field;
	
	@FindBy(xpath = "//span[@id='aui_3_4_0_1_822']")
	WebElement isTableField;
	
	@FindBy(css = "#aui_3_4_0_1_822")
	WebElement addButton;
	
	@FindBy(css = "#nextBtn")
	WebElement nextButton;
	
	@FindBy(css = "#cancelBtn")
	WebElement cancelButton;
	
	@FindBy(css = "#Custom-ML-Model")
	WebElement useModelYesCheckBox;
	
	@FindBy(css = "#CV-Template-Model")
	WebElement useModelNoCheckBox;
	
	@FindBy(css = "#ModelNameOption") 
	WebElement semiStructuredmodelName;
	
	@FindBy(css = "#templateName")
	WebElement semiStructuredtemplateName;
	
	@FindBy(css = "#templateDesc")
	WebElement semistructuredTemplateDesc;
	
	@FindBy(css = "#nextBtn")
	WebElement semiStructuredSaveButton;
	
	@FindBy(css = "#cancelBtn")
	WebElement semiStructuredCancelButton;
	
	@FindBy(css = "#ModelOption")
	WebElement domainSpecificModelType;
	
	@FindBy(css = "#templateName")
	WebElement domainSpecificTemplateName ;
	
	@FindBy(css = "#templateDesc")
	WebElement domianSpecificTemplateDecs;
	
	@FindBy(css = "#nextBtn")
	WebElement domainSpecifixSaveButton;
	
	@FindBy(css = "#cancelBtn")
	WebElement domainSpecificCancelButton;
	
	@FindBy(css = "#templateName")
	WebElement unstructuredTemplateName;
	
	@FindBy(css = "#templateDesc")
	WebElement unstructuredTemplateDesc;
	
	@FindBy(css = "#formFieldUn")
	WebElement unstructuredAddFieldName;
	
	@FindBy(css = "#aui_3_4_0_1_554")
	WebElement unstructuredAddbButton;
	
	@FindBy(css = "#tagField")
	WebElement tag;
	
	@FindBy(css = "#datatype")
	WebElement dataTypeDrpDwn;
	
	@FindBy(css = "#pattern")
	WebElement pattern;
	
	@FindBy(css = "#totalWords")
	WebElement totalWords;
	
	@FindBy(css = "#nextBtn")
	WebElement unstructredSaveButton;
	
	@FindBy(css = "#cancelBtn")
	WebElement unstructredCancelButton;
	
	@FindBy(css = "#aui_3_4_0_1_448")
	WebElement ModelsTabButton;
	
	@FindBy(css = "#aui_3_4_0_1_464")
	WebElement RefreshButton;
	
	@FindBy(css = "#btnAddTemplate")
	WebElement addModelButton;
	
	@FindBy(css = "#aui_3_4_0_1_530")
	WebElement EntriesDrpDwn;
	
	@FindBy(css = "#modelName")
	WebElement modelDetails;
	
	@FindBy(css = "#modelDescription")
	WebElement modelDesc;
	
	@FindBy(css = "#dataSetPath")
	WebElement dataSetPath;
	
	@FindBy(css = "#entityField")
	WebElement entityName;
	
	@FindBy(css = "#aui_3_4_0_1_558")
	WebElement addEntityButton;
	
	@FindBy(css = "#cancelBtn")
	WebElement modelCancelButton;
	
	@FindBy(css = "#nextBtn")
	WebElement modelSaveButton;
	
	
}
