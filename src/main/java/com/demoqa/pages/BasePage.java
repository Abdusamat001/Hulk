package com.demoqa.pages;

import com.demoqa.driver.DriverManeger;
import com.demoqa.helper.DropDownHelper;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverManeger.getDriver(),this);
    }

    public WebElementActions webElementActions = new WebElementActions();

    public DropDownHelper dropDownHelper = new DropDownHelper(DriverManeger.getDriver());

    Random random = new Random();
}
