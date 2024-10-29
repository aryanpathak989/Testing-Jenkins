package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CustomCondition implements ExpectedCondition<Boolean> {

    By elementLoctor;

    CustomCondition(By elementLoctor){
        this.elementLoctor=elementLoctor;
    }


    public Boolean apply(WebDriver driver){
        return driver.findElement(elementLoctor).isDisplayed();
    }

}
