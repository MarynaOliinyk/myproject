package com.qatestlab.prestashopautomation;

import com.qatestlab.prestashopautomation.utils.WebDriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    protected WebDriver webDriver;
    protected WebDriverBase webDriverBase;
    private WebElement emailFieldEl;
    private WebElement loginButtonEl;
    private WebElement passwordFieldEl;
    By emailField = By.id("email");
    By passwordField = By.xpath("passwd");
    By loginButton = By.xpath(".//*[@id='passwordNext']/content/span");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverBase = new WebDriverBase(webDriver);
    }
    public void open(String url) {
        webDriver.get(url);
    }

}
