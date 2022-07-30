package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.uistore.PandGUI;

public class PandGPageObject {

	public static void PandG(WebDriver driver) {
		driver.findElement(PandGUI.PandG).click();
	}
public static void Ourproducts(WebDriver driver) {
		
		Actions a=new Actions(driver);
		WebElement ele=driver.findElement(PandGUI.Ourbrands);
		a.moveToElement(ele).perform();
	}
	public static void Fragrance(WebDriver driver) {
		
		driver.findElement(PandGUI.Fragrance).click();
	}
}
