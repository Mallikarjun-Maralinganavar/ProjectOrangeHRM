package com.pageactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.OrangeHRMLoginLocator;
import com.utils.DriverClass;

public class OrangeHRMLoginPageActions {
	OrangeHRMLoginLocator loginPageLocators = null;
	String strUserName, strPassWord;
	
	public OrangeHRMLoginPageActions() {
		this.loginPageLocators = new OrangeHRMLoginLocator();
		
		PageFactory.initElements(DriverClass.getDriver(), loginPageLocators);
	}
	
	public void setUserName(String usname) {
		loginPageLocators.UserName.sendKeys(usname);
	}
	
	public void setPassWord(String psw) {
		loginPageLocators.passWord.sendKeys(psw);
	}
	
	public void setLoingbtn() {
		loginPageLocators.clickBtn.click();
	}
	
	public void setLogOut() {
		loginPageLocators.clikProfile.click();
		loginPageLocators.clickLogout.click();
	}
	
	public void login(String userName,String passWord) {
	    
	    this.setUserName(userName);
	    this.setPassWord(passWord);
	}
	
}
