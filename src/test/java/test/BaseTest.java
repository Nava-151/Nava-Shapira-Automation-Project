package test;



        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeAll;
        import org.junit.jupiter.api.BeforeEach;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;

public class BaseTest {


    protected WebDriver driver;
    @BeforeEach
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.btl.gov.il/");
    }

    @AfterEach
    public void closeDriver()
    {


    }


}
