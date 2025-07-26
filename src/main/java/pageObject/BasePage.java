package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   protected WebDriver _driver;
    public BasePage( WebDriver WebDriver) {
        this._driver=WebDriver;
        PageFactory.initElements(_driver,this);

    }
}
