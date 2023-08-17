package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.Adactin_BaseClass;

public class LoginPage_Locators extends Adactin_BaseClass {
	
	public static WebElement username_locator(){
		return driver.findElement(By.id("username"));
		
	}
	public static WebElement password_locator(){
		return driver.findElement(By.id("password"));
		
	}
	public static WebElement login_locator(){
		return driver.findElement(By.id("login"));
		
	}
}
