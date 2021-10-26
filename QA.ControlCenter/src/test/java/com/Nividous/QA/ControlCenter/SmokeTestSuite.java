package com.Nividous.QA.ControlCenter;



import java.util.HashMap;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.*;


import testBase.*;

import com.Nividous.QA.ControlCenter.CommonMethods.ExcelOperations;

public class SmokeTestSuite extends Base{
	
	@BeforeSuite
	void domConfiguration() {
		DOMConfigurator.configure("log4j2.xml");
		System.out.println("Dom Configured ----------------------");
	}
	
	

	ExcelOperations excel = new ExcelOperations("SmokeTestSuite");
	
	@DataProvider (name="CronData")
	public Object[][] testDataSupplier(){
		Object[][] obj = new Object[excel.getRowCount()][1];
		for(int i=1; i<=excel.getRowCount(); i++)
		{
			HashMap<String, String> testData = excel.getTestDataInMap(i);
			obj[i-1][0]= testData;
		}
		return obj;
	}
	
	
//	
//	@Test
//	void scheduleNow_007()
//	{
//		
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addScheduleNow();
//		Base.getDriver().close();
//		
//	}
//	
//	@Test
//	void scheduleOnce_008()
//	{
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addScheduleOnce();
//		Base.getDriver().close();
//	}
//	
////	@Test
////	void scheduleMinutes_009()
////	{
////		CC_Login.getSingletonlogin().enterUsername();
////		CC_Login.getSingletonlogin().enterPassword();
////		CC_Login.getSingletonlogin().clickLogin();
////		CC_Home.getSingletonHome().hoverrobotmenu();
////		CC_Home.getSingletonHome().clickddRobotSchedule();
////		CC_Robots_Schedule.getSingletonrobschedule().addSchedule;
////		Base.getDriver().close();
////	}
//	
//	@Test
//	void scheduleDaily_010()
//	{
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addScheduleDaily();
//		Base.getDriver().close();
//	}
//	
//	@Test
//	void scheduleHourly_011()
//	{
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addScheduleHourly();
//		Base.getDriver().close();
//	}
//	
//	@Test
//	void scheduleWeekly_012()
//	{
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addScheduleWeekly();
//		Base.getDriver().close();
//	}
	
//	@Test
//	void scheduleMonthly_013()
//	{
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addSchedule();
//		Base.getDriver().close();
//	}
	
	@Test (dataProvider="CronData")
	void scheduleAdvanced_014(Object cronobj)
	{
		HashMap<String, String> testData = (HashMap<String, String>) cronobj;
		System.out.println(testData);
//		CC_Login.getSingletonlogin().enterUsername();
//		CC_Login.getSingletonlogin().enterPassword();
//		CC_Login.getSingletonlogin().clickLogin();
//		CC_Home.getSingletonHome().hoverrobotmenu();
//		CC_Home.getSingletonHome().clickddRobotSchedule();
//		CC_Robots_Schedule.getSingletonrobschedule().addscheduleAdvanced();
//		Base.getDriver().close();
	}
	
	
	
	
	
	}

	

