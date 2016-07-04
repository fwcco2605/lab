package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;
import com.yipinapp.uiautotest.base.PageObjectBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class L1LoginPage extends PageObjectBase{
	//登录页面
	@AndroidFindBy(id="scan_qr")
	public AndroidElement txtScan;
	@AndroidFindBy(id="input_account_name")
	public AndroidElement txtAccountName;
	@AndroidFindBy(id="go_next")
	public AndroidElement btnLogin;
	@AndroidFindBy(name="其他方式登录")
	public AndroidElement btnOtherWays;
	@AndroidFindBy(id="phone_register")
	public AndroidElement btnRegister;
	
	//其他登录方式
	@AndroidFindBy(id="close_other")
	public AndroidElement btnCloseOther;
	@AndroidFindBy(id="o365_china")
	public AndroidElement btnO365China;
	@AndroidFindBy(id="o365_global")
	public AndroidElement btnO365Global;
	@AndroidFindBy(id="wechat_login")
	public AndroidElement btnWechat;
	
	
	public L1LoginPage(WebDriver driver) {
		super(driver);
	}
}

