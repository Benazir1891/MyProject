package com.app.pageexe;

import com.app.base.Adactin_BaseClass;
import com.app.pageobject.LoginPage_Locators;
import com.app.pageobject.SearchHotel_Locators;

public class LoginPage_Exe extends SearchHotel_Locators{

	public static void username() {
		Adactin_BaseClass.typedata(LoginPage_Locators.username_locator(), Adactin_BaseClass.propertiesConfig("username"));
	}
	public static void password() {
		Adactin_BaseClass.typedata(LoginPage_Locators.password_locator(), Adactin_BaseClass.propertiesConfig("password"));
	}
	public static void login() {
		Adactin_BaseClass.clickdata(LoginPage_Locators.login_locator());;
	}

}
