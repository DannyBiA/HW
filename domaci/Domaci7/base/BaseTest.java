package domaci.Domaci7.base;

import domaci.Domaci7.pages.HomePageHeroku;
import domaci.Domaci7.pages.ProfilePageHeroku;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public HomePageHeroku homePageHeroku;
    public ProfilePageHeroku profilePageHeroku;
    public ExcelReaderHeroku excelReaderHeroku;

    public String homeURL;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        homePageHeroku = new HomePageHeroku(driver);
        profilePageHeroku = new ProfilePageHeroku(driver);
        excelReaderHeroku = new ExcelReaderHeroku("C:\\Users\\sarac\\IdeaProjects\\Selenium\\src\\test\\java\\domaci\\Domaci7\\Heroku.xlsx");
        homeURL = excelReaderHeroku.getStringData("Linkovi", 1, 0);
    }
    @AfterClass
    public void tearDown() {
    }
}