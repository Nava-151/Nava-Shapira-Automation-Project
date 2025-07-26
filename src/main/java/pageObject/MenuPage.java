package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage{

    public MenuPage(WebDriver WebDriver) {
        super(WebDriver);
    }

    @FindBy(xpath = "//a[@href='/Insurance/National%20Insurance/Pages/default.aspx']")
    WebElement dBtl;

    public DmeiBtlPage dmeiBtlClick()
    {
        dBtl.click();
        return  new DmeiBtlPage(super._driver);
    }
}
