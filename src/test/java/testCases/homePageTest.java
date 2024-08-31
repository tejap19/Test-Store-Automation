package testCases;

import org.testng.annotations.Test;
import pageObjects.homePage;

public class homePageTest extends baseClass {

    @Test
    void home() throws InterruptedException {
        homePage home = new homePage(driver);
        home.setHomeBtn();
        if (home.apparelAccessoriesValidation() && home.makeUpValidation() && home.skinCareValidation() && home.fragranceValidation() && home.menValidation() && home.hairCareValidation() && home.booksValidation()){
            System.out.println("ALL BUTTONS ARE WORKING");

            home.setApparelAccessories();
            if (home.setApparelFunctionValidation()){
                System.out.println("APPAREL & ACCESSORIES BUTTON IS WORKING");
            }else {
                System.out.println("APPAREL & ACCESSORIES BUTTON IS NOT WORKING");
            }

            home.setMakeUp();
            if (home.setMakeUpFunctionValidation()){
                System.out.println("MAKEUP BUTTON IS  WORKING");
            }else {
                System.out.println("MAKEUP BUTTON IS NOT WORKING");
            }

            home.setSkinCare();
            if (home.setSkinCareFunctionValidation()){
                System.out.println("SKIN CARE BUTTON IS  WORKING");
            }else {
                System.out.println("SKIN CARE BUTTON IS NOT WORKING");
            }

            home.setFragrance();
            if (home.setFragranceFunctionValidation()){
                System.out.println("FRAGRANCE BUTTON IS  WORKING");
            }else {
                System.out.println("FRAGRANCE BUTTON IS NOT WORKING");
            }

            home.setMen();
            if (home.setMenFunctionValidation()){
                System.out.println("MEN BUTTON IS  WORKING");
            }else {
                System.out.println("MEN BUTTON IS NOT WORKING");
            }

            home.setHairCare();
            if (home.setHairCareFunctionValidation()){
                System.out.println("HAIR BUTTON IS  WORKING");
            }else {
                System.out.println("HAIR BUTTON IS NOT WORKING");
            }

            home.setBooks();
            if (home.setBooksFunctionValidation()){
                System.out.println("BOOKS BUTTON IS  WORKING");
            }else {
                System.out.println("BOOKS BUTTON IS NOT WORKING");
            }

        }else {
            System.out.println("ALL BUTTONS ARE NOT WORKING");
        }

    }
}
