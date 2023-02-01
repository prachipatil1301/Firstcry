package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.Utility;


public class SearchClickPage extends WebTestBase {

    @FindBy(id = "upperBannerDiv")
    WebElement searchClickPage;

    @FindBy(id = "search_box")
    WebElement searchBox;

    @FindBy(xpath = "//span[@class='search-button']")
    WebElement searchButton;

    @FindBy(xpath = "//img[@title='NEGOCIO Singing Talking Recording Dancing Cactus Toy - Green Brown']")
    WebElement toyIcon;

    @FindBy(xpath = "(//span[@class='sprite_list sprt add_clk'])[3]")
    WebElement checkBoxx;

    @FindBy(xpath = "(//span[@class='sprite_list sprt add_clk'])[6]")
    WebElement checkBoxx2;

    @FindBy(xpath = "(//span[text()='See More'])[1]")
    WebElement seeMore;

    @FindBy(xpath="//img[@title='Lefan Cricket Kit for Kids for Activity Bat & Ball Set Playing Outdoor and Indoor Baby Sports Game Toy Birthday Gift - Multicolor']")
    WebElement ele3;

    @FindBy(xpath="//select[@class='diaper-dropdown M16_42']")
    WebElement dropdown;

    @FindBy(xpath="//a[text()='Home']")
    WebElement home;





    public SearchClickPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    }

    public void getWindowHandles(String ProductName)  {
        searchBox.click();
        searchBox.sendKeys(ProductName);
        searchButton.click();
        toyIcon.click();
        Utility.getWindow(driver);
    }

    public void checkBoxMethod() {
        searchBox.click();
        searchBox.sendKeys("Frocks");
        searchButton.click();
        seeMore.click();
        checkBoxx.click();
        checkBoxx2.click();
    }

    public void dropDownMethod(String Product) {
        searchBox.click();
        searchBox.sendKeys(Product);
        searchButton.click();
        ele3.click();
        Utility.getWindow(driver);
        dropdown.click();
        Utility.selectValue(dropdown,"byIndex","3");
        home.click();

    }


}
