package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class WebDriverUtils {

    private static final int WAIT_IN_SECONDS = 10;

    @Autowired
    private WebDriver driver;

    public void waitForElementToBePresent(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_IN_SECONDS)).until(ExpectedConditions.visibilityOf(element));
    }
    
}
