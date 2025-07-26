package test;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObject.*;

public class BtlTest extends BaseTest {
    private static final String TITLE_BRANCHES = "סניפים וערוצי שירות";
    private static final String TITLE_DMEI_BTL = "דמי ביטוח לאומי";
    private static final String TITLE_CALCULATOR = "חישוב דמי ביטוח עבור עצמאי, תלמיד, שוהה בחוץ לארץ ומי שלא עובד";
    private static final String TITLE_FINAL = "סיום";
    private static final String TITLE_RES = "163";
    private static final String ADDRESS = "כתובת";
    private static final String CROWD = "קבלת קהל";
    private static final String PHONE_ANSWER = "מענה טלפוני";

//work
    @Test
    @Description("check of data")
    public void GetInsideBranchesPage()
    {
        BranchesPage branchesPage=new BranchesPage(driver);
        HomePage homePage=new HomePage(driver);
        homePage.branchesButton();
        Assertions.assertEquals(branchesPage.getTitle(),TITLE_BRANCHES);
    }

//V work
    @Test
    @Description("הכנסת חישוב דמי לידה")
    public void InsertText()
    {
        SearchResultMaternityPayPage searchResultMaternityPayPage=new SearchResultMaternityPayPage(driver);
        HomePage homePage=new HomePage(driver);
        homePage.searchBornReward();
        Assertions.assertEquals( searchResultMaternityPayPage.getTitle(),"חישוב סכום דמי לידה ליום");
    }

    @Test
    @Description("כניסה לסניף ספציפי לבדיקת תוכן")
    public void CheckInBranch()
    {

        BranchesPage branchesPage=new BranchesPage(driver);
        HomePage homePage=new HomePage(driver);
        homePage.branchesButton();
        Assertions.assertEquals(branchesPage.getTitle(),TITLE_BRANCHES);
        BranchPage branchPage=new BranchPage(driver);
        Assertions.assertEquals(branchPage.getAddres(),ADDRESS);
        Assertions.assertEquals(branchPage.getCrowd(),CROWD);
        Assertions.assertEquals(branchPage.getPhoneAnswer(),PHONE_ANSWER);
    }
    @Test
    @Description("בחור ישיבה")
    public void checkYeshivaStudentCalculation() throws InterruptedException {

        HomePage homePage=new HomePage(super.driver);
        MenuPage menuPage=new MenuPage(super.driver);
        DmeiBtlPage dmeiBtlPage=new DmeiBtlPage(super.driver);
        CalculatorPage calculatorPage=new CalculatorPage(super.driver);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        homePage.dmeiBituchButton();
        menuPage.dmeiBtlClick();
        Assertions.assertEquals(dmeiBtlPage.getTitle(),TITLE_DMEI_BTL);
        dmeiBtlPage.calcLink();
        SecondStepInCalculatePage secondStepInCalculatePage=new SecondStepInCalculatePage(super.driver);
        Assertions.assertEquals(calculatorPage.getTitle(),TITLE_CALCULATOR);
        calculatorPage.clickDetails();
        secondStepInCalculatePage.noDisability();
        secondStepInCalculatePage.viewResults();
        CalculateResultsPage calculateResultsPage=new CalculateResultsPage(super.driver);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String res=calculateResultsPage.getTitle();
        Assertions.assertTrue(res.contains(TITLE_FINAL));
        Thread.sleep(5000);
        Assertions.assertTrue(calculateResultsPage.getResults().contains(TITLE_RES));
    }

}
