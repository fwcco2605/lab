package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;

import com.yipinapp.uiautotest.base.PageObjectBase;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TaskForce_TaskChamber extends PageObjectBase{

	@AndroidFindBy(id = "logoView")
	public AndroidElement btnDrawer;
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.ImageView[@index='0']")
	public AndroidElement btnTaskDetail;
	@AndroidFindBy(id = "btn_task_status")
	public AndroidElement btnStatus;
	@AndroidFindBy(id = "schedule_group")
	public AndroidElement btnSubtask;
	@AndroidFindBy(id = "audio_switch_btn")
	public AndroidElement btnAudio;
	@AndroidFindBy(id = "addMoreBtn")
	public AndroidElement btnMore;
	@AndroidFindBy(id = "editText")
	public AndroidElement txtMessage;
	@AndroidFindBy(id = "send_btn")
	public AndroidElement btnSend;
	@AndroidFindBy(id = "//android.widget.GridView[7]/android.widget.LinearLayout[0]")
	public AndroidElement btnPhoto;
	@AndroidFindBy(id = "//android.widget.GridView[7]/android.widget.LinearLayout[1]")
	public AndroidElement btnImage;
	@AndroidFindBy(id = "//android.widget.GridView[7]/android.widget.LinearLayout[2]")
	public AndroidElement btnAttachment;
	@AndroidFindBy(id = "//android.widget.GridView[7]/android.widget.LinearLayout[3]")
	public AndroidElement btnExpression;
	@AndroidFindBy(id = "//android.widget.GridView[7]/android.widget.LinearLayout[4]")
	public AndroidElement btnLocation;
	@AndroidFindBy(id = "//android.widget.GridView[7]/android.widget.LinearLayout[5]")
	public AndroidElement btnMedal;	
	
	public TaskForce_TaskChamber(WebDriver driver) {
		super(driver);
	}
}
