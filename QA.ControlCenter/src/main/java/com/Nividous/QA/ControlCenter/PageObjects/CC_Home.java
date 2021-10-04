package com.Nividous.QA.ControlCenter.PageObjects;

import testBase.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CC_Home extends Base{
 
	public CC_Home() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath = "//a[@title='My Tasks']/child::img[@alt='Page Icon']")
	WebElement lblMenuddMyTasks;
	
	@FindBy(xpath = "//a[@href ='http://localhost:8080/group/rpa/robots']/child::img[@alt='Page Icon']")
	WebElement lblMenuddRobot;
	
	@FindBy(css = "//a[@href = 'http://localhost:8080/group/rpa/robots']")
	WebElement ddMenuddRobotsCCAudit;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/schedule-process']")
	WebElement ddMenuRobotsSchedule;
	
	@FindBy(css = "a[href='http://localhost:8080/group/rpa/vault']")
	WebElement ddMenuRobotsVault;
	
	@FindBy(css = "a[title ='Processes']")
	WebElement lblMenuddProcesses;
	
	@FindBy(css = "a[href='http://localhost:8080/group/rpa/robotic']")
	WebElement ddMenuProcessesRobotic;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/business']")
	WebElement ddMenuProcessesBusiness;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/repository']")
	WebElement ddMenuProcessesRepository;
	
	@FindBy(css = "a[title ='Management']")
	WebElement lblMenuManagement;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/rpa-dashboard']")
	WebElement ddMenuMngmntRPADashboard;
	
	@FindBy(css = "http://localhost:8080/group/rpa/business-dashboard']")
	WebElement ddMenuMngmntBusDashboard;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/reports']")
	WebElement ddMenuMngmntRpts;
	
	@FindBy(css = "a[title='Smart Bot']")
	WebElement lblMenuSmartBot;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/cv-template']")
	WebElement ddMenuSmartBotCVTmplt;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/text-classification']")
	WebElement ddMenuSmartBotCVTxtCls;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/entity-recognition']")
	WebElement ddMenuSmartBotEntyRec;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/prediction']")
	WebElement ddMenuSmartBotPred;
	
	@FindBy(css = "a[title='Administration']")
	WebElement lblMenuAdministration;
	
	@FindBy(css = "a[href ='/c/portal/logout']")
	WebElement linkSignOut;
	
	@FindBy(xpath = "//a[@title='Help']/child::img[@alt='Page Icon']")
	WebElement lblMenuHelp;
	
	@FindBy(css = "a[href ='http://localhost:8080/user-guide/'][class='active']")
	WebElement ddMenuHelpUserGuide;
	
	@FindBy(css = "a[href ='http://localhost:8080/admin-guide/']")
	WebElement ddMenuHelpAdminGuide;
	
	
	
	
}
