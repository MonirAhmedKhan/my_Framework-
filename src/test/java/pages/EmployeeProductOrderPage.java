package pages;

import org.openqa.selenium.By;

public class EmployeeProductOrderPage {
    public static By ProductName= By.name("prodId");

    public static By OrderDate= By.xpath("//input[@name='ordDate']");

    public static By SubmitButton= By.xpath("//div/button[@type='submit']");


}
