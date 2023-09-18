package pages;

import org.openqa.selenium.By;

public class CustomerHomePage {
    //Locators
    public static By labelWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome')]");
    public static By labelCustomerMsg = By.xpath("//h2[contains(text(),'Customer')]");

    public static By orderProductButton = By.xpath("//a[@class='homered']");
    public static By customerProductMenu = By.cssSelector("[href='productOrder.php?id=4']");
     public static By CustomerProfileMenu = By.xpath("//a[@href='custMyProfile.php?id=4']");
    //Actions

}
