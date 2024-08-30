package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class xPath {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
//        conditions();
//        locators();
//        indexing();
//        functions();
//        axes();
        mouseHover();
//        dropDown();

    }

    private static void locators() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("UCB");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[text()='Travel']")).click();

        driver.findElement(By.xpath("//*[@alt=\"Mobiles\"]")).click();
        Thread.sleep(2000);
    }

    public static void conditions() {
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@title='Login to your account']")).click();
        driver.findElement(By.xpath("//input[@class='LoginForm_login_input__PNKob' and @name='email']")).click();
        driver.findElement(By.xpath("//input[@class='LoginForm_login_input__PNKob' or @name='phone']")).click();
    }

    private static void indexing() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='bs1+1t']/div[3]")).click();

    }

    private static void functions() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@placeholder,'Search our')]")).click();
        Thread.sleep(1000);
        Boolean status = driver.findElement(By.xpath("//h1[starts-with(text(),'Learn ')]")).isDisplayed();
        System.out.println(status);
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search our')]")).click();
        driver.findElement(By.xpath("(//div[@class='w3-row ws-black tutbuttons']/div/div)[last()]")).click();
        driver.findElement(By.xpath("(//div[@class='w3-row ws-black tutbuttons']/div/div)[position() = 5]")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    private static void axes() {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")).click();
        driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input[@type='checkbox']")).click();
        System.out.println(driver.findElement(By.xpath("//td[text()='Maria Anders']/parent::tr")).isDisplayed());
        driver.findElement(By.xpath("//td[text()='Maria Anders']/following-sibling::td/following-sibling::td/following-sibling::td/child::a")).click();
        driver.findElement(By.xpath("//td[text()='Helen Bennett']/")).click();

    }

    private static void mouseHover() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);

//        driver.findElement(By.className("_1wE2Px")).click();
        actions.moveToElement((driver.findElement(By.xpath("//img[@alt='Fashion']")))).perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='_16rZTH']//a[4]"))).perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//div[@class='_31z7R_']//a[3]"))).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.className("BUOuZu"))).doubleClick().perform();

    }


    private static void dropDown() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement courseElement =  driver.findElement(By.id("course"));
        Select dropdown = new Select(courseElement);
        dropdown.selectByValue("java");
        Thread.sleep(3000);
        dropdown.selectByValue("net");
        Thread.sleep(3000);
        dropdown.selectByVisibleText("Javascript");
    }
}
