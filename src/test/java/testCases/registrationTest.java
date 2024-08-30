package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.*;

public class registrationTest extends baseClass {

    @Test
    void register() {
        homePage home = new homePage(driver);
        home.setMouseHover();
        home.setRegistration();

        registrationPage registration = new registrationPage(driver);
        registration.setName("Teja P");
        registration.setMailId(randomString()+"@gmail.com");
        registration.setPassword("admin@123");
        registration.setReEnterPassword("admin@123");
        registration.setVerify();

        if (driver.findElement(By.xpath("//i[@aria-label='Amazon']")).isDisplayed()){
            System.out.println("Success");
        }else {
            System.out.println("fail");
        }
    }

}