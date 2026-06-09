package com.practicetestautomation.baseobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private By usernameInputLocator=By.id("username");
    private By passwordInputLocator=By.id("password");
    private By submitButtonLocator=By.id("submit");
    private By errorMessageLocator=By.id("error");

    public LoginPage(WebDriver driver) {

        super(driver);
        System.out.println("called the super constructor");
    }

    public void visit(){
        super.visit("https://practicetestautomation.com/practice-test-login/");
    }

    public void enterUsername(String username){
        System.out.println("Send username");
        driver.findElement(usernameInputLocator).sendKeys(username);
    }

    public void enterPassword(String password){
        System.out.println("Send password");
        driver.findElement(passwordInputLocator).sendKeys(password);
    }

    public void clickSubmitButton(){
        System.out.println("Click on submit button");
        driver.findElement(submitButtonLocator).click();
    }

    public SuccessfulLoginPage executeLogin(String username, String password){
        System.out.println("Executing successful login");
        enterUsername(username);
        enterPassword(password);
        clickSubmitButton();
        return new SuccessfulLoginPage(driver);
    }

    public String getErrorMessage(){
        WebElement errorMessageElement=waitForElement(errorMessageLocator);
        return errorMessageElement.getText();
    }

}
