package testCases;

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
        if (search.setFragranceValidate()){
            System.out.println("Fragrances are displayed");
        }else {
            System.out.println("Fragrances is not displayed");
        }
        search.setHomeOpt();

        home.setSearchBar("T-shirts");
        home.setSearchIcon();

        if (search.settShitsValidate()){
            System.out.println("T-shirts are displayed");
        }else {
            System.out.println("T-shirts are not displayed");
        }
        search.setHomeOpt();

        home.setSearchBar("Shoes");
        home.setSearchIcon();

        if (search.setShoesValidate()){
            System.out.println("T-shirts are displayed");
        }else {
            System.out.println("T-shirts are not displayed");
        }
        search.setHomeOpt();

    }
}
