package com.Nividous.QA.ControlCenter.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CC_Management_Reports {

	@FindBy(id = "createReport")
	WebElement createReportBtn;
	
	@FindBy(id = "uploadReportBtn")
	WebElement uploadReportBtn;
	
	@FindBy(id = "advanceSearchBtn")
	WebElement customFilterBtn;
	
	@FindBy(id = "exportButton")
	WebElement reloadBtn;
	
	@FindBy(css = "//*[@id=\"a[href='http://localhost:8080/group/rpa/reports?p_p_auth=aI5dVRAL&p_p_id=Jpivot_WAR_advisorReports&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_Jpivot_WAR_advisorReports_create=false&_Jpivot_WAR_advisorReports_update=true&_Jpivot_WAR_advisorReports_reportId=3&_Jpivot_WAR_advisorReports_mode=reportview&repId=3']")
	WebElement instanceReport;
	
	
	@FindBy(css = "a[href='http://localhost:8080/group/rpa/reports?p_p_auth=aI5dVRAL&p_p_id=Jpivot_WAR_advisorReports&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_Jpivot_WAR_advisorReports_create=false&_Jpivot_WAR_advisorReports_update=true&_Jpivot_WAR_advisorReports_reportId=2&_Jpivot_WAR_advisorReports_mode=reportview&repId=2']")
	WebElement taskReport;
	
	@FindBy(css = "a[href='http://localhost:8080/group/rpa/reports?p_p_auth=aI5dVRAL&p_p_id=Jpivot_WAR_advisorReports&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&_Jpivot_WAR_advisorReports_create=false&_Jpivot_WAR_advisorReports_update=true&_Jpivot_WAR_advisorReports_reportId=1&_Jpivot_WAR_advisorReports_mode=reportview&repId=1']")
	WebElement processReport;
	
	@FindBy(css = ".fa.fa-edit.custom")
	WebElement editBtn;
	
	@FindBy(css = ".fa.fa-trash-o.custom")
	WebElement trashBtn;
	
	@FindBy(css = ".fa.fa-files-o.custom")
	WebElement copyBtn;
	
	
}
