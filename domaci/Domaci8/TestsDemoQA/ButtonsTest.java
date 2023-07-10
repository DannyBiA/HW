package domaci.Domaci8.TestsDemoQA;

import domaci.Domaci8.BaseDemoQA.BaseTestDemoQA;
import domaci.Domaci8.PagesDemoQA.ButtonsPage;
import domaci.Domaci8.PagesDemoQA.ElementsPage;
import domaci.Domaci8.PagesDemoQA.HomepagePage;
import domaci.Domaci8.PagesDemoQA.RadioButtonPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTestDemoQA {

    String expectedMessage;
    public HomepagePage homepagePage;
    public ElementsPage elementsPage;
    public ButtonsPage buttonsPage;
    public RadioButtonPage radioButtonPage;

    @BeforeMethod
    public void pageSetUp() {
        homepagePage = new HomepagePage();
        elementsPage = new ElementsPage();
        buttonsPage = new ButtonsPage();
        radioButtonPage = new RadioButtonPage();
        driver.manage().window().maximize();
        driver.get(homeURL);
    }

    @Test (priority = 10)
    public void doubleClickButtonTest() throws InterruptedException {
        homepagePage.clickOnElements();
        elementsPage.clickOnButtonsMenuItem();
        Thread.sleep(2000);
        buttonsPage.doubleClick();

        expectedMessage = "You have done a double click";

        Assert.assertEquals(buttonsPage.doubleClickMessage.getText(), expectedMessage);
    }

    @Test (priority = 20)
    public void rightClickButtonTest() {
        homepagePage.clickOnElements();
        elementsPage.clickOnButtonsMenuItem();
        buttonsPage.rightClick();

        expectedMessage = "You have done a right click";
        Assert.assertEquals(buttonsPage.rightClickMessage.getText(), expectedMessage);
    }

    @Test (priority = 30)
    public void clickMeButtonTest() {
        homepagePage.clickOnElements();
        elementsPage.clickOnButtonsMenuItem();
        buttonsPage.clickMe();

        expectedMessage = "You have done a dynamic click";
        Assert.assertEquals(buttonsPage.clickMeMessage.getText(), expectedMessage);
    }

    @Test (priority = 40)
    public void clickOnYesRadioButton() {
        homepagePage.clickOnElements();
        elementsPage.clickOnRadioButtonMenuItem();
        radioButtonPage.clickYesRadioButton(radioButtonPage.yesRadioButton);

        expectedMessage = "You have selected Yes";
        Assert.assertEquals(radioButtonPage.yesMessage.getText(), expectedMessage);
    }

    @Test (priority = 50)
    public void clickOnImpressiveRadioButton() {
        homepagePage.clickOnElements();
        elementsPage.clickOnRadioButtonMenuItem();
        radioButtonPage.clickYesRadioButton(radioButtonPage.impressiveRadioButton);

        expectedMessage = "You have selected Impressive";
        Assert.assertEquals(radioButtonPage.yesMessage.getText(), expectedMessage);
    }

    @Test (priority = 60)
    public void isNoRadioButtonDisabled() {
        homepagePage.clickOnElements();
        elementsPage.clickOnRadioButtonMenuItem();

        Assert.assertFalse(radioButtonPage.noRadioButton.isEnabled());
    }

}
