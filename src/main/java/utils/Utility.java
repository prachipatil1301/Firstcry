package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Utility {
    public static final long PAGE_LOAD_TIMEOUT = 90;
    public static final long IMPLICITLY_WAIT = 100;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void mouseHover(WebDriver driver, WebElement ele) {
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();

    }

    public static void selectValue(WebElement element,String term,String value) {
        Select dropDown = new Select(element);
        if (term.equalsIgnoreCase("byValue")) {
            dropDown.selectByValue(value);
        } else if (term.equalsIgnoreCase("byIndex")) {
            dropDown.selectByIndex(Integer.parseInt(value));
        }else if (term.equalsIgnoreCase("byVisibleText")) {
            dropDown.selectByVisibleText(value);
        }else{
            System.out.println("Please select correct option");
        }
    }

    public static void keyBoardActions(WebDriver driver, WebElement searchhBox) {
        Actions action = new Actions(driver);
        action.moveToElement(searchhBox)
                .click(searchhBox)
                .keyDown(Keys.SHIFT)
                .sendKeys("Jackets")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
    }

    public static void getWindow(WebDriver driver)  {
        String parentwindowId = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentwindowId.contentEquals(s)) {
                driver.switchTo().window(s);
//                driver.close();
            }
        }
//       driver.switchTo().window(parentwindowId);

    }

    public static void scollUpDown(WebDriver driver) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1200);");  //scroll down
        javascriptExecutor.executeScript("window.scrollBy(0,-1200);"); //scroll up
    }

    public static void addCookies(WebDriver driver) {
        Cookie cok = new Cookie("Website", "Firstcry");
        driver.manage().addCookie(cok);
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }


    public static void deleteAllCookies(WebDriver driver) {
        driver.manage().deleteAllCookies();
        System.out.println("All Cookies deleted Successfully");

    }


}









