package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import stepdefinition.SharedSD;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class BasePage {

    public void clickOn(By locator) {
        try {
            SharedSD.getDriver().findElement(locator).click();
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
            e.printStackTrace();
        }
    }

    public void setValue(By locator, String text) {
        SharedSD.getDriver().findElement(locator).sendKeys(text);
    }

    public void selectDropDown(By locator, int index) {
        WebElement mySelectElement = SharedSD.getDriver().findElement(locator);
        Select dropdown = new Select(mySelectElement);
        dropdown.selectByIndex(index);
    }

    public void sendText(By locator, String text) {
        try {
            SharedSD.getDriver().findElement(locator).sendKeys(text);
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
            e.printStackTrace();
        }
    }

    public String getTextFromElement(By locator) {
        String text = null;
        try {
            text = SharedSD.getDriver().findElement(locator).getText();
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
            e.printStackTrace();
        }

        return text;
    }

    public void selectDropDown(By locator, String value) {
        try {
            WebElement mySelectElement = SharedSD.getDriver().findElement(locator);
            Select dropdown = new Select(mySelectElement);
            dropdown.selectByValue(value);
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
        }
    }

    public void clickOnBrowserBackArrow() {
        SharedSD.getDriver().navigate().back();
    }

    public void clickOnBrowserForwardArrow() {
        SharedSD.getDriver().navigate().forward();
    }

    public void refreshBrowser() {
        SharedSD.getDriver().navigate().refresh();
    }

//    public void getSubString(By locator, int index, int index1) {
//        String str = new String(String.valueOf(SharedSD.getDriver().findElement(locator).getText()));
//        String substr = "";
//        substr = str.substring(index, index1);
//    }

    public void clearText(By locator) {
        SharedSD.getDriver().findElement(locator).clear();
    }

}
