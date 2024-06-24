package com.demoqa.elements;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox {
    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);


        // System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver");



//    Thread.sleep(5000);



    @Test
    public void demoQa() {
        WebDriverManager.chromedriver().setup();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Samat");


        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("nurlan.u.samat@mail.ru");


        WebElement address = driver.findElement(By.id("currentAddress"));
        address.sendKeys("Toktogula/Isanova");


        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Bishkek");


        WebElement buttonSubmit = driver.findElement(By.id("submit"));
        actions.moveToElement(buttonSubmit);
        buttonSubmit.click();
        driver.close();
        driver.quit();
    }
}































    //    WebElement fullName = driver.findElement(By.id("userName"));
//    fullName.sendKeys("Nuta");
//
//    driver.close();
//    driver.quit();


