package pages;

import base.Base;
import org.openqa.selenium.By;

public class EmployeeOrderListPage extends Base {
    public static By ConfirmOrderList = By.xpath("//tbody/tr[last()]/td[7]/a");

     public static By confirmedStatus = By.xpath("//tbody/tr[last()]/td[6]");
    public static By logOut = By.xpath("//a[text()='Log Out']");

}
