package com.cocoon.step_defs;

import com.cocoon.utilities.ConfigurationReader;
import com.cocoon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_defs {

    @When("the user goes to page")
    public void the_user_goes_to_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }



    @Then("the user should be able to view Dashboard")
    public void the_user_should_be_able_to_view_Dashboard() throws InterruptedException {

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }


}
