package com.practicetestautomation.baseobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExceptionPage extends BasePage{

    private By addButton= By.id("add_btn");
    private By editButtonLocator = By.id("edit_btn");
    private By row1inputField = By.xpath("//div[@id='row1']/input");
    private By row2inputField= By.xpath("//div[@id='row2']/input");
    private By row1SaveButton = By.xpath("//div[@id='row1']/button[@name='Save']");
    private By row2SaveButton = By.xpath("//div[@id='row2']/button[@name='Save']");
    private By successMessage = By.id("confirmation");
    private By instructionsLocator = By.id("instructions");

    public ExceptionPage(WebDriver driver) {
        super(driver);
    }

    public void visit(){
        super.visit("https://practicetestautomation.com/practice-test-exceptions/");
    }

    public void pushAddButton(){
        driver.findElement(addButton).click();
    }

    public void pushEditButton() {
        driver.findElement(editButtonLocator).click();
    }

    public boolean isRowTwoDisplayedAfterWait(){
        return waitForIsDisplayed(row2inputField);
    }

    public void enterFoodInRow1(String name) {
        WebElement row1Input = driver.findElement(row1inputField);
        row1Input.clear();
        row1Input.sendKeys(name);
    }

    public void enterFoodInRow2(String name) {
        driver.findElement(row2inputField).sendKeys(name);
    }

    public void saveRow1() {
        driver.findElement(row1SaveButton).click();
    }

    public void saveRow2() {
        driver.findElement(row2SaveButton).click();
    }

    public String getSuccessMessage() {
        return waitForElement(successMessage).getText();
    }

    public boolean isInstructionsElementHiddenAfterWait() {
        return waitForIsHidden(instructionsLocator);
    }
}
