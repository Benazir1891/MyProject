package com.app.pageexe;

import com.app.base.Adactin_BaseClass;
import com.app.pageobject.LoginPage_Locators;
import com.app.pageobject.SearchHotel_Locators;

public class SearchHotel_Exe extends LoginPage_Exe{
	public static void location_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.location_locator(),Adactin_BaseClass.excelReadDataReuseable(0, 0));
	}
	public static void hotel_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.hotels_locator(),Adactin_BaseClass.excelReadDataReuseable(1, 0));
	}
	public static void roomtype_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.roomtype_locator(),Adactin_BaseClass.excelReadDataReuseable(2, 0));
	}
	public static void noofrooms_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.noofrooms_locator(),Adactin_BaseClass.excelReadDataReuseable(3, 0));
	}
	public static void clearcheckin_PageExe() {
		Adactin_BaseClass.cleardata(SearchHotel_Locators.checkin_locator());
	}
	public static void checkin_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.checkin_locator(),Adactin_BaseClass.excelReadDataReuseable(4, 0));
	}
	public static void clearcheckout_PageExe() {
		Adactin_BaseClass.cleardata(SearchHotel_Locators.checkout_locator());
	}
	public static void checkout_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.checkout_locator(),Adactin_BaseClass.excelReadDataReuseable(5, 0));
	}
	public static void adults_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.adults_locator(),Adactin_BaseClass.excelReadDataReuseable(6, 0));
	}
	public static void children_PageExe() {
		Adactin_BaseClass.typedata(SearchHotel_Locators.child_locator(),Adactin_BaseClass.excelReadDataReuseable(7, 0));
	}
	public static void search() {
		Adactin_BaseClass.clickdata(SearchHotel_Locators.search_locator());
	}

}