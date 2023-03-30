package com.test.pages;

import com.test.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id=\"L2AGLb\"]/div")
    private WebElement consent;
    @FindBy(className = "gLFyf")
    private WebElement searchBox;
    @FindBy(id = "search")
    private WebElement search;
    public void giveConsent() { consent.click(); }
    public void searchFor(String searchTerm) {
        searchBox.sendKeys(searchTerm);
    }
    public void clickSearchButton() {
        searchBox.submit();
    }
    public void waitForPageToLoad() {
        waitForElementToBePresent(search);
    }
}
