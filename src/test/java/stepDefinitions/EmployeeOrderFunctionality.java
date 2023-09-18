package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeHomePage;
import pages.EmployeeOrderListPage;
import pages.EmployeeProductOrderPage;

import static org.junit.Assert.assertEquals;


public class EmployeeOrderFunctionality extends Base {
    @Then("I click Product Order Manu")
    public void i_click_Product_Order_Manu() {
        click(EmployeeHomePage.productMenu);
    }

    @When("I Choose Product Name")
    public void i_Choose_Product_Name() {
        dropDownIndex(EmployeeProductOrderPage.ProductName, 2);
    }

    @Then("I Put Order Date")
    public void i_Put_Order_Date() {
        sendKeys(EmployeeProductOrderPage.OrderDate, "07/06/2023");

    }

    @Then("I click Order Product Button")
    public void i_click_Order_Product_Button() {
        click(EmployeeProductOrderPage.SubmitButton);
    }

    @When("I confirm Order Product")
    public void i_confirm_Order_Product() throws InterruptedException {
        click(EmployeeOrderListPage.ConfirmOrderList);
        Thread.sleep(1000);
    }

    @Then("I Verify Employee confirmed Order")
    public void i_verify_employee_confirmed_order() throws InterruptedException {
        String confirmOrder = getText(EmployeeOrderListPage.confirmedStatus);
        assertEquals("Confirmed", confirmOrder);
        Thread.sleep(1000);


    }


}



