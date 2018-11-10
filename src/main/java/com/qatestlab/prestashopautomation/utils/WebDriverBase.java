package com.qatestlab.prestashopautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverBase {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public WebDriverBase(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 15);
    }
    public WebElement waitForExpectedCondition (ExpectedCondition expectedCondition){
        return(WebElement) webDriverWait.until(expectedCondition); //ждет пока єлемнт клік

    }
}
