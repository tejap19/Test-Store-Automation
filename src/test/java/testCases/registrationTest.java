package testCases;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.*;
import java.util.random.*;

import java.time.Duration;

public class registrationTest extends baseClass {

    @Test
    void register() {
        homePage home = new homePage(driver);
        home.setMouseHover();
        home.setRegistration();

        registrationPage registeration = new registrationPage(driver);
        registeration.setName("Teja P");
        registeration.setMailId(randomString()+"@gmail.com");
        registeration.setPassword("admin@123");
        registeration.setReEnterPassword("admin@123");
        registeration.setVerify();
    }

}