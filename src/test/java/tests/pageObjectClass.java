package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectClass {
    WebDriver driver;

    pageObjectClass(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement login;

    public void setUserName(String user){
        userName.sendKeys(user);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setLogin(){
        login.click();
    }

}
