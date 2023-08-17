package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotel_Locators extends LoginPage_Locators {
	public static WebElement location_locator() {
		return driver.findElement(By.id("location"));
	}
	public static WebElement hotels_locator() {
		return driver.findElement(By.id("hotels"));
	}
	public static WebElement roomtype_locator() {
		return driver.findElement(By.id("room_type"));
	}
	public static WebElement noofrooms_locator() {
		return driver.findElement(By.id("room_nos"));
	}

	public static WebElement checkin_locator() {
		return driver.findElement(By.id("datepick_in"));
	}
	public static WebElement checkout_locator() {
		return driver.findElement(By.id("datepick_out"));
	}
	public static WebElement adults_locator() {
		return driver.findElement(By.id("adult_room"));
	}
	public static WebElement child_locator() {
		return driver.findElement(By.id("child_room"));
	}
	public static WebElement search_locator() {
		return driver.findElement(By.id("Submit"));
	}



}
