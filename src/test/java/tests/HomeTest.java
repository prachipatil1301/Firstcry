package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchClickPage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    HomePage homePage;
    SearchClickPage searchClickPage;


    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage(driver);
        searchClickPage=new SearchClickPage(driver);
    }

    @Test
    public void verifyTitle() {
        SoftAssert softAssert = new SoftAssert();
        String titlee = homePage.title();
        softAssert.assertEquals(titlee, "Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com");
        softAssert.assertAll();
    }

    @Test()
    public void verifyMouseHover() {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouse();
        softAssert.assertEquals(homePage.getTextOfHomePage(), "TOYS","Homepage text should be match");
        softAssert.assertAll();
    }

    @Test()
    public void verifySearchFunctionality(){

        homePage.search(prop.getProperty("Product"));

    }

    @Test(priority=1)
    public void verifyFrame(){

        homePage.frameMethod();
    }


    @Test()
    public void verifyScrollUpdown() {
        homePage.scrollMethod();
    }

    @Test()
    public void verifyKeyBoardActions() {
        homePage.keyBoardd();
    }

    @Test()
    public void verifyCookies() {
        homePage.addCookiesMethod();
        homePage.deleteAllCookies();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}


