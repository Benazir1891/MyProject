package com.app.pageexe;

import com.app.base.Adactin_BaseClass;
import com.app.pageobject.SelectHotel_Locatros;

public class SelectHotel_Exe extends SelectHotel_Locatros{
	public static void select() {
		Adactin_BaseClass.clickdata(SelectHotel_Locatros.select_locator());

}
	public static void continue_button() {
		Adactin_BaseClass.clickdata(SelectHotel_Locatros.continue_locator());

}

}
