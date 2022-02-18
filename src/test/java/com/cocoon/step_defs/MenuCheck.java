package com.cocoon.step_defs;

import com.cocoon.pages.BasePage;
import com.cocoon.pages.CompanyListPage;
import com.cocoon.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MenuCheck {

    CompanyListPage companyListPage = new CompanyListPage();

    @Then("the user should be able to view menu")
    public void theUserShouldBeAbleToViewMenu(List<String> expectedOptions) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("basePage.menuList.size() = " + companyListPage.menuList.size());
        List<String>actualOptions = BrowserUtils.getElementsText(companyListPage.menuList);

        Assert.assertEquals("check menu",expectedOptions,actualOptions);
    }


}
