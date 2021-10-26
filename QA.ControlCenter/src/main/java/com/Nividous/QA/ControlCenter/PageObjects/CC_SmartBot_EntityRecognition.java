package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_SmartBot_EntityRecognition {
	
	public static CC_SmartBot_EntityRecognition smartbotEntRec = getSingletonsmartbotEntRec();
	
	public static CC_SmartBot_EntityRecognition getSingletonsmartbotEntRec()
	{
	if (smartbotEntRec == null) {
		synchronized (CC_SmartBot_EntityRecognition.class) {
			if (smartbotEntRec == null) {
				smartbotEntRec = new CC_SmartBot_EntityRecognition();// instance will be created at request time
			}
		}
	}
	return smartbotEntRec;
}

	@FindBy(css = "#aui_3_4_0_1_1303")
	WebElement createEntityRecognizerBtn;
	
	@FindBy(css = "#addtionWayCreate")
	WebElement addEntityRecognizerBtn;
	
	@FindBy(css = "#addtionWayImport")
	WebElement importEntityRecognizerBtn;
	
	@FindBy(css = "#recognizerName")
	WebElement createEntityRecognizerName;
	
	@FindBy(css = "#file_1")
	WebElement createEntityrecognizerChooseFileBtn;
	
	@FindBy(css = "#description")
	WebElement createEntityRecognizerDesc;
	
	@FindBy(css = "#aui_3_4_0_1_1507")
	WebElement closeBtn;
	
	@FindBy(css = "#recognizerName")
	WebElement importEntityRecognizerName;
	
	@FindBy(css = "#file_1")
	WebElement importChooseFileBtn;
	
	@FindBy(css = "#description")
	WebElement importDesc;
	
	@FindBy(css = "#aui_3_4_0_1_1488")
	WebElement submitBtn;
	
	
}
