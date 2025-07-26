package pageObject;

import enums.TopMenuEnum;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BtlBasePage extends BasePage {
     @FindBy(id="ctl00_Topmneu_BranchesHyperLink")
         WebElement branches;
     @FindBy(id = "TopQuestions")
     WebElement searchInput;
    public BtlBasePage(WebDriver driver) {
               super(driver);
    }



    public void navigate(TopMenuEnum TopMenuEnum)
    {
        _driver.findElement(By.xpath("//a[text(קצבאות והטבות)=TopMenuEnum.getSelectedMenuItem()]")).click();
    }

    public void search(String search)
    {
        searchInput.sendKeys(search);
        searchInput.sendKeys(Keys.RETURN);
    }


}
