package domaci.Domaci3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Domaci3SviPodaciTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/login");

        Cookie login1 = new Cookie("userID", "93accd2c-295e-4705-878d-7d9d645f4f0b");
        Cookie login2 = new Cookie("userName","saracdane");
        Cookie login3 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InNhcmFjZGFuZSIsInBhc3N3b3JkIjoiRGFuaWxvKjk3IiwiaWF0IjoxNjg2MTYzNjc1fQ.72ahcI8b6cgGd2R5LxUJslpfyf_CrV-Doun91CaYntc");
        Cookie login4 = new Cookie("expires", "2023-06-14T18%3A47%3A55.436Z");
        Cookie login5 = new Cookie("_gid", "GA1.2.960886909.1686150920");

        driver.manage().addCookie(login1);
        driver.manage().addCookie(login2);
        driver.manage().addCookie(login3);
        driver.manage().addCookie(login4);
        driver.manage().addCookie(login5);
        driver.navigate().refresh();


        WebElement profile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div/label/a"));
        profile.click();

        WebElement gotoStore = driver.findElement(By.id("gotoStore"));
        gotoStore.click();

        Thread.sleep(1000);

        WebElement git = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
        git.click();

        Thread.sleep(1000);

        WebElement dodavanje = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje.click();

        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        WebElement returnPage = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        returnPage.click();

        WebElement javaScript = driver.findElement(By.linkText("Learning JavaScript Design Patterns"));
        javaScript.click();

        WebElement dodavanje2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje2.click();

        Thread.sleep(1000);

        driver.switchTo().alert().accept();

        Thread.sleep(1000);

        driver.manage().deleteAllCookies();

        driver.navigate().refresh();

        WebElement login = driver.findElement(By.id("login"));
        login.click();

        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("saracdane");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Danilo*97");
        WebElement loginActual = driver.findElement(By.id("login"));
        loginActual.click();
    }
}