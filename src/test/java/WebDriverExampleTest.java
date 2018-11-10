import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverExampleTest {
    public static void main(String[] args) {
        WebDriver driver = getDriver();
        driver.get("http://www.bing.com/");


        WebElement searchInput = driver.findElement(By.id("sb_form_q"));
        searchInput.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.name("go"));
        searchButton.click();


    }

    public static WebDriver getDriver() {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        return new ChromeDriver();
    }
}