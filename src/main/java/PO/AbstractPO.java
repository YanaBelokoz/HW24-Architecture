package PO;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import java.sql.DriverManager;

public class AbstractPO {

    public AbstractPO(){
        PageFactory.initElements(new ElementsDecorator(new DefaultElementLocatorFctory(DriverManager.getDriver())), this);
    }

    public void clickBuyBtnPopup() {
    }
}
