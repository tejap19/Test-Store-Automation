package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchPage extends basePage{

    public searchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='active menu_home']")
    WebElement homeOpt;
    @FindBy(xpath = "//a[normalize-space()='MAN Eau de Toilette Spray']")
    WebElement fragranceValidate;
    @FindBy(xpath = "//a[normalize-space()='Fruit of the Loom T-Shirts 5 Pack - Super Premium']")
    WebElement tShitsValidate;
    @FindBy(xpath = "//a[contains(text(),'Womens high heel point toe stiletto sandals ankle ')]")
    WebElement shoesValidate;

    public void setHomeOpt(){
        homeOpt.click();
    }
    public boolean setFragranceValidate (){
        return fragranceValidate.isDisplayed();
    }
    public boolean settShitsValidate(){
        return tShitsValidate.isDisplayed();
    }
    public boolean setShoesValidate(){
        return shoesValidate.isDisplayed();
    }

}
