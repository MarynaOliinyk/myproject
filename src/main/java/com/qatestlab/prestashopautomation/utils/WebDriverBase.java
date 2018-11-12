package com.qatestlab.prestashopautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import org.junit.*;


public class WebDriverBase {

    private static final String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";

    WebDriverWait webDriverWait;
    private static EventFiringWebDriver eventFiringWebDriver;
    static EventHandler handler = new EventHandler();

    public EventFiringWebDriver getEventFiringWebDriver() {
        return eventFiringWebDriver;
    }

    @BeforeClass
    public static void setUp() {
        eventFiringWebDriver = new EventFiringWebDriver(getDriver("chrome"));
        eventFiringWebDriver.register(handler);
        eventFiringWebDriver.get(url);

    }

    @AfterClass
    public static void tearDown() {
        eventFiringWebDriver.quit();
    }


    public static WebDriver getDriver(String browser) {
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        new File(WebDriverBase.class.getResource("geckodriver").getFile()).getPath());
                return new FirefoxDriver();
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", new File(WebDriverBase.class.getResource("chromedriver").getFile()).getPath());
                return new ChromeDriver();
        }
    }

    public WebElement waitForExpectedCondition(ExpectedCondition expectedCondition) {
        return (WebElement) webDriverWait.until(expectedCondition);
    }

}
