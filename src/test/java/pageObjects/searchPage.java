package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static testCases.baseClass.dropDownMethod;


public class searchPage extends basePage{

    public searchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='active menu_home']")
    WebElement homeOpt;
    @FindBy(xpath = "//a[normalize-space()='MAN Eau de Toilette Spray']")
    WebElement fragranceValidation;
    @FindBy(xpath = "//a[normalize-space()='Fruit of the Loom T-Shirts 5 Pack - Super Premium']")
    WebElement tShitsValidation;
    @FindBy(xpath = "//a[contains(text(),'Womens high heel point toe stiletto sandals ankle ')]")
    WebElement shoesValidation;
    @FindBy(xpath = "//a[normalize-space()='Add to Cart']")
    WebElement addToCart;
    @FindBy(xpath = "//input[@id='product_quantity']")
    WebElement quantity;
    @FindBy(xpath = "//input[@id='option347763']")
    WebElement shoeColorBlack;
    @FindBy(xpath = "//input[@id='option347764']")
    WebElement shoeColorRed;
    @FindBy(xpath = "//input[@id='option347765']")
    WebElement shoeColorGreen;
    @FindBy(xpath = "//input[@id='option347766']")
    WebElement shoeColorBlue;
    @FindBy(xpath = "//input[@id='option347767']")
    WebElement shoeColorWhite;
    @FindBy(xpath = "//*[@id='option348']")
    WebElement selectSize;
    @FindBy(xpath = "//div[@id='maincontainer']//div[2]//div[2]//a[1]//img[1]")
    WebElement shampoo;
    @FindBy(xpath = "//a[normalize-space()='Curls to straight Shampoo']")
    WebElement shampooValidation;



    public void setHomeOpt(){
        homeOpt.click();
    }
    public boolean setFragranceValidation(){
        return fragranceValidation.isDisplayed();
    }
    public boolean setTShitsValidation(){
        return tShitsValidation.isDisplayed();
    }
    public boolean setShoesValidation(){
        return shoesValidation.isDisplayed();
    }
    public void setAddToCart(){
        addToCart.click();
    }
    public void setQuantity(String qty){
        quantity.clear();
        quantity.sendKeys(qty);
    }
    public void setShoesColorBlack(){
        shoeColorBlack.click();
    }
    public void setShoesColorRed(){
        shoeColorRed.click();
    }
    public void setShoesColorBlue(){
        shoeColorBlue.click();
    }
    public void setShoesColorGreen(){
        shoeColorGreen.click();
    }
    public void setShoesColorWhite(){
        shoeColorWhite.click();
    }
    public void setSelectSize(String size){
        dropDownMethod(selectSize,size);
    }
    public void setShampoo(){
        shampoo.click();
    }
    public boolean setShampooValidation(){
        return shampooValidation.isDisplayed();
    }

}
