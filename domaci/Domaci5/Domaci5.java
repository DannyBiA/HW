package domaci.Domaci5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Domaci5 {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void beforeTest() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");
    }
    public void logIn(){
        WebElement logIn = driver.findElement(By.id("login"));
        logIn.click();
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("saracdane");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Danilo*97");
        WebElement next = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[4]/div[1]/button"));
        next.click();
    }
    public void profil() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement profile = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]/span"));
        profile.click();
    }
    public void brisanjeKnjiga() throws InterruptedException {
        Thread.sleep(1500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)", "");
        Thread.sleep(1500);
        WebElement brisanjeSvihKnjiga = driver.findElement(By.cssSelector(".text-right.button.di"));
        brisanjeSvihKnjiga.click();
        WebElement potvrda = driver.findElement(By.id("closeSmallModal-ok"));
        potvrda.click();
        Thread.sleep(2500);
        driver.switchTo().alert().accept();
    }
    @Test
    public void dodavanjeJedneKnjige() throws InterruptedException{
        logIn();
        Thread.sleep(1500);
        WebElement knjiga = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
        knjiga.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        WebElement dodavanje = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(2500);
        profil();
    }
    @Test
    public void dodavanjeDveKnjige() throws InterruptedException{
        logIn();
        Thread.sleep(1500);
        WebElement dodavanjePrve = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
        dodavanjePrve.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        WebElement dodavanje = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1500);
        WebElement nazad = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        nazad.click();
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(0, 500)");
        WebElement dodavanjeDruge = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]/div/span/a"));
        dodavanjeDruge.click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement dodavanje1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje1.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(2500);
        profil();
    }
    @Test
    public void dodavanjeTriKnjige() throws InterruptedException{
        logIn();
        Thread.sleep(1500);
        WebElement dodavanjePrve = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
        dodavanjePrve.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        WebElement dodavanje = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1500);
        WebElement nazad = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        nazad.click();
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(0, 500)");
        WebElement dodavanjeDruge = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/span/a"));
        dodavanjeDruge.click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement dodavanje1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje1.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,500)");
        WebElement nazad1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        nazad1.click();
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(0, 500)");
        WebElement trecaKnjiga = driver.findElement(By.id("see-book-Speaking JavaScript"));
        trecaKnjiga.click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement dodavanje2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje2.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(2500);
        profil();
    }
    @Test
    public void dodavanjeCetiriKnjige() throws InterruptedException{
        logIn();
        Thread.sleep(1500);
        WebElement knjigaPrva = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
        knjigaPrva.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        WebElement dodavanje = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1500);
        WebElement nazad = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        nazad.click();
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(0, 500)");
        WebElement drugaaKnjiga = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/span/a"));
        drugaaKnjiga.click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement dodavanje1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje1.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,500)");
        WebElement nazad1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        nazad1.click();
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(0, 500)");
        WebElement trecaKnjiga = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[4]/div/div[2]/div/span/a"));
        trecaKnjiga.click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement dodavanje2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje2.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,500)");
        WebElement nazad2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[1]/button"));
        nazad2.click();
        Thread.sleep(2500);
        js.executeScript("window.scrollBy(0, 500)");
        WebElement cetvrtaKnjiga = driver.findElement(By.id("see-book-Speaking JavaScript"));
        cetvrtaKnjiga.click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1500);
        WebElement dodavanje3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[9]/div[2]/button"));
        dodavanje3.click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(2500);
        profil();
    }
    @AfterMethod
    public void kraj() throws InterruptedException{
        brisanjeKnjiga();
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
    }
}

