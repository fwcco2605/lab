package com.yipinapp.uiautotest.business.page_object.app;

import org.openqa.selenium.WebDriver;
import com.yipinapp.uiautotest.base.PageObjectBase;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class L2LoginPage extends PageObjectBase{
	
	@AndroidFindBy(id="back_to_forward")
	public AndroidElement btnBack;
	@AndroidFindBy(id="input_password")
	public AndroidElement txtPwd;
	@AndroidFindBy(id="sign_in_button")
	public AndroidElement btnLogin;
	@AndroidFindBy(id="forget_pass")
	public AndroidElement btnForgotPwd;

	public L2LoginPage(WebDriver driver) {
		super(driver);
	}
}
