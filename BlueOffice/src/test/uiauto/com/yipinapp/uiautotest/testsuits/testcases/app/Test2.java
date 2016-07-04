package com.yipinapp.uiautotest.testsuits.testcases.app;

import com.yipinapp.uiautotest.base.AutoTestBase;
import com.yipinapp.uiautotest.business.page_object.app.ColleagueListPage;
import com.yipinapp.uiautotest.business.page_object.app.DrawerListPage;
import com.yipinapp.uiautotest.business.page_object.app.TaskForce_CreateTaskPage;
import com.yipinapp.uiautotest.business.page_object.app.TaskForce_InvisTaskListPage;
import com.yipinapp.uiautotest.business.page_object.app.TaskForce_SetMemberPage;
import com.yipinapp.uiautotest.util.Log;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by yuyilong on 15/12/24.
 */
public class Test2 extends AutoTestBase {
    private ColleagueListPage colleagueListPage;
    private DrawerListPage drawerListPage;
    private TaskForce_InvisTaskListPage invisTaskListPage;
    private TaskForce_CreateTaskPage createTaskPage;
    private TaskForce_SetMemberPage setMemberPage;

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
    	colleagueListPage = new ColleagueListPage(driver);  
    	drawerListPage = new DrawerListPage(driver);
    	invisTaskListPage = new TaskForce_InvisTaskListPage(driver);
    	createTaskPage = new TaskForce_CreateTaskPage(driver);
    	setMemberPage = new TaskForce_SetMemberPage(driver);
    }
    
    @Test(priority = 1, groups = {"通过侧边栏进入微任务模块"})
	public void t2_1_goTaskForceByDrawer(){
    	Log.logFlow("通过侧边栏进入微任务模块");
		operateBase.click(colleagueListPage.btnDrawer, "点击抽屉按钮");
		operateBase.click(drawerListPage.btnTaskForce, "点击侧边栏微任务按钮");
	}
    
    @Test(priority = 1, groups = {"创建微任务"})
    @Parameters({"taskTitle","taskContent"})
    public void t2_2_creatTaskForMe(String taskTitle,String taskContent){
    	Log.logFlow("创建给自己的任务");
		operateBase.click(invisTaskListPage.btnCreateTask, "点击任务创建");
		operateBase.sendKeys(createTaskPage.txtTaskTitle, "输入标题",taskTitle);
		operateBase.sendKeys(createTaskPage.txtContent,"输入内容",taskContent);
		operateBase.click(createTaskPage.btnMyself, "负责人设为自己");
		operateBase.click(createTaskPage.btnSubmitTask,"点击发布");
	}
    
    @Test(priority = 1, groups = {"创建微任务"})
    @Parameters({"taskTitle","taskContent"})
    public void t2_2_creatTaskForInternalEmployee(String taskTitle,String taskContent,String itemName,int during){
    	Log.logFlow("创建给他人的任务");
		operateBase.click(invisTaskListPage.btnCreateTask, "点击任务创建");
		operateBase.sendKeys(createTaskPage.txtTaskTitle, "输入标题",taskTitle);
		operateBase.sendKeys(createTaskPage.txtContent,"输入内容",taskContent);
		operateBase.click(createTaskPage.btnSelectAssignee, "点击负责人设置按钮");
		operateBase.clickListItem(setMemberPage.lstMember,setMemberPage.lstItemMember, itemName, during);
		operateBase.click(createTaskPage.btnSubmitTask,"点击发布");
	}
}
