package com.safebear.auto.pages;


import com.safebear.auto.pages.locators.AddProductPageLocators;
import com.safebear.auto.utils.Utils;

public class AddProductPage extends BasePage {

    AddProductPageLocators locators = new AddProductPageLocators();

    public void enterProductName(String name){

        waitForElement(locators.getNameFieldLocator()).sendKeys(name);

    }
    public void enterProductDescription(String description){

        waitForElement(locators.getDescripionFieldLocator()).sendKeys(description);

    }
    public void enterProductPrice(String price){

        waitForElement(locators.getPriceFieldLocator()).sendKeys(price);

    }

    public void clickOnHomeButton(){
        waitForElement(locators.getHomePageButtonLocator()).click();
    }
    public void clickOnSubmitButton(){ waitForElementToBeEnabled(locators.getSubmitButtonLocator()).click();
    }




}
