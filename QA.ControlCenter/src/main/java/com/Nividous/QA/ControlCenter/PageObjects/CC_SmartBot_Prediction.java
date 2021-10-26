package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_SmartBot_Prediction {
	
	public static CC_SmartBot_Prediction smartbotpred = getSingletonsmartbotpred();
	
	public static CC_SmartBot_Prediction getSingletonsmartbotpred()
	{
	if (smartbotpred == null) {
		synchronized (CC_SmartBot_Prediction.class) {
			if (smartbotpred == null) {
				smartbotpred = new CC_SmartBot_Prediction();// instance will be created at request time
			}
		}
	}
	return smartbotpred;
}

	
	@FindBy(css = "#aui_3_4_0_1_1324")
	WebElement createPredictorBtn;
	
	@FindBy(css = "#addtionWayCreate")
	WebElement addPredictorRadioBtn;
	
	@FindBy(css = "#addtionWayImport")
	WebElement importPredictorRadioBtn;
	
	@FindBy(css = "#predictorName")
	WebElement predictorName	;
	
	@FindBy(css = "#file_1")
	WebElement predictorChooseFileBtn;
	
	@FindBy(css = "#description")
	WebElement PredictorDesc;
	
	@FindBy(css = "#aui_3_4_0_1_1543")
	WebElement submitBtn;
	
	@FindBy(css = "#aui_3_4_0_1_1561")
	WebElement closeBtn;
	
	
}
