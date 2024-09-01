package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;
import pageObjects.searchPage;


public class searchBarTest extends baseClass{

    @Test
    void search(){
        homePage home = new homePage(driver);
        home.setSearchBar("Fragrance");
        home.setSearchIcon();

        searchPage search = new searchPage(driver);
        Assert.assertTrue(search.setFragranceValidation(),"Fragrances is not displayed");
        search.setHomeOpt();

        home.setSearchBar("T-shirts");
        home.setSearchIcon();
        Assert.assertTrue(search.setTShitsValidation(),"T-shirts are not displayed");
        search.setHomeOpt();

        home.setSearchBar("Shoes");
        home.setSearchIcon();
        Assert.assertTrue(search.setShoesValidation(),"T-shirts are not displayed");
        search.setHomeOpt();

    }
}
