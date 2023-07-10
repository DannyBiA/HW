package domaci.Domaci7.tests;

import domaci.Domaci7.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTestHeroku extends BaseTest {
    String Username;
    String Password;
    String invalidUsername;
    String invalidPassword;
    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.get(homeURL);
        Username = excelReaderHeroku.getStringData("Podaci", 1, 0);
        Password = excelReaderHeroku.getStringData("Podaci", 1, 1);
        invalidUsername = excelReaderHeroku.getStringData("Podaci", 1, 2);
        invalidPassword = excelReaderHeroku.getStringData("Podaci", 1, 3);
    }
    @Test (priority = 10)
    public void userCanLogIn() {
        homePageHeroku.clickOnBaseAuth();
        String URL = "https://" + Username + ":" + Password + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        String ocekivanURL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertEquals(driver.getCurrentUrl(), ocekivanURL);

        String ocekivanTitle = "Basic Auth";
        Assert.assertEquals(profilePageHeroku.getNaslovText(), ocekivanTitle);

        String ocekivanMessage = "Congratulations! You must have the proper credentials.";
        Assert.assertEquals(profilePageHeroku.getPorukaText(), ocekivanMessage);
    }
    @Test (priority = 20)
    public void userCannotLogInWithInvalidUsername() {
        homePageHeroku.clickOnBaseAuth();
        String URL = "https://" + invalidUsername + ":" + Password + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        String ocekivanURL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertNotEquals(driver.getCurrentUrl(), ocekivanURL);
    }
    @Test (priority = 30)
    public void userCannotLogInWithInvalidPassword() {
        homePageHeroku.clickOnBaseAuth();
        String URL = "https://" + Username + ":" + invalidPassword + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        String ocekivanURL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertNotEquals(driver.getCurrentUrl(), ocekivanURL);
    }
    @Test (priority = 40)
    public void userCannotLogInWithInvalidUsernameAndPassword() {
        homePageHeroku.clickOnBaseAuth();
        String URL = "https://" + invalidUsername + ":" + invalidPassword + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(URL);

        String ocekivanURL = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
        Assert.assertNotEquals(driver.getCurrentUrl(), ocekivanURL);
    }
}