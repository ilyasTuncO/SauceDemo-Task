package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "title")
    public WebElement subTitleLocator;

    public boolean isSubTitleDisplayed(){
        return subTitleLocator.isDisplayed();
    }

}