package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SecondStepInCalculatePage extends BasePage{
    public SecondStepInCalculatePage(WebDriver WebDriver) {
        super(WebDriver);
    }
    @FindBy(id="header")
    WebElement title;

    @FindBy(id="ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_GetNechut_1")
    WebElement disability;



    @FindBy(id="ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_StepNavigationTemplateContainerID_StepNextButton")
    WebElement nextStep;

    public String getTitle()
    {
        return title.getText();
    }

    public void noDisability() {
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(disability));

        ((JavascriptExecutor) _driver).executeScript("arguments[0].scrollIntoView(true);", disability);
        ((JavascriptExecutor) _driver).executeScript("arguments[0].click();", disability);
    }

    public CalculateResultsPage viewResults()
    {
        nextStep.click();
        return new CalculateResultsPage(super._driver);
    }
}
