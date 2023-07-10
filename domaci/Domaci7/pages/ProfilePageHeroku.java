package domaci.Domaci7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePageHeroku {
    WebDriver driver;
    WebElement Naslov;
    WebElement poruka;
    public WebElement getNaslov() {
        return driver.findElement(By.tagName("h3"));
    }
    public WebElement getPoruka() {
        return driver.findElement(By.tagName("p"));
    }
    public ProfilePageHeroku(WebDriver driver) {
        this.driver = driver;
    }public String getNaslovText() {
        return getNaslov().getText();
    }
    public String getPorukaText() {
        return getPoruka().getText();
    }

}
