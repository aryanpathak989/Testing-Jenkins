package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Lecture {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        By userNameLocator = By.id("user-name");
        By passwordLocator = By.id("password");
        By InputButtonClicked = By.id("login-button");
        By humBurgerLoctors = By.id("react-burger-menu-btn");
        By logoutLocators = By.linkText("Logout2");

        driver.findElement(userNameLocator).sendKeys("standard_user");
        driver.findElement(passwordLocator).sendKeys("secret_sauce");
        driver.findElement(InputButtonClicked).click();
        driver.findElement(humBurgerLoctors).click();

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(500));
        wait.ignoring(NoSuchElementException.class);
        wait.withMessage("Aryan condition not satisfied after waiting so long");
        wait.until(ExpectedConditions.elementToBeClickable(logoutLocators));

        driver.findElement(logoutLocators).click();
    }

}
