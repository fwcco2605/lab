package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;
import com.yipinapp.uiautotest.base.PageObjectBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DrawerListPage extends PageObjectBase{	
	@AndroidFindBy(id="rl_qrcode")
	public AndroidElement btnScan;
	@AndroidFindBy(id="avatar")
	public AndroidElement btnDrawerFavicon;
	@AndroidFindBy(id="ll_calendar_grid")
	public AndroidElement btnCalendar;
	@AndroidFindBy(id="notification")
	public AndroidElement btnNotification;
	@AndroidFindBy(name="同事录")
	public AndroidElement btnDirectory;
	@AndroidFindBy(name="微任务")
	public AndroidElement btnTaskForce;
	@AndroidFindBy(name="微申请")
	public AndroidElement btnWishingWell;
	@AndroidFindBy(name="微签到")
	public AndroidElement btnFootprintGraph;
	@AndroidFindBy(name="微数据")
	public AndroidElement btnDataCube;
	@AndroidFindBy(name="微会议")
	public AndroidElement btnTalkTime;
	@AndroidFindBy(name="同事圈")
	public AndroidElement btnMomentGarden;
	@AndroidFindBy(name="微新闻")
	public AndroidElement btnNewsBoard;
	@AndroidFindBy(name="微投票")
	public AndroidElement btnLiveVote;
	@AndroidFindBy(name="设置")
	public AndroidElement btnSetting;
	
	public DrawerListPage(WebDriver driver) {
		super(driver);
	}
}

