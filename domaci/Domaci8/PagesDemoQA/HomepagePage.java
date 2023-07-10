package domaci.Domaci8.PagesDemoQA;

import domaci.Domaci8.BaseDemoQA.BaseTestDemoQA;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePage extends BaseTestDemoQA {

    public HomepagePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[1]")
    public WebElement elementsCard;


    public void clickOnElements() {
        elementsCard.click();
    }

}

