package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GuidePage extends PageObjectBase{
	@AndroidFindBy(xpath = "//android.view.View[contains(@index,39)]")
	public AndroidElement btnEnter;
	
	public GuidePage(WebDriver driver) {
		super(driver);
	}
}
