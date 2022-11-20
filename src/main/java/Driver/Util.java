package Driver;

import Elements.AbstractElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Util extends AbstractElement {

    public Util(WebElement element) {
        super(element);
    }

    public static void scrollJsIntoView(){
        Object webElement = null;
        ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
        try {
            Thread.sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        public static void jsClickElement(WebElement){
            ((JavascriptExecutor) DriverManager.getDriver()).executeScript("argument[0].click();", webElement);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void jsClickElement(WebElement element) {
    }
}
