package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignoutPage {
	WebDriver driver;

	public SignoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
