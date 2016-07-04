package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_ClosedTaskListPage extends PageObjectBase{
	
	@AndroidFindBy(id = "logoView")
	public AndroidElement btnBack;
	@AndroidFindBy(xpath = "completed_task_time_filter")
	public AndroidElement btnTimrFilter;
	@AndroidFindBy(xpath = "completed_task_status_filter")
	public AndroidElement btnStatusFilter;
	@AndroidFindBy(xpath = "completed_task_condition_filter")
	public AndroidElement btnConditionFilter;
	@AndroidFindBy(xpath = "task_search_btn")
	public AndroidElement btnSearchTask;
	//侧滑按钮
	@AndroidFindBy(xpath = "add_favorite_mark")
	public AndroidElement btnFavoriteMark;
	@AndroidFindBy(xpath = "add_tag")
	public AndroidElement btnTag;
	
	public TaskForce_ClosedTaskListPage(WebDriver driver) {
		super(driver);
	}
	
	
}
