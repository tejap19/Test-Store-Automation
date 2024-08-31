package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.*;

public class registrationTest extends baseClass {

    @Test
    void register() {
        homePage home = new homePage(driver);
        home.setLoginOrRegister();

        loginPage login = new loginPage(driver);
        try {
            login.setRegisterOpt();
            login.setClickContinue();


        registrationPage register = new registrationPage(driver);
        register.setFirstName("tej");
        register.setLastName("p");
        register.setMailId(randomString()+"@gmail.com");
        register.setNumber(randomNumber());
        register.setAddress("church street");
        register.setCity("bangle");
        register.setState("Angus");
        register.setZipcode("70087");
        register.setCountry("United Kingdom");
        register.setLoginId(randomString());
        register.setPassword("Admin@123");
        register.setConfirmPassword("Admin@123");
        register.setNewsSubscribe();
        register.setPrivacyPolicy();
        register.setSubmit();


            System.out.println("YOUR ACCOUNT HAS BEEN CREATED!");
        }catch (Exception e){
            System.out.println("ACCOUNT REGISTRATION FAILED");
        }

    }

}