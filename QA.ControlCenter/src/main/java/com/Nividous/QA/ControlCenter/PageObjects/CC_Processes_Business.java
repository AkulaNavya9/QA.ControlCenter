package com.Nividous.QA.ControlCenter.PageObjects;

import  com.Nividous.QA.ControlCenter.*;
import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;

import testBase.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CC_Processes_Business {

	
	
	public CC_Processes_Business()

	{
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	
	public static CC_Processes_Business procbus = getSingletonprocbus();
	
	public static CC_Processes_Business getSingletonprocbus()
	{
	if (procbus == null) {
		synchronized (CC_Processes_Business.class) {
			if (procbus == null) {
				procbus = new CC_Processes_Business();// instance will be created at request time
			}
		}
	}
	return procbus;
}
	
	@FindBy ( id = "deployButton")
	WebElement homeDeployBtn;
	
	@FindBy ( id = "advanceSearchBtn")
	WebElement customFilterBtn;
	
	@FindBy ( id = "reloadButton")
	WebElement reloadBtn;
	
	@FindBy ( id = "file")
	WebElement browseBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-default']")
	WebElement closeBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-primary']")
	WebElement deployBtn;
	
	@FindBy ( xpath = "//*[@name='builder-basic_rule_0_filter']")
	WebElement ddFilter;
	
	@FindBy (css = "input[name='builder-basic_rule_0_value_0']")
	WebElement beginsWith;
	
	@FindBy ( id = "applySearch")
	WebElement filterApplyBtn;
	
	@FindBy ( id = "btn-reset")
	WebElement filterResetBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-xs btn-danger']")
	WebElement filterDeleteBtn;
	
	@FindBy ( xpath = "//*[@class='btn btn-xs btn-success']")
	WebElement addRuleBtn;
	
	public void clickHomeDeply() 
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(homeDeployBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(browseBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		//need to add code to read external files from file explorer
				try {
					CommonMethods.getSingletonCommon().clickButton(closeBtn);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
				try {
					CommonMethods.getSingletonCommon().clickButton(deployBtn);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
	}
		
	public void customFilter()
	{
		try {
			CommonMethods.getSingletonCommon().clickButton(customFilterBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(ddFilter);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddprocess = new Select(ddFilter);
		
		ddprocess.selectByValue("name");
		
		CommonMethods.getSingletonCommon().sendKeys(beginsWith, "demo");
		try {
			CommonMethods.getSingletonCommon().clickButton(filterApplyBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(addRuleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(ddFilter);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		ddprocess.selectByValue("version");
		
		CommonMethods.getSingletonCommon().sendKeys(beginsWith, "demo1");
		try {
			CommonMethods.getSingletonCommon().clickButton(filterApplyBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			CommonMethods.getSingletonCommon().clickButton(filterDeleteBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
		
}
		
	
		
		
		
		
	
		
	
	
	
	
	
