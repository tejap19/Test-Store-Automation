package testCases;

import org.testng.Assert;
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
            Assert.assertTrue(account.setAccountWishlistValidation(),"WISHLIST FUNCTION IS NOT WORKING");
            account.setEditAccount();
            Assert.assertTrue(account.setEditAccountValidation(),"EDIT ACCOUNT FUNCTION IS NOT WORKING");
            account.setChangePassword();
            Assert.assertTrue(account.setChangePasswordValidation(),"CHANGE PASSWORD FUNCTION IS NOT WORKING");
            account.setManageAddress();
            Assert.assertTrue(account.setManageAddressValidation(),"CHANGE PASSWORD FUNCTION IS NOT WORKING");
            account.setOrderHistory();
            Assert.assertTrue(account.setOrderHistoryValidation(),"ORDER HISTORY FUNCTION IS NOT WORKING");
            account.setTransactionHistory();
            Assert.assertTrue(account.setTransactionHistoryValidation(),"ORDER HISTORY FUNCTION IS NOT WORKING");
            account.setDownloads();
            Assert.assertTrue(account.setDownloadsValidation(),"ORDER HISTORY FUNCTION IS NOT WORKING");
            account.setNotifications();
            Assert.assertTrue(account.setNotificationsValidation(),"ORDER HISTORY FUNCTION IS NOT WORKING");
            account.setLogOff();
            Assert.assertTrue(account.setLogOffValidation(),"ORDER HISTORY FUNCTION IS NOT WORKING");


            System.out.println("Test Passed");

        }catch (Exception e){
            System.out.println("Test Failed");
        }

    }
}
