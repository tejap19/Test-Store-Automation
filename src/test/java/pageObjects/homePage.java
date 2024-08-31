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
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[2]/a")
    WebElement apparelAccessories;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[3]/a")
    WebElement makeUp;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[4]/a")
    WebElement skinCare;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[5]/a")
    WebElement fragrance;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[6]/a")
    WebElement men;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[7]/a")
    WebElement hairCare;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[8]/a")
    WebElement books;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Apparel & accessories')]")
    WebElement apparelAccessoryFunctionValidation;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Makeup')]")
    WebElement makeUpFunctionValidation;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Skincare')]")
    WebElement skinCareFunctionValidation;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Fragrance')]")
    WebElement fragranceFunctionValidation;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Men')]")
    WebElement menFunctionValidation;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Hair Care')]")
    WebElement hairCareFunctionValidation;
    @FindBy(xpath = "//ul[@class='breadcrumb']//a[contains(text(),'Books')]")
    WebElement booksFunctionValidation;

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
    public void setApparelAccessories(){
        apparelAccessories.click();
    }
    public void setMakeUp(){
        makeUp.click();
    }
    public void setSkinCare(){
        skinCare.click();
    }
    public void setFragrance(){
        fragrance.click();
    }
    public void setMen(){
        men.click();
    }
    public void setHairCare(){
        hairCare.click();
    }
    public void setBooks(){
        books.click();
    }
    public boolean apparelAccessoriesValidation(){
        return apparelAccessories.isDisplayed();
    }
    public boolean makeUpValidation(){
        return makeUp.isDisplayed();
    }
    public boolean skinCareValidation(){
        return skinCare.isDisplayed();
    }
    public boolean fragranceValidation(){
        return fragrance.isDisplayed();
    }
    public boolean menValidation(){
        return men.isDisplayed();
    }
    public boolean hairCareValidation(){
        return hairCare.isDisplayed();
    }
    public boolean booksValidation(){
        return books.isDisplayed();
    }
    public boolean setApparelFunctionValidation(){
        return apparelAccessoryFunctionValidation.isDisplayed();
    }
    public boolean setMakeUpFunctionValidation(){
        return makeUpFunctionValidation.isDisplayed();
    }
    public boolean setSkinCareFunctionValidation(){
        return skinCareFunctionValidation.isDisplayed();
    }
    public boolean setFragranceFunctionValidation(){
        return fragranceFunctionValidation.isDisplayed();
    }
    public boolean setMenFunctionValidation(){
        return menFunctionValidation.isDisplayed();
    }
    public boolean setHairCareFunctionValidation(){
        return hairCareFunctionValidation.isDisplayed();
    }
    public boolean setBooksFunctionValidation(){
        return booksFunctionValidation.isDisplayed();
    }

}
