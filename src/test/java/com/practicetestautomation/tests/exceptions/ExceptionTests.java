package com.practicetestautomation.tests.exceptions;

import com.practicetestautomation.baseobjects.ExceptionPage;
import com.practicetestautomation.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTests extends BaseTest {

    @Test
    public void NoSuchElementException(){

        ExceptionPage exceptionpage= new ExceptionPage(driver);
        exceptionpage.visit();
        exceptionpage.pushAddButton();
        Assert.assertTrue(exceptionpage.isRowTwoDisplayedAfterWait(),"row 2 input field is not displayed");
    }
    @Test
    public void TimeoutException(){
        ExceptionPage exceptionpage= new ExceptionPage(driver);
        exceptionpage.visit();
        exceptionpage.pushAddButton();
        Assert.assertTrue(exceptionpage.isRowTwoDisplayedAfterWait(),"row 2 input field is not displayed");

    }

    @Test
    public void ElementNotInteractableExceptionTest(){

        ExceptionPage exceptionsPage = new ExceptionPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        exceptionsPage.isRowTwoDisplayedAfterWait();
        exceptionsPage.enterFoodInRow2("Sushi");
        exceptionsPage.saveRow2();
        Assert.assertEquals(exceptionsPage.getSuccessMessage(), "Row 2 was saved", "Message is not expected");
    }

     @Test
    public void invalidElementStateExceptionTest(){
        ExceptionPage exceptionsPage = new ExceptionPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        exceptionsPage.isRowTwoDisplayedAfterWait();
        exceptionsPage.enterFoodInRow2("Sushi");
        exceptionsPage.saveRow2();
        Assert.assertEquals(exceptionsPage.getSuccessMessage(), "Row 2 was saved", "Message is not expected");
    }
    @Test
    public void staleElementReferenceExceptionTest(){
        ExceptionPage exceptionsPage = new ExceptionPage(driver);
        exceptionsPage.visit();
        exceptionsPage.pushAddButton();
        Assert.assertTrue(exceptionsPage.isInstructionsElementHiddenAfterWait(), "Instructions text is still displayed");
    }
}