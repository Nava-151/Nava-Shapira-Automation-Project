package pageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage extends BtlBasePage {


    @FindBy(xpath="//h3/a[@class='SnifName']")
    WebElement oneBranch;

    public BranchesPage(WebDriver driver) {
        super(driver);
    }

     public BranchPage GetInsideBranch()
     {
        oneBranch.click();
        return new BranchPage(super._driver);
     }


}
