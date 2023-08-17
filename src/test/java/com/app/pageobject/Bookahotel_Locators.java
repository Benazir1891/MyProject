package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Bookahotel_Locators extends SelectHotel_Locatros {
	public static WebElement firstname_locator() {
		return driver.findElement(By.id("first_name"));
	}
	public static WebElement lastname_locator() {
		return driver.findElement(By.id("last_name"));
	}
	public static WebElement billadd_locator() {
		return driver.findElement(By.id("address"));
	}
	public static WebElement creditcard_locator() {
		return driver.findElement(By.id("cc_num"));
	}
	public static WebElement cardtype_locator() {
		return driver.findElement(By.id("cc_type"));
	}
	public static WebElement expmonth_locator() {
		return driver.findElement(By.id("cc_exp_month"));
	}
	public static WebElement expyear_locator() {
		return driver.findElement(By.id("cc_exp_year"));
	}
	public static WebElement cvvno_locator() {
		return driver.findElement(By.id("cc_cvv"));
	}
	public static WebElement booking_locator() {
		return driver.findElement(By.id("book_now"));
	}
}
