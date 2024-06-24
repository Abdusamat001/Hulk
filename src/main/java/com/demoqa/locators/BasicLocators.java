package com.demoqa.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {


    WebDriver driver = new ChromeDriver();
    Actions actions = new Actions(driver);


    @Test(description = "Find by ID")
    void findById() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","/Users/macuser/Documents/DemoQaWinter24/src/main/resources/drivers/chromedriver");

//        WebDriver driver = new ChromeDriver();

//        WebDriverManager.chromedriver().setup();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/text-box");
//
//        String name = "Sam";
//        String email = "nurlan.uluus@mail.ru";
//        String currAdd = "Bishkek Kyrgyzstan 12/23";
//        String perAdd = "Bishkek Kyrgyzstan 12/23";
//
//        WebElement fullName = driver.findElement(By.id("userName"));
//        fullName.sendKeys("name");
//
//
//        WebElement emailInput  = driver.findElement(By.id("userEmail"));
//        emailInput.sendKeys("email");
//
//
//        WebElement address = driver.findElement(By.id("currentAddress"));
//        address.sendKeys("Address");
//
//
//        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
//        permanentAddress.sendKeys("Bishkek");
//
//
//        WebElement buttonSubmit = driver.findElement(By.id("submit"));
//        actions.moveToElement(buttonSubmit);
//        buttonSubmit.click();
//
//        Thread.sleep(2000);
//
//        String submitNameText = driver.findElement(By.id("name")).getText();
//        String submitEmailText = driver.findElement(By.id("email")).getText();
//        String submitCurAddText = driver.findElement(By.xpath("//*[@id='output']//p[@id='currentAddress']")).getText();
//        String submitPerAddText = driver.findElement(By.xpath("//*[@id='output']//p[@id='permanentAddress']")).getText();
//
//        submitNameText = submitNameText.replace("Name:", "").trim();
//        submitEmailText = submitEmailText.replace("Email:", "").trim();
//        submitCurAddText = submitCurAddText.replace("Current Address :", "").trim();
//        submitPerAddText = submitPerAddText.replace("Permananet Address :", "").trim();
//
//        Assert.assertEquals(submitNameText, name);
//        Assert.assertEquals(submitEmailText, email);
//        Assert.assertEquals(submitCurAddText, currAdd);
//        Assert.assertEquals(submitPerAddText, perAdd);
//
//        driver.quit();



















        // Home

//        WebElement homelink = driver.findElement(By.xpath("(//textarea[@class = 'form-control'])[1]"));
//        homelink.sendKeys("Well Street 123");
//
//
//        String permanentAddressTxt = driver.findElement(By.xpath("//*[text()='Permanent Address']")).getText();
//        System.out.println(permanentAddressTxt);















//        WebElement fullNameInput = driver.findElement(By.tagName("input"));
//        fullNameInput.sendKeys("John Doe");
//
//        String textBoxText = driver.findElement(By.tagName("h1")).getText();
//        System.out.println(textBoxText);




    }
}
