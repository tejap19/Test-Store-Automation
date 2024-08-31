package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage{


    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Login or register']")
    WebElement loginOrRegister;
    @FindBy(xpath = "//input[@id='filter_keyword']")
    WebElement searchBar;
    @FindBy(xpath = "//a[@class='active menu_home']")
    WebElement homeBtn;
    @FindBy(xpath = "//div[@title='Go']//i[@class='fa fa-search']")
    WebElement searchIcon;


    Actions action = new Actions(driver);

    public void setLoginOrRegister(){
        loginOrRegister.click();
    }
    public void setSearchBar(String search){
        searchBar.sendKeys(search);
    }
    public void setHomeBtn(){
        homeBtn.click();
    }
    public void setSearchIcon(){
        searchIcon.click();
    }

}
