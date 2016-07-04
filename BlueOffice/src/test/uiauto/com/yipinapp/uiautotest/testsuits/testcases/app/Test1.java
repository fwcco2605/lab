package com.yipinapp.uiautotest.testsuits.testcases.app;

import com.yipinapp.uiautotest.base.AutoTestBase;
import com.yipinapp.uiautotest.business.page_object.app.GuidePage;
import com.yipinapp.uiautotest.business.page_object.app.L2LoginPage;
import com.yipinapp.uiautotest.business.page_object.app.L1LoginPage;
import com.yipinapp.uiautotest.util.Log;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by yuyilong on 15/12/24.
 */
public class Test1 extends AutoTestBase {
    private L2LoginPage loginPage;
    private L1LoginPage lookupPage;
    private GuidePage guidePage;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
    	loginPage = new L2LoginPage(driver);
    	lookupPage = new L1LoginPage(driver);
    	guidePage = new GuidePage(driver);
    }
    
    @Test(priority = 1, groups = {"滑动引导页"})
	public void t1_1_slideGuidePage() throws Throwable {
    	Log.logFlow("引导页进入登录界面");
		for (int i = 0; i < 3; i++) {
			Thread.sleep(5000);
			operateBase.swipeToUp(500);
		}
		operateBase.click(guidePage.btnEnter, "点击进入");
	}

    @Test(priority = 1, groups = {"邮箱登录"})
    @Parameters({"accountName","pwd"})
    public void t1_2_loginByMail(String accountName,String pwd) throws Throwable {
        Log.logFlow("邮箱登录");
        operateBase.sendKeys(lookupPage.txtAccountName,"输入用户名",accountName);
        operateBase.click(lookupPage.btnLogin,"点击下一步");
        operateBase.sendKeys(loginPage.txtPwd,"输入密码",pwd);
        operateBase.click(loginPage.btnLogin,"点击登录");
    }
    
    @Test(priority = 1, groups = {"手机号登录"},enabled=false)
    @Parameters({"phone","pwd"})
    public void t1_3_loginByPhone(String phone,String pwd) throws Throwable {
        Log.logFlow("手机号登录");
        operateBase.sendKeys(lookupPage.txtAccountName,"输入用户名",phone);
        operateBase.click(lookupPage.btnLogin,"点击下一步");
        operateBase.sendKeys(loginPage.txtPwd,"输入密码",pwd);
        operateBase.click(loginPage.btnLogin,"点击登录");
    }
    
    @Test(priority = 1, groups = {"微信登录"},enabled=false)
    @Parameters({"phone","pwd"})
    public void t1_4_loginByWechat(String phone,String pwd) throws Throwable {
        Log.logFlow("微信登录");
    }
    
    @Test(priority = 1, groups = {"O365全球登录"},enabled=false)
    @Parameters({"phone","pwd"})
    public void t1_5_loginByO365Global(String phone,String pwd) throws Throwable {
        Log.logFlow("O365全球登录");
    }
    
    @Test(priority = 1, groups = {"O365中国登录"},enabled=false)
    @Parameters({"phone","pwd"})
    public void t1_6_loginByO365China(String phone,String pwd) throws Throwable {
        Log.logFlow("O365中国登录");
    }
}
