package testCases;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.cartPage;
import pageObjects.homePage;
import pageObjects.loginPage;
import pageObjects.searchPage;

public class addToCartTest extends baseClass{

    @Test
    void addToCart(){
        homePage home = new homePage(driver);
        home.setLoginOrRegister();

        loginPage login = new loginPage(driver);
        login.setLoginName("tejap1999");
        login.setPassword("Password@19");
        login.setSignIn();

        home.setHomeBtn();
        home.setSearchBar("shoes");
        home.setSearchIcon();

        searchPage search = new searchPage(driver);
        try {
            Assert.assertTrue(search.setShoesValidation(),"SHOES NOT DISPLAYED");
            search.setShoesColorRed();
            search.setQuantity("2");
            search.setAddToCart();

            home.setCart();
        }catch (Exception e){
            System.out.println("SHOES WERE NOT AVAILABLE");
        }

        home.setHomeBtn();
        home.setSearchBar("Shampoo");
        home.setSearchIcon();


        try {
            search.setShampoo();
            Assert.assertTrue(search.setShampooValidation(),"SHAMPOO NOT DISPLAYED");
            search.setQuantity("1");
            search.setAddToCart();

            home.setCart();
        }catch (Exception e){
            System.out.println("SHAMPOO IS NOT AVAILABLE");
        }

        cartPage cart = new cartPage(driver);
        Assert.assertTrue(cart.checkOutValidation(),"PRODUCTS WERE NOT ADDED");

    }
}
