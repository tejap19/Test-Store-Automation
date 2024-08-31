package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static testCases.baseClass.dropDownMethod;

public class registrationPage extends basePage{

    public registrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='AccountFrm_firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='AccountFrm_lastname']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='AccountFrm_email']")
    WebElement mailId;
    @FindBy(xpath = "//input[@id='AccountFrm_telephone']")
    WebElement number;
    @FindBy(xpath = "//input[@id='AccountFrm_address_1']")
    WebElement address;
    @FindBy(xpath = "//input[@id='AccountFrm_city']")
    WebElement city;
    @FindBy(xpath = "//select[@id='AccountFrm_zone_id']")
    WebElement state;
    @FindBy(xpath = "//input[@id='AccountFrm_postcode']")
    WebElement zipcode;
    @FindBy(xpath = "//select[@id='AccountFrm_country_id']")
    WebElement country;
    @FindBy(xpath = "//input[@id='AccountFrm_loginname']")
    WebElement loginId;
    @FindBy(xpath = "//input[@id='AccountFrm_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='AccountFrm_confirm']")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='AccountFrm_newsletter0']")
    WebElement newsSubscribe;
    @FindBy(xpath = "//input[@id='AccountFrm_agree']")
    WebElement privacyPolicy;
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement submit;

    @FindBy(xpath = "//span[@class='maintext']")
    WebElement validate;


    public void setFirstName(String name){
        firstName.sendKeys(name);
    }
    public void setLastName(String lastname){
        lastName.sendKeys(lastname);
    }
    public void setMailId(String mail){
        mailId.sendKeys(mail);
    }
    public void setNumber(String num){
        number.sendKeys(num);
    }
    public void setAddress(String adres){
        address.sendKeys(adres);
    }
    public void setCity(String zone){
        city.sendKeys(zone);
    }
    public void setState(String text){
        dropDownMethod(state,text);
    }
    public void setZipcode(String code){
        zipcode.sendKeys(code);
    }
    public void setCountry(String countryName){
        dropDownMethod(country,countryName);
    }
    public void setLoginId(String loginName){
        loginId.sendKeys(loginName);
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }
    public void setConfirmPassword(String confirmPass){
        confirmPassword.sendKeys(confirmPass);
    }
    public void setNewsSubscribe(){
        newsSubscribe.click();
    }
    public void setPrivacyPolicy(){
        privacyPolicy.click();
    }
    public void setSubmit(){
        submit.click();
    }
    public boolean setValidate(){
        return validate.isDisplayed();
    }

}
