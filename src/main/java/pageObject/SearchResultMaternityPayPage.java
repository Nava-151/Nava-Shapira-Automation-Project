package pageObject;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultMaternityPayPage extends BtlBasePage
{


    @FindBy(xpath="//div[@id='mainContent']//h1")
    WebElement title;

    public SearchResultMaternityPayPage(WebDriver WebDriver)
    {
        super(WebDriver);
    }

    public String getTitle()
    {
        return title.getText();
    }


}
