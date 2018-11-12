package com.qatestlab.prestashopautomation;

import com.qatestlab.prestashopautomation.utils.WebDriverBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginTest extends WebDriverBase {
    EventFiringWebDriver driver;

    @Test
    public void loginTest() throws InterruptedException {
        driver = getEventFiringWebDriver();

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(By.name("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement loginButton = driver.findElement(By.xpath("//BUTTON[@name='submitLogin']/self::BUTTON"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement icon = driver.findElement(By.xpath("//IMG[@class='imgm img-thumbnail']/self::IMG"));
        icon.click();

        WebElement logOutButton = driver.findElement(By.id("header_logout"));
        logOutButton.click();

    }

}
