package com.qatestlab.prestashopautomation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.events.WebDriverEventListener;


public class EventHandler implements WebDriverEventListener {
    private static final Logger LOG = LogManager.getLogger(EventHandler.class);


//    public void myClick(String myxpath){
//
//        driver.findElement(By.xpath(myxpath)).click();
//        //calling checkAlert method to cross check
//    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        LOG.debug("Should be " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        LOG.debug("Element found");
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        LOG.debug("Should click " + element.getTagName());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        LOG.debug("Clicked successfull");
    }

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        LOG.debug("");
    }

    @Override
    public void afterNavigateTo(String url, WebDriver webDriver) {
        LOG.debug("WebDriver navigated to ‘" + url + "‘");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }
}
