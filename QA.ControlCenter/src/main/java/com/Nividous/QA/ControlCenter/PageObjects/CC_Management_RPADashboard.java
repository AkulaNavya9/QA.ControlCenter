package com.Nividous.QA.ControlCenter.PageObjects;

public class CC_Management_RPADashboard {

	public static CC_Management_RPADashboard rpadash = getSingletonrpadash();
	
	public static CC_Management_RPADashboard getSingletonrpadash()
	{
	if (rpadash == null) {
		synchronized (CC_Management_RPADashboard.class) {
			if (rpadash == null) {
				rpadash = new CC_Management_RPADashboard();// instance will be created at request time
			}
		}
	}
	return rpadash;
}
	
}
