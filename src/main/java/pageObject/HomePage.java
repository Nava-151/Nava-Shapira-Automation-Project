package pageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BtlBasePage{


    @FindBy(id="TopQuestions")
    WebElement search;

    @FindBy(id="ctl00_SiteHeader_reserve_btnSearch")
    WebElement searchIcon;

    @FindBy(id="ctl00_Topmneu_InsuranceHyperLink")
    WebElement dmeiBituach;


    public HomePage(WebDriver WebDriver) {
        super(WebDriver);
    }

    public void searchBornReward()
    {
        search.sendKeys("חישוב סכום דמי לידה ליום");
        searchIcon.click();
    }
    public BranchesPage branchesButton()
    {
        branches.click();
        return new BranchesPage(super._driver);
    }
    public MenuPage dmeiBituchButton()
    {
        dmeiBituach.click();
        return new MenuPage(super._driver);
    }
}
