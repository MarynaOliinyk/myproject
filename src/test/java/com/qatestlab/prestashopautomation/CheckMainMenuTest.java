//package com.qatestlab.prestashopautomation;
//
//import com.qatestlab.prestashopautomation.utils.BaseScript;
//import com.qatestlab.prestashopautomation.utils.WebDriverBase;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//
//import static org.junit.Assert.assertTrue;
//
//public class CheckMainMenuTest extends WebDriverBase {
//
//
//   public void checkMainMenuTest(){
//        String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
//        String login = "webinar.test@gmail.com";
//        String pass = "Xcg7299bnSmMuRLp9ITw";
//
//
//        WebElement email = driver.findElement(By.id("email"));
//        email.sendKeys(login);
//
//        WebElement password = driver.findElement(By.name("passwd"));
//        password.sendKeys(pass);
//
//        WebElement loginButton = driver.findElement(By.name("submitLogin"));
//        loginButton.click();
//
//        String dashboardsButton = "//span[contains(text(),'Dashboard')]";
//        String dashboardsText = "Dashboard";
//        String dashboardsHeaderLocator = "breadcrumb-current";
//
//        String ordersButton = "//span[contains(text(),'Заказы')]";
//        String ordersText = "Заказы";
//        String ordersHeaderLocator = "breadcrumb-container";
//
//        String catalogsButton = "//span[contains(text(),'Каталог')]";
//        String catalogsHeaderLocator = ".//h2[@class='title']";
//        String catalogsHeaderText = "товары";
//
//        String clientsButton = "//span[contains(text(),'Клиенты')]";
//        String clientsText = "Клиенты";
//        String clientsHeaderLocator = "breadcrumb-container";
//        String clientsHeaderText = "Управление клиентами";
//
//        String supportsButton = "//span[contains(text(),'Служба поддержки')]";
//        String supportsText = "Служба поддержки";
//        String supportsHeaderLocator = "breadcrumb-container";
//        String supportsHeaderText = "Customer Service";
//
//        String statisticsButton = "//span[contains(text(),'Статистика')]";
//        String statisticsText = "Статистика";
//        String statisticsHeaderLocator = "page-title";
//
//        String modulesButtonLocator = "//span[contains(text(),'Modules')]";
//        String modulesHeaderLocator = ".//h2[@class='title']";
//        String modulesHeaderText = "Выбор модуля";
//        String modulesTitlesText = "prestashop-automation";
//
//        String designsButton = "//span[contains(text(),'Design')]";
//        String designsHeaderLocator = "page-title";
//        String designsTitlesText = "Шаблоны";
//
//        String deliveriesButton = "//span[contains(text(),'Доставка')]";
//        String deliveriesText = "Перевозчики";
//        String deliveriesHeaderLocator = "page-title";
//        String deliveriesTitlesText = "Курьеры";
//
//        String paymentsButton = "//span[contains(text(),'Способ оплаты')]";
//        String paymentsHeaderLocator = ".//h2[@class='page-title']";
//        String paymentsTitlesText = "Payment Methods";
//
//        String internationalsButton = "//span[contains(text(),'International')]";
//        String internationalsHeaderLocator = "page-title";
//        String internationalsTitlesText = "Локализация";
//
//        String shopParametrsButton = "//span[contains(text(),'Shop Parameters')]";
//        String shopParametrsHeaderLocator = "page-title";
//        String shopParametrsTitlesText = "General";
//
//        String configurationsButton = "//span[contains(text(),'Конфигурация')]";
//        String configurationsHeaderLocator = "page-title";
//        String configurationsTitlesText = "Information";
//
//        Thread.sleep(1000);
//        printTitleAndRefreshWithClassName(dashboardsButton, driver, dashboardsHeaderLocator, dashboardsText, dashboardsText);
//        printTitleAndRefreshWithClassName(ordersButton, driver, ordersHeaderLocator, ordersText, ordersText);
//        printTitleAndRefreshWithXPath(catalogsButton, driver, catalogsHeaderLocator, catalogsHeaderText, catalogsHeaderText);
//        printTitleAndRefreshWithClassName(clientsButton, driver, clientsHeaderLocator, clientsText, clientsHeaderText);
//        printTitleAndRefreshWithClassName(supportsButton, driver, supportsHeaderLocator, supportsText, supportsHeaderText);
//        printTitleAndRefreshWithClassName(statisticsButton, driver, statisticsHeaderLocator, statisticsText, statisticsText);
//        printTitleAndRefreshWithXPath(modulesButtonLocator, driver, modulesHeaderLocator, modulesHeaderText, modulesTitlesText);
//        printTitleAndRefreshWithClassName(designsButton, driver, designsHeaderLocator, designsTitlesText, designsTitlesText);
//        printTitleAndRefreshWithClassName(deliveriesButton, driver, deliveriesHeaderLocator, deliveriesText, deliveriesTitlesText);
//        printTitleAndRefreshWithXPath(paymentsButton, driver, paymentsHeaderLocator, paymentsTitlesText, paymentsTitlesText);
//        printTitleAndRefreshWithClassName(internationalsButton, driver, internationalsHeaderLocator, internationalsTitlesText, internationalsTitlesText);
//        printTitleAndRefreshWithClassName(shopParametrsButton, driver, shopParametrsHeaderLocator, shopParametrsTitlesText, shopParametrsTitlesText);
//        printTitleAndRefreshWithClassName(configurationsButton, driver, configurationsHeaderLocator, configurationsTitlesText, configurationsTitlesText);
//    }
//

//public static void printTitleAndRefreshWithClassName(By locator, WebDriver driver, String locatorsTitle, String headersText, String titlesText) throws InterruptedException {
//        WebElement webElementName = driver.findElement(locator);
//        webElementName.click();
//        WebElement headersName = driver.findElement(locator);
//        System.out.println(headersName.getText());
//        driver.navigate().refresh();
//        headersName = driver.findElement(locator);
//        assertTrue(headersName.getText().contains(headersText));//for pages title
//        assertTrue(driver.getTitle().contains(titlesText));

//    public static void printTitleAndRefreshWithXPath(By locator, String locatorsTitle, String headersText, String titlesText) throws InterruptedException {
//        WebElement webElementName = driver.findElement(locator));
//        webElementName.click();
//        WebElement headersName = driver.findElement((locatorsTitle));
//        System.out.println(headersName.getText());
//        driver.navigate().refresh();
//        headersName = driver.findElement((locatorsTitle));
//        assertTrue(driver.getTitle().contains(titlesText));//for pages title
//        assertTrue(headersName.getText().contains(headersText));//для крупного заголовка на странице
//    }

//    public static WebDriver getDriver() {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
//        return new ChromeDriver();
//    }
//}
