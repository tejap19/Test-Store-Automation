package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.myAccountPage;
import pageObjects.searchPage;

public class wishlistTest extends baseClass{

    @Test
    void wishlist(){
        try {

            homePage home = new homePage(driver);
            home.setLoginOrRegister();

            loginPage login = new loginPage(driver);
            login.setLoginName("tejap1999");
            login.setPassword("Password@19");
            login.setSignIn();

            home.setHomeBtn();
            home.setSearchBar("t-shirts");
            home.setSearchIcon();

            searchPage search = new searchPage(driver);
            Assert.assertTrue(search.setTShitsValidation(),"T-SHIRTS NOT DISPLAYED");
            search.setWishlist();
            Assert.assertTrue(search.setWishlistValidation(),"NOT ADDED TO WISHLIST");

            home.setHomeBtn();
            home.setSearchBar("shampoo");
            home.setSearchIcon();

            search.setShampoo();
            Assert.assertTrue(search.setShampooValidation(),"SHAMPOO NOT DISPLAYED");
            search.setWishlist();
            Assert.assertTrue(search.setWishlistValidation(),"NOT ADDED TO WISHLIST");

            home.setHomeBtn();
            home.setMyAccount();

            myAccountPage account = new myAccountPage(driver);
            account.setDashboard();
            account.setAccountWishlist();

        }catch (Exception e){
            System.out.println("Failed");
        }



    }
}
