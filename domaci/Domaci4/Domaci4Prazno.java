package domaci.Domaci4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci4Prazno {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        WebElement basic = driver.findElement(By.linkText("Basic Auth"));
        basic.click();
        String username = "";
        String password = "";
        String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
        String ocekivani = "https://amin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertNotEquals(ocekivani, driver.getCurrentUrl());
    }
}