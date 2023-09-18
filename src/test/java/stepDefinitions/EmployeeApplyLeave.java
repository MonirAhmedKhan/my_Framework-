package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ApplyLeaveFormPage;
import pages.EmployeeHomePage;

public class EmployeeApplyLeave extends Base {
    @Then("I click on Apply Leave menu")
    public void i_click_on_apply_leave_menu() {
        click(EmployeeHomePage.applyEmployeeLeave);

    }

    @Then("I write the Reason")
    public void i_write_the_reason() {

        sendKeys(ApplyLeaveFormPage.reason,"Vacation");
    }

    @Then("I put start Date")
    public void i_put_start_date() {
        sendKeys(ApplyLeaveFormPage.startDate,"09/01/2023");
    }

    @Then("I put End Date")
    public void i_put_end_date() {
     sendKeys(ApplyLeaveFormPage.endDate,"09/15/2023");
    }

    @When("I click on Submit Button")
    public void i_click_on_submit_button() {
        click(ApplyLeaveFormPage.submitButton);
    }

    @Then("Verify Apply leave")
    public void verify_apply_leave() {
       String LeaveStatus= getText(EmployeeHomePage.leaveStatus);
        Assert.assertEquals("Pending",LeaveStatus);

    }



}
