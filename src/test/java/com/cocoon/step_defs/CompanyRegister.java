package com.cocoon.step_defs;

import com.cocoon.pages.CompanyListPage;
import com.cocoon.utilities.BrowserUtils;
import com.cocoon.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class CompanyRegister {
    CompanyListPage companyListPage = new CompanyListPage();
    Actions actions = new Actions(Driver.get());

    @When("the user clicks Company Registration")
    public void theUserClicksCompanyRegistration() {
        actions.moveToElement(companyListPage.menuList.get(0)).perform();
        companyListPage.companyRegisterBTN.click();
    }

    @Then("the user should be able to land the List Company page")
    public void theUserShouldBeAbleToLandTheListCompanyPage() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("List Company", Driver.get().getTitle());
    }

    @When("the user clicks Add Company button")
    public void theUserClicksAddCompanyButton() {
        companyListPage.sizeOfListBefore = companyListPage.companyTitles.size();
        companyListPage.addCompanyBTN.click();
    }

    @Then("the user should be able to land the Add Company page")
    public void theUserShouldBeAbleToLandTheAddCompanyPage() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Add Company", Driver.get().getTitle());
    }

}
