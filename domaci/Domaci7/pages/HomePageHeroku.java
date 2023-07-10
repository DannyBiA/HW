package domaci.Domaci7.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageHeroku {
    public WebDriver driver;
    WebElement basicAuthLink;
    public WebElement getBasicAuthLink() {
        return driver.findElement(By.linkText("Basic Auth"));
    }
    public HomePageHeroku(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnBaseAuth() {
        getBasicAuthLink().click();
    }
}