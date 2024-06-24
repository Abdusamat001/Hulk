package com.demoqa.pages;

import com.demoqa.driver.DriverManeger;
import com.demoqa.entities.Employee;
import com.demoqa.entities.PractiseFormEntity;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormsPage extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firsNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//label[contains(@for,'gender-radio')]")
    public List<WebElement>  genderBtn;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement birthInput;

    @FindBy(id = "subjectsInput")
    public WebElement subjectsInput;

    @FindBy(xpath = "(//label[contains(text(),'Sports')])")
    public WebElement hobbiesBtn;


    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;


    @FindBy(id = "react-select-3-input")
    public WebElement stateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement cityInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;



    @FindBy(xpath = "(//button[@type='button'])")
    public WebElement closeAlert;

    public PracticeFormsPage fillUpPracticeFormPage(PractiseFormEntity practiseFormEntity){
        webElementActions.sendKeys(firsNameInput,practiseFormEntity.getFirstName())
                .sendKeys(lastNameInput,practiseFormEntity.getLastName())
                .sendKeys(userEmailInput,practiseFormEntity.getEmail())
                .click(genderBtn.get(random.nextInt(genderBtn.size())))
                .sendKeys(userNumberInput,practiseFormEntity.getNumber())
                .sendKeys(subjectsInput,practiseFormEntity.getSubject())
                .click(hobbiesBtn)
                .sendKeys(currentAddressInput,practiseFormEntity.getCurrentAddress())
                .sendKeysWithEnter(stateInput,practiseFormEntity.getState())
                .sendKeysWithEnter(cityInput,practiseFormEntity.getCity())
                .click(submitBtn);
        return this;

    }


}
