package com.buffalocart.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long PAGE_LOAD_WAIT = 20;
	public static final long EXPLICIT_WAIT = 20;
	public static final long IMPLICIT_WAIT = 20;

	public enum LocatorType {
		Id, Xpath, Cssselector, Name, Classname, Tagname, Linktext, Partiallinktext
	}

	public void waitForElement(WebDriver driver, String target, Enum locatortype) {
		WebDriverWait wait = new WebDriverWait(driver, TimeUnit.SECONDS.toSeconds(EXPLICIT_WAIT));
		if (locatortype.equals(LocatorType.Id)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
		} else if (locatortype.equals(LocatorType.Xpath)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
		}
	}
}
