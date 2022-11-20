package PO;

import Elements.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.sql.DriverManager;

public class RozetkaPannel extends AbstractPO{

    @FindBy(xpath = "//input[contains(@class, 'search-form_input')]")
    public Input searchInput;

    @FindBy(xpath = "//button[contains(@class, 'search-form_submit')]")
    public Button searchButton;

    public RozetkaPannel enterTextInSearchInput(String text){
        new Driver(DriverManager.getDrivers(),5).until(ExpectedConditions.visibilityOf(searchInput));
        searchInput.sendKeys(text);
        return this;

    }

    public void clickSearch() {
    }
}
