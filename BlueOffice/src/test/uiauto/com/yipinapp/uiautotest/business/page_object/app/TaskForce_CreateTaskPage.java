package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_CreateTaskPage extends PageObjectBase{
	@AndroidFindBy(id = "title_edit")
	public AndroidElement txtTaskTitle;
	@AndroidFindBy(id = "tv_myself")
	public AndroidElement btnMyself;
	@AndroidFindBy(id = "assignee_edit")
	public AndroidElement btnSelectAssignee;
	@AndroidFindBy(id = "observer")
	public AndroidElement btnSelectObserver;
	@AndroidFindBy(id = "task_date")
	public AndroidElement btnSelectEndDate;
	@AndroidFindBy(id = "task_time")
	public AndroidElement btnSelectEndTime;
	@AndroidFindBy(id = "content")
	public AndroidElement txtContent;
	@AndroidFindBy(id = "tv_add_tag")
	public AndroidElement btnAddTags;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
	public AndroidElement btnAddSubtask;
	@AndroidFindBy(name = "发布")
	public AndroidElement btnSubmitTask;
	
	public TaskForce_CreateTaskPage(WebDriver driver) {
		super(driver);
	}
}
