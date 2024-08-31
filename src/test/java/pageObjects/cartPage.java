package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage extends basePage{

    public cartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='cart_checkout1']")
    WebElement checkOutOpt;

    public void setCheckOutOpt(){
        checkOutOpt.click();
    }
    public boolean checkOutValidation(){
        return checkOutOpt.isDisplayed();
    }
}
