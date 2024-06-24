package com.demoqa.pages;

import com.demoqa.enams.TopBarMenuEnums;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangePage extends BasePage{
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
    public WebElement adminBtn;

    @FindBy(xpath = "//div[@class='oxd-topbar-body']")
    public WebElement topBarParent;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement userPasswordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;


    public OrangePage fillUpRegistration(){

        webElementActions.sendKeys(usernameInput,"Admin")
                .sendKeys(userPasswordInput,"admin123")
                .click(submitBtn)
                .click(adminBtn);
        return this;
    }
    public WebElement getNavigationBar(){
        return topBarParent;
    }
    public OrangePage clickMainMenuItem(TopBarMenuEnums topBarMenuEnums){
        WebElement navBar = getNavigationBar();
        WebElement mainMenuItem = navBar.findElement(By.xpath(".//li/span[contains(text(),'"+topBarMenuEnums.getTopBarmenu()+"')]"));
        mainMenuItem.click();
        return this;
    }

    public OrangePage clickSubMenuItem(String topBarMenuEnums){
        WebElement itemsBar = getNavigationBar();
        WebElement subMenuItem = itemsBar.findElement(By.xpath(".//li/a[contains(text(),'"+topBarMenuEnums+"')]"));
        subMenuItem.click();
        return this;
    }

    public OrangePage topBarAndItems(TopBarMenuEnums topBar,String items){
        clickMainMenuItem(topBar);
        clickSubMenuItem(items);
        return this;
    }

}
