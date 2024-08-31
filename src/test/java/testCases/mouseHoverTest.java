package testCases;

import org.testng.annotations.Test;
import pageObjects.homePage;

public class mouseHoverTest extends baseClass{

    @Test
    void mouseActions(){

        homePage home = new homePage(driver);
        try {
            home.setHomeBtn();

            home.setTShirts();
            home.settShirtsValidation();
            home.setHomeBtn();

            home.setEyes();
            home.setEyesValidation();
            home.setHomeBtn();

            home.setSunScreen();
            home.setSunValidation();
            home.setHomeBtn();

            home.setFragWomen();
            home.setFragWomenValidation();
            home.setHomeBtn();

            home.setConditioner();
            home.setConditionerValidation();
            home.setHomeBtn();

            home.setCurrency();

        }catch (Exception e){
            System.out.println("MOUSE HOVER FAILED");
        }

    }
}
