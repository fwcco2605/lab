package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_InvisTaskListPage extends PageObjectBase{
	//未完成任务列表
	@AndroidFindBy(xpath = "logoView")
	public AndroidElement btnDrawer;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.ImageView[@index='0']")
	public AndroidElement btnCreateTask;
	@AndroidFindBy(id = "task_assignee_seg_item")
	public AndroidElement btnAssignee;
	@AndroidFindBy(id = "task_owner_seg_item")
	public AndroidElement btnOwner;
	@AndroidFindBy(id = "task_observer_seg_item")
	public AndroidElement btnObserver;
	@AndroidFindBy(id = "invis_task_time_filter")
	public AndroidElement btnTimrFilter;
	@AndroidFindBy(id = "invis_task_status_filter")
	public AndroidElement btnStatusFilter;
	@AndroidFindBy(id = "invis_task_condition_filter")
	public AndroidElement btnConditionFilter;
	@AndroidFindBy(id = "invis_itask_search_btn")
	public AndroidElement btnSearchTask;
	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
	public AndroidElement btnClosedTask;
	
	//侧滑按钮
	@AndroidFindBy(xpath = "add_favorite_mark")
	public AndroidElement btnFavoriteMark;
	@AndroidFindBy(xpath = "add_tag")
	public AndroidElement btnTag;
	@AndroidFindBy(xpath = "btn_transfer")
	public AndroidElement btnTransfer;

	public TaskForce_InvisTaskListPage(WebDriver driver) {
		super(driver);
	}
}
