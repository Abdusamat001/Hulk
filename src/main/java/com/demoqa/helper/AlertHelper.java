package com.demoqa.helper;

import com.demoqa.driver.DriverManeger;
import com.demoqa.waits.WaitsDemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {
    private WebDriver driver = DriverManeger.getDriver();


    public AlertHelper(WebDriver driver){
        this.driver=driver;
    }

    public Alert getAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent()) ;
       return driver.switchTo().alert();
    }

    public void acceptAlert(){
        getAlert().accept();
    }

    public void dismissAlert(){
        getAlert().dismiss();
    }

    public String getAlertText(){
        return getAlert().getText();
    }

    public boolean isAlertPresent(){
        try {
            driver.switchTo().alert().accept();
            return true;
        }catch (NoAlertPresentException e){
            return false;
        }
    }
    public void acceptAlertPresented(){
        if (!isAlertPresent())
            return;
        acceptAlert();
    }

    public void dismissAlertIfPresented(){
        if (!isAlertPresent())
            return;
        dismissAlert();
    }

    public void acceptPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.accept();
    }

    public void dismissPrompt(String txt){
        if (!isAlertPresent())
            return;
        Alert alert = getAlert();
        alert.sendKeys(txt);
        alert.dismiss();
    }


}
