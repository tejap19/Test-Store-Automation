package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{


    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement mouseHover;
    @FindBy(xpath = "//a[@class='nav-a']")
    WebElement registration;

    Actions action = new Actions(driver);

    public void setMouseHover(){
        action.moveToElement(mouseHover).perform();
    }
    public void setRegistration(){
        registration.click();
    }

}
