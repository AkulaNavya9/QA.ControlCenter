package com.Nividous.QA.ControlCenter.PageObjects;

import testBase.*;
import com.Nividous.QA.ControlCenter.CommonMethods.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CC_Home extends Base{
	
	private static CommonMethods common = new CommonMethods();
	
	public CC_Home() {
		PageFactory.initElements(Base.getDriver(), this);
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
		common.moveToElement(lblMenuRobot);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverProcessesmenu() {
		try {
		common.moveToElement(lblMenuProcesses);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverManagementmenu() {
		try {
		common.moveToElement(lblMenuManagement);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverSmartBotmenu() {
		try {
		common.moveToElement(lblMenuSmartBot);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverAdministrationmenu() {
		try {
		common.moveToElement(lblMenuAdministration);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverHelpmenu() {
		try {
		common.moveToElement(lblMenuHelp);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void hoverGoTo() {
		try {
		common.moveToElement(lblGoTo);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddRobotCCAudit() {
		try {
		common.clickButton(ddMenuddRobotsCCAudit);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddRobotSchedule() {
		try {
		common.clickButton(ddMenuRobotsSchedule);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddRobotVault() {
		try {
		common.clickButton(ddMenuRobotsVault);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddProcessesRobotic() {
		try {
		common.clickButton(ddMenuProcessesRobotic);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddProcessesBusiness() {
		try {
		common.clickButton(ddMenuProcessesBusiness);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddProcessesRepository() {
		try {
		common.clickButton(ddMenuProcessesRepository);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMngmntRPADashboard() {
		try {
		common.clickButton(ddMenuMngmntRPADashboard);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	
	public void clickddMngmntBusDashboard() {
		try {
		common.clickButton(ddMenuMngmntBusDashboard);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMngmntRpts() {
		try {
		common.clickButton(ddMenuMngmntRpts);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}

	public void clickddMenuSmartBotCVTmplt() {
		try {
		common.clickButton(ddMenuSmartBotCVTmplt);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMenuSmartBotCVTxtCls() {
		try {
		common.clickButton(ddMenuSmartBotCVTxtCls);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMenuSmartBotEntyRec() {
		try {
		common.clickButton(ddMenuSmartBotEntyRec);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddMenuSmartBotPred() {
		try {
		common.clickButton(ddMenuSmartBotPred);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
	public void clickddGoToControlPanel() {
		try {
		common.clickButton(ddGoToControlPanel);
		}
		catch(InterruptedException e) { 
			   Thread.currentThread().interrupt(); 
			}
	}
	
}
