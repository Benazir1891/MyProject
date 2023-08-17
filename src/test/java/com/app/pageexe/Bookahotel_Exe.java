package com.app.pageexe;

import com.app.base.Adactin_BaseClass;
import com.app.pageobject.Bookahotel_Locators;

public class Bookahotel_Exe extends SelectHotel_Exe{
	public static void firstname() {
		Adactin_BaseClass.typedata(Bookahotel_Locators.firstname_locator(), Adactin_BaseClass.excelReadDataReuseable(0, 1));
		
	}
	public static void lastname() {
		Adactin_BaseClass.typedata(Bookahotel_Locators.lastname_locator(), Adactin_BaseClass.excelReadDataReuseable(1, 1));
		
	}
	public static void billadd() {
		Adactin_BaseClass.typedata(Bookahotel_Locators.billadd_locator(), Adactin_BaseClass.excelReadDataReuseable(2, 1));
		
	}
	public static void ccno() {
		Adactin_BaseClass.typedata(Bookahotel_Locators.creditcard_locator(), Adactin_BaseClass.excelReadDataReuseable(3, 1));
		
	}
	public static void cctype(){
		Adactin_BaseClass.typedata(Bookahotel_Locators.cardtype_locator(), Adactin_BaseClass.excelReadDataReuseable(4, 1));
		
	}
	public static void expmonth() {
		Adactin_BaseClass.typedata(Bookahotel_Locators.expmonth_locator(), Adactin_BaseClass.excelReadDataReuseable(5, 1));
		
	}
	public static void expyear() {
		Adactin_BaseClass.typedata(Bookahotel_Locators.expyear_locator(), Adactin_BaseClass.excelReadDataReuseable(5, 2));
		
	}
	public static void  cvvno(){
		Adactin_BaseClass.typedata(Bookahotel_Locators.cvvno_locator(), Adactin_BaseClass.excelReadDataReuseable(6, 1));
		
	}
	public static void  booknow(){
		Adactin_BaseClass.clickdata(Bookahotel_Locators.booking_locator());
		
	}
}
