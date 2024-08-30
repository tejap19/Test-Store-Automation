package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTest {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    void setUp(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void login(){
        pageObjectClass login = new pageObjectClass(driver);
        login.setUserName("Admin");
        login.setPassword("admin123");
        login.setLogin();
    }

    @AfterClass
    void quit(){
        driver.quit();
    }
}
