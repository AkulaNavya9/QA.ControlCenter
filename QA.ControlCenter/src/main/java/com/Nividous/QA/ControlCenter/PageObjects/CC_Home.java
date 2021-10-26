package com.Nividous.QA.ControlCenter.PageObjects;

import testBase.*;
import com.Nividous.QA.ControlCenter.CommonMethods.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CC_Home extends Base{
	
	
	
	public CC_Home() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	public static CC_Home home = getSingletonHome();
	
	public static CC_Home getSingletonHome()
	{
	if (home == null) {
		synchronized (CC_Home.class) {
			if (home == null) {
				home = new CC_Home();// instance will be created at request time
			}
		}
	}
	return home;
}
	
	@FindBy(xpath = "//a[@title='My Tasks']/child::img[@alt='Page Icon']")
	WebElement lblMenuMyTasks;
	
	@FindBy(xpath = "//a[@href ='http://localhost:8080/group/rpa/robots']/child::img[@alt='Page Icon']")
	WebElement lblMenuRobot;
	
	@FindBy(css = "//a[@href = 'http://localhost:8080/group/rpa/robots']")
	WebElement ddMenuddRobotsCCAudit;
	
	@FindBy(css = "a[href ='http://localhost:8080/group/rpa/schedule-process']")
	WebElement ddMenuRobotsSchedule;
	
	@FindBy(css = "a[href='http://localhost:8080/group/rpa/vault']")
	WebElement ddMenuRobotsVault;
	
	@FindBy(css = "a[title ='Processes']")
	WebElement lblMenuProcesses;
	
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
	
	@FindBy(xpath = "//*[@id='_145_mySites']/a/span")
	WebElement lblGoTo;
	
	@FindBy(css =".site-name")
	WebElement ddGoToControlPanel;
	
		public void hoverrobotmenu() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblMenuRobot);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverProcessesmenu() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblMenuProcesses);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverManagementmenu() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblMenuManagement);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverSmartBotmenu() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblMenuSmartBot);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverAdministrationmenu() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblMenuAdministration);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverHelpmenu() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblMenuHelp);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverGoTo() {
		try {
		CommonMethods.getSingletonCommon().moveToElement(lblGoTo);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddRobotCCAudit() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuddRobotsCCAudit);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddRobotSchedule() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuRobotsSchedule);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddRobotVault() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuRobotsVault);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddProcessesRobotic() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuProcessesRobotic);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddProcessesBusiness() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuProcessesBusiness);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddProcessesRepository() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuProcessesRepository);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMngmntRPADashboard() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuMngmntRPADashboard);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	
	public void clickddMngmntBusDashboard() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuMngmntBusDashboard);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMngmntRpts() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuMngmntRpts);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}

	public void clickddMenuSmartBotCVTmplt() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuSmartBotCVTmplt);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMenuSmartBotCVTxtCls() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuSmartBotCVTxtCls);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMenuSmartBotEntyRec() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuSmartBotEntyRec);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMenuSmartBotPred() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddMenuSmartBotPred);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddGoToControlPanel() {
		try {
		CommonMethods.getSingletonCommon().clickButton(ddGoToControlPanel);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
}
