package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.cartPage;
import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.searchPage;

public class placeOrderTest extends baseClass{

    @Test
    void placingOrder(){
        searchPage search = new searchPage(driver);

        homePage home = new homePage(driver);
        home.setHomeBtn();
        home.setLoginOrRegister();

        loginPage login = new loginPage(driver);
        login.setLoginName("tejap1999");
        login.setPassword("Password@19");
        login.setSignIn();

        home.setHomeBtn();

        try {
            home.setHomeBtn();
//            home.setSearchBar("shoes");
//            home.setSearchIcon();
//
//            Assert.assertTrue(search.setShoesValidation(),"SHOES NOT DISPLAYED");
//            search.setShoesColorBlack();
//            search.setQuantity("1");
//            search.setAddToCart();

            home.setCart();

            cartPage cart = new cartPage(driver);
            Assert.assertTrue(cart.checkOutValidation(),"CHECKOUT FAILED");
            cart.setCheckOutOpt();
            cart.setConfirmOrder();
            Assert.assertTrue(cart.setSuccess(),"ORDER NOT PLACED");

            System.out.println("ORDER PLACED SUCCESSFULLY ");

        }catch (Exception e){
            System.out.println("PLACING ORDER IS FAILED");
            e.printStackTrace();
        }

    }
}
