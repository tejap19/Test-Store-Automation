package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class sampleTests {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
//        alerts();
//        windowsFun();
//        frameFun();
//        waitConditions();
//        tags();
//        calenders();
//        jsExecutor();
        testCase();
    }

    private static void testCase() throws InterruptedException {
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Login or register']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
        driver.findElement(By.xpath("//input[@id='AccountFrm_firstname']")).sendKeys("tej");
        driver.findElement(By.xpath("//input[@id='AccountFrm_lastname']")).sendKeys("P");
        driver.findElement(By.xpath("//input[@id='AccountFrm_email']")).sendKeys("asdFGb@gmail.com");
        driver.findElement(By.xpath("//input[@id='AccountFrm_telephone']")).sendKeys("7386576565");
        driver.findElement(By.xpath("//input[@id='AccountFrm_address_1']")).sendKeys("dr no : 14/19");
        driver.findElement(By.xpath("//input[@id='AccountFrm_city']")).sendKeys("vizag");

        Select state = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_zone_id']")));
        state.selectByVisibleText("Aberdeen");
        driver.findElement(By.xpath("//input[@id='AccountFrm_postcode']")).sendKeys("70008");
        Select country = new Select(driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']")));
        country.selectByVisibleText("United Kingdom");
        driver.findElement(By.xpath("//input[@id='AccountFrm_loginname']")).sendKeys("tejap");
        driver.findElement(By.xpath("//input[@id='AccountFrm_password']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//input[@id='AccountFrm_confirm']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//input[@id='AccountFrm_newsletter0']")).click();
        driver.findElement(By.xpath("//input[@id='AccountFrm_agree']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
        String url = "https://tutorialsninja.com/demo/";
    }

    public static void alerts() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.id("promptBox")).click();
        driver.switchTo().alert().sendKeys("Teja");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    private static void windowsFun() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();

        String prWindow = driver.getWindowHandle();
//        driver.findElement(By.id("newWindowBtn")).click();
//        Set<String> windowshandles = driver.getWindowHandles();
//        for (String windowHandle : windowshandles){
//            if (!windowHandle.equals(prWindow)){
//                driver.switchTo().window(windowHandle);
//                driver.manage().window().maximize();
//                driver.findElement(By.id("firstName")).sendKeys("Teja");
//                Thread.sleep(2000);
//                driver.close();
//            }
//        }
//        driver.switchTo().window(prWindow);
//        driver.findElement(By.id("name")).sendKeys("Mani");
//        Thread.sleep(2000);
//        driver.quit();

        driver.findElement(By.id("newTabBtn")).click();
        Set<String> windowsHandles = driver.getWindowHandles();
        for (String windowHandle : windowsHandles){
            if (!windowHandle.equals(prWindow)){
                driver.switchTo().window(windowHandle);
                driver.findElement(By.id("alertBox")).click();
                Thread.sleep(2000);
                driver.switchTo().alert().accept();
                driver.close();
            }
        }
        driver.switchTo().window(prWindow);
        driver.findElement(By.id("name")).sendKeys("ManiKr");
        Thread.sleep(2000);
        driver.quit();

    }

    private static void frameFun() {
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("name")).sendKeys("sdfghj");

        driver.switchTo().frame("frm2");
        Select courseDe = new Select(driver.findElement(By.id("selectnav1")));
        courseDe.selectByVisibleText("- SQL");
    }

    private static void waitConditions() {
        driver.get("https://support-hub.tricentis.com/open");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.findElement(By.xpath("//h5[text()='Login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("tejap19");
    }

    private static void tags() {
        driver.get("https://github.com/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("login_field")).sendKeys("sample@gmail.com");
        System.out.println(driver.findElement(By.id("login_field")).getAttribute("value"));
        System.out.println(driver.findElement(By.id("login_field")).getTagName());
        System.out.println(driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText());
        System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));

    }

    private static void calenders() {
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().window().maximize();

        int day = 14;

//      first calender
        driver.findElement(By.id("first_date_picker")).click();
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();

//      second calender
        driver.findElement(By.id("second_date_picker")).click();
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month '))]/a[text()="+day+"]")).click();

//      third calender
        driver.findElement(By.id("third_date_picker")).click();
        Select yearDD = new Select(driver.findElement(By.className("ui-datepicker-year")));
        yearDD.selectByVisibleText("2015");
        Select monthDD = new Select(driver.findElement(By.className("ui-datepicker-month")));
        monthDD.selectByVisibleText("Dec");
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();

//      fourth calender
        driver.findElement(By.id("fourth_date_picker")).click();

        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month '))]/a[text()="+day+"]")).click();



    }

    private static void jsExecutor() {
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//		WebElement element = (WebElement) jsExecutor.executeScript("return document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
//		element.sendKeys("xpath");
//		jsExecutor.executeScript("document.getElementById('email').value='id';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementsByName('email')[0].value='name';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementsByClassName('inputtext')[0].value='classname';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementsByTagName('input')[2].value='tagname';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.querySelector('#email').value='css';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath';");

//		jsExecutor.executeScript("document.getElementsByName('login')[0].click()");

//		jsExecutor.executeScript("document.getElementById('email').style.border='5px red solid';");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("document.getElementById('email').style.background='yellow';");
//		jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow');");

//		jsExecutor.executeScript("window.scrollTo(0,500)");
//		Thread.sleep(3000);
//		jsExecutor.executeScript("window.scrollBy(0,500)");
//		jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView();");

        WebElement username = driver.findElement(By.id("email"));
        jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');", username);

    }
}
