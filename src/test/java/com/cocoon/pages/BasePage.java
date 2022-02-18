package com.cocoon.pages;

import com.cocoon.utilities.Driver;
import com.cocoon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@*=\"main-menu-navigation\"]/li")
    public List<WebElement> menuList;

    @FindBy(xpath = "//*[@*=\"main-menu-navigation\"]/li[1]/ul/li")
    public WebElement companyRegisterBTN;



//    @FindBy(css="#login")
//    public WebElement userName;
//
//    @FindBy(id="password")
//    public WebElement password;
//
//    @FindBy(css = ".btn.btn-primary")
//    public WebElement loginButton;

    public void login(String userNameStr, String passwordStr) {
//        userName.sendKeys(userNameStr);
//        password.sendKeys(passwordStr);
//        loginButton.click();

    }

}