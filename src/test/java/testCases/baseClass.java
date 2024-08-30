package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class baseClass {
     public WebDriver driver;

    @BeforeClass
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");
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
}
