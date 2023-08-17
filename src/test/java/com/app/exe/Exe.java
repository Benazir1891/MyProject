package com.app.exe;

import com.app.base.Adactin_BaseClass;
import com.app.pageexe.Bookahotel_Exe;
import com.app.pageexe.SearchHotel_Exe;
import com.app.pageexe.SelectHotel_Exe;

public class Exe extends Bookahotel_Exe{
	
	public static void main(String[] args) {
		browserlaunch();
		url(Adactin_BaseClass.propertiesConfig("url"));
		username();
		password();
		login();
		location_PageExe();
		hotel_PageExe();
		roomtype_PageExe();
		noofrooms_PageExe();
		clearcheckin_PageExe();
		checkin_PageExe();
		clearcheckout_PageExe();
		checkout_PageExe();
		adults_PageExe();
		children_PageExe();
		search();
		select();
		continue_button();
		firstname();
		lastname();
		billadd();
		ccno();
		cctype();
		expmonth();
		expyear();
		cvvno();
		booknow();
		screenshot();
	}

}
