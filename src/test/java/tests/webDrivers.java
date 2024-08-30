package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class webDrivers {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://amazon.in/");
        chromeDriver.manage().window().maximize();

        Boolean nam =  chromeDriver.findElement(By.id("nav-logo")).isDisplayed();
        System.out.println(nam);

        Thread.sleep(3000);
        chromeDriver.findElement(By.linkText("Today's Deals")).click();

        Thread.sleep(3000);
        List<WebElement> headerList = chromeDriver.findElements(By.className("nav-progressive-content"));
        System.out.println(headerList.size());

        Thread.sleep(2000);
        List<WebElement> links = chromeDriver.findElements(By.tagName("a"));
        System.out.println(links.size());

        Thread.sleep(2000);
        List<WebElement> img = chromeDriver.findElements(By.tagName("img"));
        System.out.println(img.size());

        chromeDriver.quit();
    }
}
