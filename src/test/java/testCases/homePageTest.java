package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;

public class homePageTest extends baseClass {

    @Test
    void home() {
        homePage home = new homePage(driver);
        home.setHomeBtn();
        if (home.apparelAccessoriesValidation() && home.makeUpValidation() && home.skinCareValidation() && home.fragranceValidation() && home.menValidation() && home.hairCareValidation() && home.booksValidation()){
            System.out.println("ALL BUTTONS ARE WORKING");

            home.setApparelAccessories();
            Assert.assertTrue(home.setApparelFunctionValidation(), "APPAREL & ACCESSORIES BUTTON IS NOT WORKING");

            home.setMakeUp();
            Assert.assertTrue(home.setMakeUpFunctionValidation(),"MAKEUP BUTTON IS NOT WORKING");

            home.setSkinCare();
            Assert.assertTrue(home.setSkinCareFunctionValidation(),"SKIN CARE BUTTON IS NOT WORKING");

            home.setFragrance();
            Assert.assertTrue(home.setFragranceFunctionValidation(),"FRAGRANCE BUTTON IS NOT WORKING");

            home.setMen();
            Assert.assertTrue(home.setMenFunctionValidation(),"MEN BUTTON IS NOT WORKING");

            home.setHairCare();
            Assert.assertTrue(home.setHairCareFunctionValidation(),"HAIR BUTTON IS NOT WORKING");

            home.setBooks();
            Assert.assertTrue(home.setBooksFunctionValidation(),"BOOKS BUTTON IS NOT WORKING");

        }else {
            System.out.println("ALL BUTTONS ARE NOT WORKING");
        }

    }
}
