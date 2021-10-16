package com.Nividous.QA.ControlCenter.PageObjects;

import  com.Nividous.QA.ControlCenter.*;
import com.Nividous.QA.ControlCenter.CommonMethods.CommonMethods;

import testBase.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CC_Processes_Business {

	private static CommonMethods common = new CommonMethods();
	
	public CC_Processes_Business()

	{
		PageFactory.initElements(Base.getDriver(), this);
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
			common.clickButton(homeDeployBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(browseBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		//need to add code to read external files from file explorer
				try {
					common.clickButton(closeBtn);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
				try {
					common.clickButton(deployBtn);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					e.printStackTrace();
				}
	}
		
	public void customFilter()
	{
		try {
			common.clickButton(customFilterBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(ddFilter);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		Select ddprocess = new Select(ddFilter);
		
		ddprocess.selectByValue("name");
		
		common.sendKeys(beginsWith, "demo");
		try {
			common.clickButton(filterApplyBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(addRuleBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(ddFilter);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		ddprocess.selectByValue("version");
		
		common.sendKeys(beginsWith, "demo1");
		try {
			common.clickButton(filterApplyBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		try {
			common.clickButton(filterDeleteBtn);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
	}
		
}
		
	
		
		
		
		
	
		
	
	
	
	
	
