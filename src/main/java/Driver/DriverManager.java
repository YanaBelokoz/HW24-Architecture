package Driver;

import Util.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    public DriverManager(WebDriver driver, int i) {

    }

    public static void createDriver () {
        Object Driver = null;
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/resources/test property.properties");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Long.parseLong(PropertyReader.getValue("timeout"))));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public void until(ExpectedCondition<WebElement> elementToBeClickable) {
    }
}

