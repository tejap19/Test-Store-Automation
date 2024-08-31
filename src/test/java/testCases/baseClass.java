package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.time.Duration;

public class baseClass {
     public WebDriver driver;

    @BeforeClass
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    void tearDown()  {
        driver.quit();
    }

    public static String randomString(){
        String genteratedString = RandomStringUtils.randomAlphabetic(6);
        return genteratedString;
    }
    public static String randomNumber(){
        String randomNum = RandomStringUtils.randomNumeric(10);
        return randomNum;
    }

    public static void dropDownMethod(WebElement xpath, String text){
        Select dropDown = new Select(xpath);
        dropDown.selectByVisibleText(text);
    }
}
