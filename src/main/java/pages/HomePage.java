package pages;


import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;

public class HomePage extends WebTestBase {

    @FindBy(id = "divb11")
    WebElement homePage;

    @FindBy(xpath = "//a[text()=' Toys']")
    WebElement ele;


    @FindBy(id = "search_box")
    WebElement searchhBox;

    @FindBy(xpath = "//span[@class='search-button']")
    WebElement searchhButton;


    @FindBy(xpath="//img[@class='img_ad']")
    WebElement iframe;

    @FindBy(xpath="(//a[@title='Sports & Games'])[2]")
    WebElement eleClick;

    @FindBy(xpath="//div[@class='myc_cl_pop sprite_list']")
    WebElement adClosed;





    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String title() {
        return driver.getTitle();
    }


    public void mouse() {
        Utility.mouseHover(driver, ele);
    }


    public void scrollMethod() {
        Utility.scollUpDown(driver);
    }

    public void keyBoardd() {
        Utility.keyBoardActions(driver, searchhBox);

    }

    public void search(String Product){
        searchhBox.click();
        searchhBox.sendKeys(Product);
        searchhButton.click();
    }

    public void frameMethod(){
        Utility.mouseHover(driver,ele);
        eleClick.click();
        driver.switchTo().frame("google_ads_iframe_/106924862/All_Resolution_Listing_Page_Top_Offer_Unit_0");
        iframe.click();
        Utility.getWindow(driver);
        adClosed.click();

    }



    public void addCookiesMethod() {
        Utility.addCookies(driver);
    }

    public void deleteAllCookies() {
        Utility.deleteAllCookies(driver);
    }

    public String getTextOfHomePage(){
        return ele.getText();
    }


}











