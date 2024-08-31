package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends basePage{

    public loginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='accountFrm_accountregister']")
    WebElement registerOpt;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement clickContinue;
    @FindBy(xpath = "//input[@id='loginFrm_loginname']")
    WebElement loginName;
    @FindBy(xpath = "//input[@id='loginFrm_password']")
    WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement logIn;
    @FindBy(xpath = "//a[@href='https://automationteststore.com/index.php?rt=account/logout'][normalize-space()='']")
    WebElement logOff;

    public boolean setRegisterOpt(){
        return registerOpt.isSelected();
    }

    public void setLoginName(String mail){
        loginName.sendKeys(mail);
    }

    public void setClickContinue(){
        clickContinue.click();
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setSignIn(){
        logIn.click();
    }

    public void setLogOff(){
        logOff.click();
    }
}
