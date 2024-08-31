package testCases;

import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;

public class myAccountTest extends baseClass{

    @Test
    void myAccount(){
        homePage home = new homePage(driver);
        home.setHomeBtn();
        home.setLoginOrRegister();

        loginPage login = new loginPage(driver);
        login.setLoginName("tejap1999");
        login.setPassword("Password@19");
        login.setSignIn();

        home.setHomeBtn();
        home.setMyAccount();
        try {
            myAccountPage account = new myAccountPage(driver);
            account.setDashboard();
            account.setAccountWishlist();
            account.setAccountWishlistValidation();
            account.setEditAccount();
            account.setEditAccountValidation();
            account.setChangePassword();
            account.setChangePasswordValidation();
            account.setManageAddress();
            account.setManageAddressValidation();
            account.setOrderHistory();
            account.setOrderHistoryValidation();
            account.setTransactionHistory();
            account.setTransactionHistoryValidation();
            account.setDownloads();
            account.setDownloadsValidation();
            account.setNotifications();
            account.setNotificationsValidation();
            account.setLogOff();
            account.setLogOffValidation();

            System.out.println("Test Passed");

        }catch (Exception e){
            System.out.println("Test Failed");
        }

    }
}
