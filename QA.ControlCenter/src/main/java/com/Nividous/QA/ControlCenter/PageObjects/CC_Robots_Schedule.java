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
	
	
	

	public  CC_Robots_Schedule()

	{
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public static CC_Robots_Schedule robschedule = getSingletonrobschedule();
	
	public static CC_Robots_Schedule getSingletonrobschedule()
	{
	if (robschedule == null) {
		synchronized (CC_Robots_Schedule.class) {
			if (robschedule == null) {
				robschedule = new CC_Robots_Schedule();// instance will be created at request time
			}
		}
	}
	return robschedule;
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
			CommonMethods.getSingletonCommon().clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		CommonMethods.getSingletonCommon().sendKeys(value, "schedule now");
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleNow);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
	
	public void addScheduleOnce()
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		CommonMethods.getSingletonCommon().sendKeys(value, "schedule once");
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleOnce);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		CommonMethods.getSingletonCommon().sendKeys(startsOn, "11/10/2021 20:00");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
	
	public void addScheduleDaily()
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		CommonMethods.getSingletonCommon().sendKeys(value, "schedule Daily");
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleDaily);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		CommonMethods.getSingletonCommon().sendKeys(startsOn, "11/10/2021 20:00");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			CommonMethods.getSingletonCommon().clickButton(expiresNever);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(dnrDays);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	
	}
	
	public void addScheduleHourly()
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		CommonMethods.getSingletonCommon().sendKeys(value, "schedule Hourly");
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleHourly);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		CommonMethods.getSingletonCommon().sendKeys(startsOn, "11/10/2021 20:30");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			CommonMethods.getSingletonCommon().clickButton(expiresNever);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		CommonMethods.getSingletonCommon().sendKeys(perHours, "1");
		try {
			CommonMethods.getSingletonCommon().clickButton(dnrDays);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
	}
	
	public void addScheduleWeekly()
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		CommonMethods.getSingletonCommon().sendKeys(value, "schedule Weekly");
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleWeekly);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		CommonMethods.getSingletonCommon().sendKeys(startsOn, "11/10/2021 21:00");//Mention date and time in dd/mm/yyyy hours:minutes(24 hour format)
		try {
			CommonMethods.getSingletonCommon().clickButton(ddDayOfWeek);
		} catch (InterruptedException e1) {
			Thread.currentThread().interrupt();
			e1.printStackTrace();
		}
		Select ddDay = new Select(ddDayOfWeek);
		ddDay.selectByValue("Wednesday");
		
		
		try {
			CommonMethods.getSingletonCommon().clickButton(expiresNever);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(dnrDates);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		CommonMethods.getSingletonCommon().sendKeys(dnrDatesfromDate, "13/10/2021");
		CommonMethods.getSingletonCommon().sendKeys(dnrDatesToDate, "14/10/2021");
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
	
	public void addscheduleAdvanced(String cronexpression)
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(addScheduleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		try {
			CommonMethods.getSingletonCommon().clickButton(ddSelectProcess);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddProcess = new Select(ddSelectProcess);
		ddProcess.selectByIndex(1);
		
		CommonMethods.getSingletonCommon().sendKeys(value, "schedule Advanced");
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(advanceSchedule);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		CommonMethods.getSingletonCommon().sendKeys(cronExp, cronexpression);
		CommonMethods.getSingletonCommon().scrollBarDown("400", 0);
		try {
			CommonMethods.getSingletonCommon().clickButton(scheduleProcessBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		
		
	}
	
}
