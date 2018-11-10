package com.qatestlab.prestashopautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";

        WebDriver driver = getDriver();
        driver.get(url);


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
        driver.quit();

    }

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        return new ChromeDriver();
    }
}
