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
    @FindBy(xpath = "//button[@id='checkout_btn']")
    WebElement confirmOrder;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/section/ul/li[6]/a")
    WebElement success;

    public void setCheckOutOpt(){
        checkOutOpt.click();
    }
    public void setConfirmOrder(){
        confirmOrder.click();
    }
    public boolean setSuccess(){
        return success.isDisplayed();
    }
    public boolean checkOutValidation(){
        return checkOutOpt.isDisplayed();
    }
}
