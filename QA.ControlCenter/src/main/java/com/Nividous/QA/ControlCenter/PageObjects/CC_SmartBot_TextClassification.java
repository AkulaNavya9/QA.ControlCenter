package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_SmartBot_TextClassification {
	
	public static CC_SmartBot_TextClassification smartbotTxtCls = getSingletonsmartbotTxtCls();
	
	public static CC_SmartBot_TextClassification getSingletonsmartbotTxtCls()
	{
	if (smartbotTxtCls == null) {
		synchronized (CC_SmartBot_TextClassification.class) {
			if (smartbotTxtCls == null) {
				smartbotTxtCls = new CC_SmartBot_TextClassification();// instance will be created at request time
			}
		}
	}
	return smartbotTxtCls;
}

	@FindBy(css = "#aui_3_4_0_1_449")
	WebElement createTextClassifier;
	
	@FindBy(css = "#addtionWayCreate")
	WebElement createTextClassifierRadioBtn;
	
	@FindBy(css = "#addtionWayImport")
	WebElement importTextClassifierRadioBtn;
	
	@FindBy(css = "#modelName")
	WebElement createClassifierName;
	
	@FindBy(css = "#Method")
	WebElement advancedMethodCheckBox;
	
	@FindBy(css = "#file_1")
	WebElement chooseFileBtn;
	
	@FindBy(css = "#description")
	WebElement createtextclassifierDesc;
	
	@FindBy(css = "#aui_3_4_0_1_654")
	WebElement createTextClassifierSubmitBtn ;
	
	@FindBy(css = "#aui_3_4_0_1_671")
	WebElement createTextClassifiercloseBtn;
	
	@FindBy(css = "#modelName")
	WebElement importModelName;
	
	@FindBy(css = "#file_1")
	WebElement importChoseFileBtn;
	
	@FindBy(css = "#description")
	WebElement importTextClassifierDesc;
	
	@FindBy(css = "#aui_3_4_0_1_654")
	WebElement importSubmitBtn;
	
	@FindBy(css = "#aui_3_4_0_1_671")
	WebElement importCloseBtn;
	
	
}
