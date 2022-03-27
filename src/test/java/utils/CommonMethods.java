package utils;

import io.cucumber.plugin.event.Node;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.PageInitializer;

import javax.swing.*;
import java.util.List;
import java.util.Locale;

public class CommonMethods extends PageInitializer {

    public static void sendText(WebElement element, String text) {
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
    }

    public static void switchToFrame(String nameOrId) {
        try {
            driver.switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

    public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
        return wait;
    }

    public static WebElement waitForClickability(WebElement element) {
        return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForVisibility(WebElement element) {
        return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    public static String getElementText(WebElement element) {
        waitForVisibility(element);
        return element.getText();
    }

    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int numberOfElements(List<WebElement> elements) {
        return elements.size();
    }

    public static void userIsOnPage(String expectedPageTitle) {
        String actualTitle = driver.getTitle().toLowerCase(Locale.ROOT);
        System.out.println(actualTitle);
        Assert.assertTrue("User is not on the page!", actualTitle.contains(expectedPageTitle.toLowerCase(Locale.ROOT)));
    }

    public static Actions getActionObject() {
        Actions actions = new Actions(driver);
        return actions;
    }

    public static void moveToElement(WebElement element) {
        getActionObject().moveToElement(element).perform();
    }

    public static void movetoElementAndClick(WebElement element) {
        moveToElement(element);
        click(element);
    }

}
