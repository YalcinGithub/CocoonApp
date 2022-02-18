package com.cocoon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CompanyListPage extends BasePage {

    @FindBy(xpath = "//*[.='Add Company']")
    public WebElement addCompanyBTN;

    @FindBy(xpath = "//*[@id=\"example\"]/tbody/tr/td[2]")
    public List<WebElement> companyTitles;

    public static int sizeOfListBefore;
    public static int sizeOfListAfter;
}
