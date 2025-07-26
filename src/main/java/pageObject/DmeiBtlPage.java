package pageObject;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DmeiBtlPage extends BtlBasePage{

    @FindBy(id="lbl_title")
    WebElement title;

    @FindBy(xpath="//a[@href='/Simulators/BituahCalc/Pages/Insurance_NotSachir.aspx']/strong")
    WebElement calculatorLink;

    public DmeiBtlPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle()
    {
        return title.getText();
    }
    public CalculatorPage calcLink()
    {
        calculatorLink.click();
        return new CalculatorPage(super._driver);
    }
}
