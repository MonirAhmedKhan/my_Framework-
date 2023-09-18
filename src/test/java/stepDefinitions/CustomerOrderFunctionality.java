package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerHomePage;
import pages.CustomerOrderListPage;
import pages.CustomerProductOrderPage;
import static org.junit.Assert.assertEquals;


public class CustomerOrderFunctionality extends Base {

    @Then("I click on  Product Order Menu")
    public void i_click_on_product_order_menu() throws InterruptedException {
       click(CustomerHomePage.customerProductMenu);
        Thread.sleep(2000);
    }

    @When("I Choose Customer Product Name")
    public void i_choose_customer_product_name() throws InterruptedException {
        dropDownIndex(CustomerProductOrderPage.CustomerOderName,5);
        Thread.sleep(2000);
    }

    @Then("I put Customer Order Date")
    public void i_put_customer_order_date() throws InterruptedException {

        sendKeys(CustomerProductOrderPage.CustomerOrderDate,"07/09/2023");
        Thread.sleep(5000);
    }

    @Then("I click Customer Order Product Button")
    public void i_click_customer_order_product_button() throws InterruptedException {
       click(CustomerProductOrderPage.SubmitButton);
        Thread.sleep(3000);
    }

    @When("I confirm Customer Order Product")
    public void i_confirm_customer_order_product() {

        click(CustomerOrderListPage.confirmButton);
    }

    @Then("I Verify Customer confirmed Order")
    public void i_verify_customer_confirmed_order() {
       String confirmedOrder= getText(CustomerOrderListPage.confirmedButton);
      assertEquals("Confirmed",confirmedOrder);



    }


}
