package com.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uistore.RegistrationUI;


public class RegistrationPageObject {
	
	public static void Register(WebDriver driver) {
		driver.findElement(RegistrationUI.Registration).click();
	}
		public static void Signnow(WebDriver driver) {
		 try {
		         driver.findElement(RegistrationUI.SignUp).click();
		    } catch (org.openqa.selenium.StaleElementReferenceException e) {
		        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(driver.findElement(RegistrationUI.SignUp)));
		        driver.findElement(RegistrationUI.SignUp).click();
		    }
		
	}
	public static void SignnowInput(WebDriver driver,String Firstname,String Email,String Password) {
		
		driver.findElement(RegistrationUI.Firstname).sendKeys(Firstname);
		driver.findElement(RegistrationUI.Email).sendKeys(Email);
		driver.findElement(RegistrationUI.Password).sendKeys(Password);
	}
	
	public static void CreateAccount(WebDriver driver) {
		
			driver.findElement(RegistrationUI.CreateAccount).click();
	
	}
	public static boolean InvalidCreateAccount(WebDriver driver) {
		
		return driver.findElement(RegistrationUI.CreateAccount).isDisplayed();
		
		
	}
	public static void Login(WebDriver driver) {
		
			driver.findElement(RegistrationUI.Login).click();
		
		
		}
		
	public static void LoginInput(WebDriver driver,String Email,String Password ) {
		
		driver.findElement(RegistrationUI.LoginEmail).sendKeys(Email);
		driver.findElement(RegistrationUI.LoginPassword).sendKeys(Password);
	}
	
	public static void EndLogin(WebDriver driver) {
		
		driver.findElement(RegistrationUI.EndLogin).click();
		
	}
	public static boolean InvalidEndLogin(WebDriver driver) {
		return driver.findElement(RegistrationUI.EndLogin).isDisplayed();
		
		
	}

}
