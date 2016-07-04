package com.yipinapp.uiautotest.business.page_object.app;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_SetMemberPage extends PageObjectBase{
	@AndroidFindBy(id = "logoView")
	public AndroidElement btnBack;
	@AndroidFindBy(id = "button_one")
	public AndroidElement btnColleague;
	@AndroidFindBy(id = "button_two")
	public AndroidElement btnDepartment;
	@AndroidFindBy(id = "button_three")
	public AndroidElement btnCommonUse;
	@AndroidFindBy(id = "button_external")
	public AndroidElement btnExternal;
	@AndroidFindBy(id = "search_src_text")
	public AndroidElement btnSearch;
	@AndroidFindBy(id = "pinnedListViewt")
	public AndroidElement lstMember;
	@AndroidFindAll({@AndroidFindBy(id = "user_name")})
	public List<WebElement> lstItemMember;
	
	public TaskForce_SetMemberPage(WebDriver driver) {
		super(driver);
	}
	
	public void setMemberBySlideList(){
		
	}
}
