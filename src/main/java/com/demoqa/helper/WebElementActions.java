package com.demoqa.helper;

import com.demoqa.driver.DriverManeger;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class WebElementActions {

     Actions actions = new Actions(DriverManeger.getDriver());

    public WebElementActions click(WebElement element){
        waitElementToBeClickAble(element);
        scrollToElement(element);
        highlightElement(element);
        element.click();
        return this;
    }
//    public WebElementActions  click(WebElement element) {
//        waitElementToBeClickAble(element);
//        scrollToElement(element);
//        highlightElement(element);
//        element.click();
//        return this;

    public WebElementActions sendKeys (WebElement element,String txt){
        scrollToElement(element);
        waitElementToBeVisible(element);
        highlightElement(element);
     element.sendKeys(txt);
     return this;
    }

    public WebElementActions waitElementToBeClickAble(WebElement element){
        new WebDriverWait(DriverManeger.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }
    public WebElementActions waitElementToBeVisible(WebElement element){
        new WebDriverWait(DriverManeger.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

//    public WebElementActions sendKeysWithEnter(WebElement element,String txt){
//        waitElementToBeVisible(element);
//
//    }

    public WebElementActions scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManeger.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public WebElementActions sendKeysWithEnter(WebElement element,String txt){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.sendKeys(txt);
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public WebElementActions jsClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManeger.getDriver();
        js.executeScript("arguments[0].click();",element);
        return this;
    }

    public WebElementActions highlightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManeger.getDriver();
        js.executeScript("arguments[0].style.border='2px solid red'", element);
        return this;
    }

    public WebElementActions jsSendKeys(WebElement element, String txt){
        JavascriptExecutor js = (JavascriptExecutor) DriverManeger.getDriver();
        js.executeScript("arguments[0].value = arguments[1];", element, txt);
        return this;
    }


    public WebElementActions doubleClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public WebElementActions rightClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementToBeClickAble(element);
        actions.contextClick(element).perform();
        return this;
    }


    public WebElementActions moveToElement(WebElement element){
        waitElementToBeVisible(element);
        actions.moveToElement(element).build().perform();
        return this;
    }




}
