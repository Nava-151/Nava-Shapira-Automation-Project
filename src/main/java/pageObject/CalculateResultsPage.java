package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculateResultsPage extends BasePage{
    @FindBy(xpath = "//div[@id='ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_div_Result']/ul/li[3]")
    WebElement results;

    @FindBy(xpath="//h2[@id='header']")
    WebElement title;



    public CalculateResultsPage(WebDriver WebDriver) {
        super(WebDriver);
    }
    public String getTitle()
    {
        return title.getText();
    }
    public String getResults()
    {
        return results.getText();
    }
}
