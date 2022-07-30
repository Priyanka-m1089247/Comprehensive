package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.uistore.BounceUI;

public class BouncePageObject {

	public static void bounce(WebDriver driver) {
		driver.findElement(BounceUI.bounce).click();
	}
	public static void Search(WebDriver driver, String strArg2) {	
		driver.findElement(BounceUI.search).click();
		driver.findElement(BounceUI.searchbox).sendKeys(strArg2);
	}
	public static void Product(WebDriver driver) {
		driver.findElement(BounceUI.producttext).click();
		
	}
}
