package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PageUtility;


public class LoginPage {
	WebDriver driver;
/***pageconstructor***/ 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*** WebElements ***/
	private final String _email = "username";
	@FindBy(id = _email)
	private WebElement username;
	
	private final String _password = "password";
	@FindBy(id = _password)
	private WebElement pass;
	
	private final String _login="button[class='btn btn-primary']";
	@FindBy(css=_login)
	private WebElement login;
	/*** Useraction Methods ***/
	
	public String getLoginpageTitle() {
		return PageUtility.getPageTitle(driver);
	}
	public void  enterusername(String uname) {
		PageUtility.enterText(username, uname);
		}
	public void enterpassword(String password) {
		PageUtility.enterText(pass, password);
	}
	public HomePage clickOnLoginButton() {
		PageUtility.clickOnElement(login);
		return new HomePage(driver);
		
	}
	
}
