package com.cocoon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCompanyPage extends BasePage {

    @FindBy(xpath = "//*[@*=\"form-group\"]//input")
    public WebElement titleInputBox;

    @FindBy(id = "state")
    public WebElement stateBox;


}
