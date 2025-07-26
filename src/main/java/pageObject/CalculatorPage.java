package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public class CalculatorPage extends BasePage{

    @FindBy(xpath = "//div[@id='mainContent']/div/h1")
    WebElement title;

    @FindBy(id="ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_DynDatePicker_BirthDate_Date")
    WebElement bornDate;

    @FindBy(id = "ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_employeType_2")
    WebElement yeshivaBoy;

    @FindBy(id="ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_rdb_Gender_0")
    WebElement male;

    @FindBy(id="ctl00_ctl43_g_642b1586_5c41_436a_a04c_e3b5ba94ba69_ctl00_InsuranceNotSachirWizard_StartNavigationTemplateContainerID_StartNextButton")
    WebElement secondStepButton;

    public CalculatorPage(WebDriver WebDriver) {
        super(WebDriver);
    }
    public static String generateRandomBirthdate() {
        LocalDate today = LocalDate.now();

        LocalDate maxDate = today.minusYears(18).minusDays(1);
        LocalDate minDate = today.minusYears(70);

        long minEpochDay = minDate.toEpochDay();
        long maxEpochDay = maxDate.toEpochDay();

        long randomDay = ThreadLocalRandom.current().nextLong(minEpochDay, maxEpochDay + 1);

        LocalDate randomBirthdate = LocalDate.ofEpochDay(randomDay);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return randomBirthdate.format(formatter);
    }
    public SecondStepInCalculatePage clickDetails()
    {
        yeshivaBoy.click();
        male.click();
        bornDate.sendKeys(generateRandomBirthdate());
        secondStepButton.click();
        return new SecondStepInCalculatePage(super._driver);

    }
    public String getTitle()
    {
        return title.getText();
    }

}
