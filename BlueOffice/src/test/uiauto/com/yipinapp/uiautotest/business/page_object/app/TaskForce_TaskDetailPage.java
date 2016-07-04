package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_TaskDetailPage extends PageObjectBase{

	@AndroidFindBy(id = "logoView")
	public AndroidElement btnDrawer;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.ImageView[@index='0']")
	public AndroidElement btnEditTask;
	@AndroidFindBy(id = "task_multimedia_list")
	public AndroidElement btnAttachment;
	@AndroidFindBy(id = "cancel_task")
	public AndroidElement btnCancelTask;
	
	public TaskForce_TaskDetailPage(WebDriver driver) {
		super(driver);
	}
}
