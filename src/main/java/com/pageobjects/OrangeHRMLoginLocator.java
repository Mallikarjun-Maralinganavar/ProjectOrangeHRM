package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMLoginLocator {
	@FindBy(name="username") 
	public static WebElement UserName;
	
	@FindBy(name="password") 
	public static WebElement passWord;
	
	@FindBy(xpath="//button[@type=\"submit\"]") 
	public static WebElement clickBtn;
	
	@FindBy(xpath = "//img[@alt='profile picture']")
	public static WebElement clikProfile;
	
	@FindBy(partialLinkText ="Logout")
	public static WebElement clickLogout;
}
