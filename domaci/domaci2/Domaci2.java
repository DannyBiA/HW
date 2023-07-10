package domaci.domaci2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLoginPage = driver.findElement(By.linkText("Test Login Page"));
        testLoginPage.click();


        String expected = "Logged In Successfully";
        String validUsername = "student";
        String validPassword = "Password123";



        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(validUsername);
        Thread.sleep(1500);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(validPassword);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement uspesanLogin = driver.findElement(By.className("post-title"));
        Assert.assertEquals(uspesanLogin.getText(), expected);

        WebElement logout = driver.findElement(By.linkText("Log out"));
        logout.click();


    }
}
