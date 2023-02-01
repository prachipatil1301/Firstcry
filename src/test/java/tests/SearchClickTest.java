package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchClickPage;
import testbase.WebTestBase;

public class SearchClickTest extends WebTestBase {
    SearchClickPage searchClickPage;
    HomePage homePage;


    @BeforeMethod
    public void beforeMethod() {
        initialization();
        searchClickPage = new SearchClickPage(driver);
        homePage = new HomePage(driver);

    }

    @Test()
    public void verifyDropDown()  {
        searchClickPage.dropDownMethod(prop.getProperty("Product"));
    }


    @Test
    public void verifyGetWindowMethod()  {

        searchClickPage.getWindowHandles(prop.getProperty("ProductName"));

    }

    @Test
    public void verifyCheckBox() {

        searchClickPage.checkBoxMethod();

    }

}
