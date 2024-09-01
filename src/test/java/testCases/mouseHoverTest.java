package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.homePage;

public class mouseHoverTest extends baseClass{

    @Test
    void mouseActions(){

        homePage home = new homePage(driver);
        try {
            home.setHomeBtn();

            home.setTShirts();
            Assert.assertTrue(home.settShirtsValidation(),"T-SHITS NOT DISPLAYED");
            home.setHomeBtn();

            home.setEyes();
            Assert.assertTrue(home.setEyesValidation(),"EYES NOT DISPLAYED");
            home.setHomeBtn();

            home.setSunScreen();
            Assert.assertTrue(home.setSunValidation(),"SUNSCREEN NOT DISPLAYED");
            home.setHomeBtn();

            home.setFragWomen();
            Assert.assertTrue(home.setFragWomenValidation(),"FRAGRANCE NOT DISPLAYED");
            home.setHomeBtn();

            home.setConditioner();
            Assert.assertTrue(home.setConditionerValidation(),"CONDITIONER NOT DISPLAYED");
            home.setHomeBtn();

            home.setCurrency();

        }catch (Exception e){
            System.out.println("MOUSE HOVER FAILED");
        }

    }
}
