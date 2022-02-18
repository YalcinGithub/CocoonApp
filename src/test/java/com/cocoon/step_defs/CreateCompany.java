package com.cocoon.step_defs;

import com.cocoon.pages.AddCompanyPage;
import com.cocoon.pages.CompanyListPage;
import com.cocoon.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;
import java.util.Random;

public class CreateCompany {
    CompanyListPage companyListPage = new CompanyListPage();
    AddCompanyPage addCompanyPage = new AddCompanyPage();
    Faker faker = new Faker(Locale.US);

    String companyName = faker.company().name();
    String zip = faker.address().zipCodeByState("AL");
    String address = faker.address().fullAddress();
    String email = faker.internet().emailAddress();
    String representative = faker.name().fullName();
    String phone = faker.phoneNumber().phoneNumber();
    Random random = new Random();


    @When("the user fills out the forms")
    public void theUserFillsOutTheForms() {

        addCompanyPage.titleInputBox.sendKeys(companyName, Keys.TAB);
        addCompanyPage.titleInputBox.sendKeys(zip, Keys.TAB);
        addCompanyPage.titleInputBox.sendKeys(address, Keys.TAB);
        addCompanyPage.titleInputBox.sendKeys(email, Keys.TAB);

        Select state = new Select(addCompanyPage.stateBox);
        state.selectByIndex(random.nextInt(50));

        addCompanyPage.titleInputBox.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
        addCompanyPage.titleInputBox.sendKeys(Keys.ARROW_DOWN, Keys.TAB);
        addCompanyPage.titleInputBox.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.TAB);
        addCompanyPage.titleInputBox.sendKeys(representative, Keys.TAB);


//        addCompanyPage.titleInputBox.sendKeys(Keys.TAB);
//        addCompanyPage.titleInputBox.sendKeys(companyName);
//        addCompanyPage.titleInputBox.sendKeys(companyName);


    }

    @And("the user clicks Save Changes button")
    public void theUserClicksSaveChangesButton() {
        addCompanyPage.titleInputBox.sendKeys(phone, Keys.TAB, Keys.ENTER);
        BrowserUtils.waitFor(5);
    }

    @Then("the user should be able to save new company")
    public void theUserShouldBeAbleToSaveNewCompany() {
        new CompanyRegister().theUserShouldBeAbleToLandTheListCompanyPage();
        Assert.assertTrue(BrowserUtils.getElementsText(new CompanyListPage().companyTitles).contains(companyName));
        companyListPage.sizeOfListAfter = companyListPage.companyTitles.size();
        System.out.println("companyListPage.sizeOfListAfter = " + companyListPage.sizeOfListAfter);
        System.out.println("companyListPage.sizeOfListBefore = " + companyListPage.sizeOfListBefore);
        Assert.assertEquals(companyListPage.sizeOfListAfter, companyListPage.sizeOfListBefore + 1);
    }

}
