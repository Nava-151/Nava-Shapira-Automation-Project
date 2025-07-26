package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchPage extends BtlBasePage{
    public BranchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='SnifDetails']//label[contains(text(), 'כתובת')")
    WebElement address;

    @FindBy(xpath = "//ul[@class='SnifDetails']//label[contains(text(), 'קבלת קהל')")
    WebElement crowd;

    @FindBy(xpath = "//ul[@class='SnifDetails']//label[contains(text(), 'מענה טלפוני')")
    WebElement phoneAnswer;


    public String getAddres()
    {
        return address.getText();
    }
    public String getCrowd()
    {
        return crowd.getText();

    }
    public String getPhoneAnswer()
    {
        return phoneAnswer.getText();

    }


}
