package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uistore.RegistrationUI;
import com.uistore.SearchUI;

public class SearchPageObject {

	public static void Search(WebDriver driver) {
		driver.findElement(SearchUI.Searchbox).click();
	}
	public static void Entertext(WebDriver driver,String strArg1) {
		driver.findElement(SearchUI.Searchbox).sendKeys(strArg1);
		driver.findElement(SearchUI.Searchbox).sendKeys(Keys.ENTER);
		driver.findElement(SearchUI.Popup).click();
		 driver.findElement(SearchUI.hygenic).click();
	    
	}
	
}
