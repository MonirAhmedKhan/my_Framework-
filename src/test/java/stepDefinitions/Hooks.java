package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends Base {

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Before Run");

    }

    @After
        public void tearDown(Scenario scenario) {
            try {
                String screenshotName= scenario.getName().replace(" ", "");
                if(scenario.isFailed()) {
                    scenario.log("this is my failure message");
                    TakesScreenshot ts = (TakesScreenshot)driver;
                    byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", screenshotName);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        //Thread.sleep(20000);
        //driver.close(); //to close Current Tab of the Browser
        driver.quit();  //to close Browser Application or Window
        System.out.println("After Run");
    }
}
