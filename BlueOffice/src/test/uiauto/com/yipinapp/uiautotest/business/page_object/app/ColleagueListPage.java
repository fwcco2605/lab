package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ColleagueListPage extends PageObjectBase{
	@AndroidFindBy(id = "logoView")
	public AndroidElement btnDrawer;
	
	public ColleagueListPage(WebDriver driver) {
		super(driver);
	}
}
