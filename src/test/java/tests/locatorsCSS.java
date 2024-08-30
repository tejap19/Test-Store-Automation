package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsCSS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.in");
        driver.manage().window().maximize();

//      tag#id
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Tablets");
//      tag#id
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
//      tag.class_name
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("i.a-icon.a-icon-checkbox")).click();
//      tag.class_name[att=value]
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span.a-button-text[data-action='a-dropdown-button']")).click();
//      tag#id
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a#s-result-sort-select_5")).click();
//      tag[class] tag[class]
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span[class='a-size-medium a-color-base a-text-normal']")).click();
        Thread.sleep(3000);


        driver.close();
    }
}
