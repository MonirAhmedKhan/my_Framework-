package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerHomePage;
import pages.CustomerProfileInfoPage;
import pages.UpdateCustomerInfoPage;

public class CustomerProfileInfoFunctionality extends Base {
    @Then("I click on Customer Profile menu")
    public void i_click_on_Customer_profile_menu() {
        click(CustomerHomePage.CustomerProfileMenu);
    }

    @When("I click on Update Info Button")
    public void i_click_on_update_info_button() {
        click(CustomerProfileInfoPage.updateInfo);
    }

    @Then("I put Contact Number")
    public void i_put_contact_number() throws InterruptedException {
        clear(UpdateCustomerInfoPage.contactNumber);
        sendKeys(UpdateCustomerInfoPage.contactNumber, "44666");
        Thread.sleep(1000);
    }
    @Then("I put Address")
    public void i_put_address() throws InterruptedException {
        clear(UpdateCustomerInfoPage.address);
        sendKeys(UpdateCustomerInfoPage.address, "456 Norfolk rd, Minneapolis");
        Thread.sleep(1000);
    }
    @Then("I click on Submit Profile Info")
    public void i_click_on_submit_profile_info() {
        click(UpdateCustomerInfoPage.submit);
    }

}
