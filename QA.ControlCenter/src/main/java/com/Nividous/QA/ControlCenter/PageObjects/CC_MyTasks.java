package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_MyTasks {
	
	public static CC_MyTasks mytask = getSingletonmytask();
	
	public static CC_MyTasks getSingletonmytask()
	{
	if (mytask == null) {
		synchronized (CC_MyTasks.class) {
			if (mytask == null) {
				mytask = new CC_MyTasks();// instance will be created at request time
			}
		}
	}
	return mytask;
}
	
	
	

	@FindBy (xpath ="//li[@class='list-group-item node-treeview1 node-selected']")
	WebElement mytaskBtn;
	
	@FindBy (css ="label[class='btn btn-default active']")
	WebElement tabularViewBtn;
	
	@FindBy (css ="label[class='btn btn-default']")
	WebElement calenderViewBtn;
	
	@FindBy (css ="a[id='advanceSearchBtn']")
	WebElement customFilterBtn;
	
	@FindBy (css ="a[id='reloadButton']")
	WebElement reloadBtn;
	
	@FindBy (css ="select[id='select-view']")
	WebElement ddCustomView;
	
	@FindBy (css ="button[id='btnAddView']")
	WebElement addBtn;
	
	@FindBy (css ="button[id='btnDelView']")
	WebElement deleteBtn;
	
	@FindBy (css ="button[id='btnEditView']")
	WebElement editBtn;
	
	@FindBy (css ="#aui_3_4_0_1_1631")
	WebElement reassignTaskBtn ;
	
	@FindBy (css ="select[name='taskList_length']")
	WebElement ddEntriesCount;
	
	@FindBy (css ="input[name='select_all']")
	WebElement selectAllChckBx;
	
	
	
	
}
