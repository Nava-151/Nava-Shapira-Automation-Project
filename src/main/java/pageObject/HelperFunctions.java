package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperFunctions extends BasePage{

    public HelperFunctions(WebDriver driver) {
        super(driver);
    }

    public String getTitle(String xpath){
       return _driver.findElement( By.xpath(xpath)).getText();
    }
  
}
