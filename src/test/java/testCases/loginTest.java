package testCases;

import basicUtilities.DataProviders;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;

public class loginTest extends baseClass{

    private static final Logger log = LoggerFactory.getLogger(loginTest.class);

    @Test(dataProvider = "testData", dataProviderClass = DataProviders.class)
    void login(String loginId,String pwd) {
        homePage home = new homePage(driver);
        home.setLoginOrRegister();

        loginPage login = new loginPage(driver);
        login.setLoginName(loginId);
        login.setPassword(pwd);
        login.setSignIn();

//        try {
//            // Verify if login is successful or not
//            myAccountPage account = new myAccountPage(driver);
//            Assert.assertTrue(account.setMyAccountValidation());
//            System.out.println("Test passed for "+ loginId +" "+ pwd);
//        } catch (NoSuchElementException e) {
//            System.out.println("Test failed for "+ loginId +" "+ pwd);
//        } finally {
//            try {
//                login.setLogOff();
//            } catch (NoSuchElementException e) {
//                System.out.println("Logout link not found");
//            }
//        }

        try {
            myAccountPage account = new myAccountPage(driver);
            boolean isAccountValid = account.setMyAccountValidation();

            if (isAccountValid) {
                System.out.println("Test passed for " + loginId + " " + pwd);
            } else {
                Assert.fail("Test failed for " + loginId + " " + pwd + " - Account validation failed.");
            }
        } catch (NoSuchElementException e) {
            Assert.fail("Test failed for " + loginId + " " + pwd + " - NoSuchElementException: " + e.getMessage());
        } finally {
            try {
                login.setLogOff();
            } catch (NoSuchElementException e) {
                System.out.println("Logout link not found");
            }
        }

    }
}
