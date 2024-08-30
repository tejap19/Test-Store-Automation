package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends basePage{

    public registrationPage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//input[@placeholder='First and last name']")
    WebElement name;
@FindBy(xpath = "//input[@type='email']")
    WebElement mailId;
@FindBy(xpath = "//input[@placeholder='At least 6 characters']")
    WebElement password;
@FindBy(xpath = "//input[@id='ap_password_check']")
    WebElement reEnterPassword;
@FindBy(xpath = "//input[@type='submit']")
    WebElement verify;


    public void setName(String user){
        name.sendKeys(user);
    }

    public void setMailId(String mail){
        mailId.sendKeys(mail);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setReEnterPassword(String pass){
        reEnterPassword.sendKeys(pass);
    }

    public void setVerify(){
        verify.click();
    }

}
