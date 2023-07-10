package domaci.Domaci4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");
        WebElement basicAuth = driver.findElement(By.linkText("Basic Auth"));
        basicAuth.click();
        String username = "admin";
        String password = "admin";
        String URL = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);
        WebElement tacno = driver.findElement(By.xpath("/html/body/div[2]/div/div/p"));
        Assert.assertEquals(tacno.getText(), "Congratulations! You must have the proper credentials.");
    }
}
