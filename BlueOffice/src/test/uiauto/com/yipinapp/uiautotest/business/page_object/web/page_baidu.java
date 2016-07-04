package com.yipinapp.uiautotest.business.page_object.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.yipinapp.uiautotest.base.PageObjectBase;

/**
 * Created by yuyilong on 15/9/21.
 */
public class page_baidu extends PageObjectBase {

    public page_baidu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='kw']")
    public WebElement searchInput;

    @FindBy(xpath = ".//*[@id='su']")
    public WebElement searchButton;

}
