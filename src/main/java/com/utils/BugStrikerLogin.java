package com.utils;

import com.pageactions.OrangeHRMLoginPageActions;

public class BugStrikerLogin {
	
	OrangeHRMLoginPageActions loginBS = new OrangeHRMLoginPageActions();
	OrangeHRMLoginPageActions logoutBS = new OrangeHRMLoginPageActions();
	
	public void setLoginBS() {
		loginBS.login("Bug Striker","admin123");
		loginBS.setLoingbtn();
	}
	
	public void setLogoutBS() {
		logoutBS.setLogOut();
	}
}
