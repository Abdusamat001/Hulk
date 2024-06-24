package com.demoqa.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FoodList {

    @Test
    void findFoodList(){
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://nambafood.kg/zira");

        List<WebElement> foodlist = driver.findElements(By.xpath("//div[@class='card--item-info']"));

        for (WebElement food:foodlist){
            System.out.println(food.getText());
        }
        System.out.println(foodlist.size());
    }

}
