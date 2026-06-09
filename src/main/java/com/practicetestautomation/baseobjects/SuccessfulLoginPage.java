package com.practicetestautomation.baseobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulLoginPage extends BasePage {

    private By logOutButton=By.linkText("Log out");

     public SuccessfulLoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonDisplayed(){
         return isDisplayed(logOutButton);
    }

    public void load(){
         waitForElement(logOutButton);
    }
}
