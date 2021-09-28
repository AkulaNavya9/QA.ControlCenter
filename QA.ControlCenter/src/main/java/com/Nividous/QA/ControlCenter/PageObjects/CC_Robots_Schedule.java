package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Robots_Schedule {
	
	@FindBy(id = "showScheduler")
	WebElement addScheduleButton ;
	
	@FindBy(xpath = "//*[@id=\"cmbProcess\"]")
	WebElement selectProcessdropdown;
	
	@FindBy(xpath = "//input[@class='form-control required requiredInputs']")
	WebElement value;
	
	@FindBy(xpath = "//*[@id=\"preferredRobots\"]")
	WebElement PreferredRobotDrpDwn;
	
	@FindBy(id = "executeOnPreferredBot")
	WebElement PreferredRobotTickBox;
	
	@FindBy(xpath = "//*[@id=\"now\"]")
	WebElement ScheduleNow;
	
	@FindBy(xpath = "//*[@id=\"minute\"]")
	WebElement ScheduleMinute;
	
	@FindBy(xpath = "//*[@id=\"once\"]")
	WebElement ScheduleOnce;
	
	@FindBy(xpath = "//*[@id=\"hour\"]")
	WebElement ScheduleHourly;
	
	@FindBy(xpath = "//*[@id=\"daily\"]")
	WebElement ScheduleDaily;
	
	@FindBy(xpath = "//*[@id=\"weekly\"]")
	WebElement ScheduleWeekly;
	
	@FindBy(xpath = "//*[@id=\"monthly\"]")
	WebElement ScheduleMonthly;
	
	@FindBy(id = "scheduleProcessButton")
	WebElement ScheduleProcessButton;
	
	@FindBy(xpath = "//button[@id='aui_3_4_0_1_572']")
	WebElement CancelButton;
	
	@FindBy(xpath = "//*[@id=\"cmbPriorities\"]")
	WebElement PriorityDrpDwn;
	
	@FindBy(xpath = "//*[@id=\"LogLevel\"]")
	WebElement LogLevelDrpDwn;
	
	@FindBy(xpath = "//*[@id=\"RetryCount\"]")
	WebElement RetryCountDrpdwn;
	
	@FindBy(id = "FailureReceipients")
	WebElement AdditionalReciepients;
	
}
