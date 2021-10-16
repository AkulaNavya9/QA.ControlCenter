package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;

import testBase.Base;

public class CC_Robots_Schedule {
	
	private static CommonMethods common = new CommonMethods();
	

	public  CC_Robots_Schedule()

	{
		PageFactory.initElements(Base.getDriver(), this);
	}
	
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
	
	@FindBy(css = "input[id='recursionDate']")
	WebElement startsOn;
	
	@FindBy(css = "input[id='never']")
	WebElement expiresOn;
	
	@FindBy(css = "input[id='on']")
	WebElement expiresNever;
	
	@FindBy(css = "input[id='dnrDay']")
	WebElement dnrDays;
	
	@FindBy (css="select[id='dnrDaySelect']")
	WebElement ddDnrDays;
	
	@FindBy(css = "input[id='drnDate']")
	WebElement dnrDates;
	
	@FindBy (css = "input[id='fromDateInput']")
	WebElement dnrDatesfromDate;
	
	@FindBy (css="input[id='toDateInput']")
	WebElement dnrDatesToDate;
	
	@FindBy (css = "input[id='RecursionHours']")
	WebElement perHours;
	
	@FindBy(xpath = "//*[@id=\"weekly\"]")
	WebElement scheduleWeekly;
	
	@FindBy (css= "select[id='dayofWeek']")
	WebElement ddDayOfWeek;
	
	@FindBy(xpath = "//*[@id=\"monthly\"]")
	WebElement scheduleMonthly;
	
	@FindBy ( css = "input[id='cron']")
	WebElement advanceSchedule;
	
	@FindBy ( css="input[id='cronExp']")
	WebElement cronExp;
	
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
	
	
	public void addScheduleNow()
	{
		try {
			common.clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		common.sendKeys(value, "schedule now");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(scheduleNow);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
	
	public void addScheduleOnce()
	{
		try {
			common.clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		common.sendKeys(value, "schedule once");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(scheduleOnce);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		common.sendKeys(startsOn, "11/10/2021 20:00");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			common.clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
	
	public void addScheduleDaily()
	{
		try {
			common.clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		common.sendKeys(value, "schedule Daily");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(scheduleDaily);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		common.sendKeys(startsOn, "11/10/2021 20:00");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			common.clickButton(expiresNever);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(dnrDays);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	
	}
	
	public void addScheduleHourly()
	{
		try {
			common.clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		common.sendKeys(value, "schedule Hourly");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(scheduleHourly);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		common.sendKeys(startsOn, "11/10/2021 20:30");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			common.clickButton(expiresNever);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		common.sendKeys(perHours, "1");
		try {
			common.clickButton(dnrDays);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
	
	public void addScheduleWeekly()
	{
		try {
			common.clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		common.sendKeys(value, "schedule Weekly");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(scheduleWeekly);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		common.sendKeys(startsOn, "11/10/2021 21:00");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			common.clickButton(ddDayOfWeek);
		} catch (InterruptedException e1) {
			Thread.currentThread().interrupt();
			e1.printStackTrace();
		}
		Select ddDay = new Select(ddDayOfWeek);
		ddDay.selectByValue("Wednesday");
		
		
		try {
			common.clickButton(expiresNever);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(dnrDates);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		common.sendKeys(dnrDatesfromDate, "13/10/2021");
		common.sendKeys(dnrDatesToDate, "14/10/2021");
		try {
			common.clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
	
	public void scheduleAdvanced()
	{
		try {
			common.clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			common.clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		common.sendKeys(value, "schedule Advanced");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(advanceSchedule);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		common.sendKeys(cronExp, "enter cron expression");
		common.scrollBarDown("400", 0);
		try {
			common.clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		
	}
	
}
