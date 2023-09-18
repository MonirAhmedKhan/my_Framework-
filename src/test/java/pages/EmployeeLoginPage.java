package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeLoginPage extends Base {

    //Locators
    public static By menuEmployeeLogin = By.partialLinkText("Employee");



    public static By textEmployeeUserId = By.name("mailuid");
    public static By textEmployeePassword = By.xpath("//input[@name='pwd']");
    public static By btnEmployeeLogin = By.cssSelector("input[name='login-submit']");

    //Actions

    public static void logingAsEmployee(){
       sendKeys(textEmployeeUserId,"testpilot@gmail.com");
       sendKeys(textEmployeePassword,"1234");
       click(EmployeeLoginPage.btnEmployeeLogin);

    }
}
