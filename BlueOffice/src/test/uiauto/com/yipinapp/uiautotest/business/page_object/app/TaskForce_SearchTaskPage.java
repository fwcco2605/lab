package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_SearchTaskPage extends PageObjectBase{
	
	@AndroidFindBy(id = "logoView")
	public AndroidElement btnBack;
	@AndroidFindBy(id = "search_src_text")
	public AndroidElement txtSearch;
	
	public TaskForce_SearchTaskPage(WebDriver driver) {
		super(driver);
	}
}
