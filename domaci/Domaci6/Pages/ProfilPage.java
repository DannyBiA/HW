package domaci.Domaci6.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ProfilPage {
    WebDriver driver;
    WebElement naslov;
    WebElement poruka;
    public WebElement getNaslov() {
        return driver.findElement(By.tagName("h3"));
    }
    public WebElement getPoruka() {
        return driver.findElement(By.tagName("p"));
    }
    public ProfilPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getNaslovText() {
        return getNaslov().getText();
    }
    public String getPorukaText() {
        return getPoruka().getText();
    }
}