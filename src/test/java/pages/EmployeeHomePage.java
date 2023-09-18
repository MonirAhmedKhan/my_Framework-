package pages;

import org.openqa.selenium.By;

public class EmployeeHomePage {

    //Locators
    public static By labelWelcomeMsg = By.xpath("//h2[contains(text(),'Welcome')]");
    public static By employeeIdMsg = By.xpath("//div/h2[1]");

    public static By productMenu=By.xpath("//a[text()='Product Order']");
    public static By customerLoginMenu = By.xpath("//a[@href='clogin.php']");

    public static By applyEmployeeLeave =By.xpath("//a[@href='applyleave.php?id=102']");

    public static By leaveStatus =By.xpath("//table[3]/tbody/tr[last()]/td[5]");



    //Actions
}
