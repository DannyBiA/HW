package domaci.domaci2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci2NetacanPassword {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/");

        WebElement practice = driver.findElement(By.id("menu-item-20"));
        practice.click();

        WebElement testLoginPage = driver.findElement(By.linkText("Test Login Page"));
        testLoginPage.click();


        String expected = "Your password is invalid!";
        String validUsername = "student";
        String invalidPassword = "incorrectPassword";



        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(validUsername);


        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(invalidPassword);

        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();

        WebElement neuspesanLogin = driver.findElement(By.className("show"));
        Thread.sleep(1000);
        Assert.assertEquals(neuspesanLogin.getText(), expected);
}
}