package domaci.Domaci3;
//  Domaci Zadatak 2:
//  Ulogujte se na demoqa(https://demoqa.com/ -> Book Store Application) preko cookies-a, dodati dve knjig
//  e na svoj nalog, zatim se izlogovati brisanjem cookies-a.
//  Ulogovati se ponovo preko log-in forme i potvrditi da se knjige i dalje nalaze na nalogu.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci3SviPodaci {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/login");

        Cookie login1 = new Cookie("userID", "73814ae49c0f895a0ef17ab31db00c96");
        Cookie login2 = new Cookie("userName","saracdane");
        Cookie login3 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InNhcmFjZGFuZSIsInBhc3N3b3JkIjoiRGFuaWxvKjk3IiwiaWF0IjoxNjg2MTMzMTc4fQ.1caReh2tGMYpb2vGl0utfunNNpUt6Z2d0YDnHwcFunY");
        Cookie login4 = new Cookie("expires", "2023-06-14T10%3A37%3A24.773Z");

        driver.manage().addCookie(login1);
        driver.manage().addCookie(login2);
        driver.manage().addCookie(login3);
        driver.manage().addCookie(login4);
        driver.navigate().refresh();

        driver.get("https://demoqa.com/books/");

        WebElement git = driver.findElement(By.linkText("Git Pocket Guide"));
        git.click();

        WebElement dodavanje = driver.findElement(By.id("addNewRecordButton"));
        dodavanje.click();

        Thread.sleep(1500);


        driver.switchTo().alert().accept();

        WebElement javaScript = driver.findElement(By.linkText("Learning JavaScript Design Patterns"));
        javaScript.click();

        Thread.sleep(1500);




        driver.switchTo().alert().accept();

        Thread.sleep(1500);
        WebElement dodavanje2 = driver.findElement(By.id("addNewRecordButton"));

        Thread.sleep(1500);
        dodavanje2.click();  //nije hteo sa prvim dodavanje.click();  nejasno mi je zasto

        Thread.sleep(1500);


        driver.switchTo().alert().accept();

        driver.navigate().refresh();



    }
}
