package pages;

import org.openqa.selenium.By;

public class ApplyLeaveFormPage {
    public static By reason = By.xpath("//input[@placeholder='Reason']");
    public static By startDate = By.xpath("//div/input[@placeholder='start']");
    public static By endDate = By.xpath("//div/input[@placeholder='end']");
    public static By submitButton = By.cssSelector("[type='submit']");


}
