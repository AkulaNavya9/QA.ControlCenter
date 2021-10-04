package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Robots_Schedule {
	
	@FindBy(id = "showScheduler")
	WebElement addScheduleBtn ;
	
	@FindBy(xpath = "//*[@id=\"cmbProcess\"]")
	WebElement ddSelectProcess;
	
	@FindBy(xpath = "//input[@class='form-control required requiredInputs']")
	WebElement value;
	
	@FindBy(xpath = "//*[@id=\"preferredRobots\"]")
	WebElement ddPreferredRobot;
	
	@FindBy(id = "executeOnPreferredBot")
	WebElement cbPreferredRobot;
	
	@FindBy(xpath = "//*[@id=\"now\"]")
	WebElement scheduleNow;
	
	@FindBy(xpath = "//*[@id=\"minute\"]")
	WebElement scheduleMinute;
	
	@FindBy(xpath = "//*[@id=\"once\"]")
	WebElement scheduleOnce;
	
	@FindBy(xpath = "//*[@id=\"hour\"]")
	WebElement scheduleHourly;
	
	@FindBy(xpath = "//*[@id=\"daily\"]")
	WebElement scheduleDaily;
	
	@FindBy(xpath = "//*[@id=\"weekly\"]")
	WebElement scheduleWeekly;
	
	@FindBy(xpath = "//*[@id=\"monthly\"]")
	WebElement scheduleMonthly;
	
	@FindBy(id = "scheduleProcessButton")
	WebElement scheduleProcessBtn;
	
	@FindBy(xpath = "//button[@id='aui_3_4_0_1_572']")
	WebElement cancelBtn;
	
	@FindBy(xpath = "//*[@id=\"cmbPriorities\"]")
	WebElement ddPriority;
	
	@FindBy(xpath = "//*[@id=\"LogLevel\"]")
	WebElement ddLogLevel;
	
	@FindBy(xpath = "//*[@id=\"RetryCount\"]")
	WebElement ddRetryCount;
	
	@FindBy(id = "FailureReceipients")
	WebElement additionalReciepients;
	
}
