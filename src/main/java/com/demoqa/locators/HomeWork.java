package com.demoqa.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork {

    WebDriver driver = new ChromeDriver();
    @Test

    public void coverSamolot() {
        WebDriverManager.chromedriver().setup();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://dostavka312.kg/");

        WebElement vyborKafe = driver.findElement(By.xpath("//img[@alt='edaG']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(vyborKafe).click().perform();

        WebElement socialCofee = driver.findElement(By.xpath("(//a [@class='btn btn-success pull-right'])[17]"));
        actions.moveToElement(socialCofee).click().perform();

        WebElement kasha = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[1]"));
        kasha.click();
        kasha.click();
        kasha.click();
        kasha.click();
        kasha.click();
        kasha.click();


        WebElement sup = driver.findElement(By.xpath("(//button[@class='btn btn-yellow btn-sm btn-addcart'])[50]"));
        actions.moveToElement(sup).click().perform();
        sup.click();
        sup.click();
        sup.click();
        sup.click();

        WebElement korzina = driver.findElement(By.xpath("//div[@class='pulse2']"));
        korzina.click();

        WebElement aform = driver.findElement(By.xpath("//a[@onclick='InitiateCheckout()']"));
        aform.click();

        WebElement plus = driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-plus']"));
        plus.click();
        plus.click();
        plus.click();
        plus.click();
        plus.click();

        WebElement name = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
       // name.click();
        name.sendKeys("Eldar");


        WebElement add = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
       // add.click();
        add.sendKeys("Moscow");


        WebElement phone = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
       // phone.click();
        phone.sendKeys("0999333222");


        WebElement money = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
       money.sendKeys("50000");



        WebElement comment = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        comment.sendKeys("salam");

        WebElement zakaz = driver.findElement(By.xpath("//button[@type='submit']"));
        zakaz.click();










    }
}
