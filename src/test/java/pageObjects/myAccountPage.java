package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends basePage{

    public myAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccount;
    @FindBy(xpath = "//li[@class='selected']//a[@href='https://automationteststore.com/index.php?rt=account/account']")
    WebElement dashboard;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/wishlist']")
    WebElement accountWishlist;
    @FindBy(xpath = "//a[normalize-space()='My wish list']")
    WebElement accountWishlistValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/edit']")
    WebElement editAccount;
    @FindBy(xpath = "//a[normalize-space()='Edit Information']")
    WebElement editAccountValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/password']")
    WebElement changePassword;
    @FindBy(xpath = "//a[normalize-space()='Change Password']")
    WebElement changePasswordValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/address']")
    WebElement manageAddress;
    @FindBy(xpath = "//a[normalize-space()='Address Book']")
    WebElement manageAddressValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/history']")
    WebElement orderHistory;
    @FindBy(xpath = "//a[normalize-space()='Order History']")
    WebElement orderHistoryValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/transactions']")
    WebElement transactionHistory;
    @FindBy(xpath = "//a[normalize-space()='Transactions History']")
    WebElement transactionHistoryValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/download']")
    WebElement downloads;
    @FindBy(xpath = "//a[normalize-space()='Downloads']")
    WebElement downloadsValidation;
    @FindBy(xpath = "//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/notification']")
    WebElement notifications;
    @FindBy(xpath = "//a[normalize-space()='Notifications']")
    WebElement notificationsValidation;
    @FindBy(xpath = "//a[normalize-space()='Logoff']")
    WebElement logOff;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOffValidation;

    public void setMyAccount(){
        myAccount.click();
    }

    public boolean setMyAccountValidation(){
        return myAccount.isDisplayed();
    }

    public void setDashboard() {
        dashboard.click();
    }


    public void setAccountWishlist() {
        accountWishlist.click();
    }

    public void setEditAccount() {
        editAccount.click();
    }

    public void setChangePassword() {
        changePassword.click();
    }

    public void setManageAddress() {
        manageAddress.click();
    }

    public void setOrderHistory() {
        orderHistory.click();
    }

    public void setTransactionHistory() {
        transactionHistory.click();
    }

    public void setDownloads() {
        downloads.click();
    }

    public void setNotifications() {
        notifications.click();
    }

    public void setLogOff() {
        logOff.click();
    }

    public boolean setAccountWishlistValidation(){
        return accountWishlistValidation.isDisplayed();
    }

    public boolean setEditAccountValidation(){
        return editAccountValidation.isDisplayed();
    }

    public boolean setChangePasswordValidation(){
        return changePasswordValidation.isDisplayed();
    }

    public boolean setManageAddressValidation(){
        return manageAddressValidation.isDisplayed();
    }
    public boolean setOrderHistoryValidation(){
        return orderHistoryValidation.isDisplayed();
    }
    public boolean setTransactionHistoryValidation(){
        return transactionHistoryValidation.isDisplayed();
    }
    public boolean setDownloadsValidation(){
        return downloadsValidation.isDisplayed();
    }
    public boolean setNotificationsValidation(){
        return notificationsValidation.isDisplayed();
    }
    public boolean setLogOffValidation(){
        return logOffValidation.isDisplayed();
    }


}
