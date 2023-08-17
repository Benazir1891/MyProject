package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.pageexe.SearchHotel_Exe;

public class SelectHotel_Locatros extends SearchHotel_Exe{
	public static WebElement select_locator() {
		return driver.findElement(By.id("radiobutton_0"));
	}
	public static WebElement continue_locator(){
		return driver.findElement(By.id("continue"));
	}
	

}
