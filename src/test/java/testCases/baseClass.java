package testCases;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class baseClass {
     public static WebDriver driver;

    @BeforeClass
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://automationteststore.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    void tearDown()  {
        driver.quit();
    }

    public static String randomString(){
        String genteratedString = RandomStringUtils.randomAlphabetic(6);
        return genteratedString;
    }
    public static String randomNumber(){
        String randomNum = RandomStringUtils.randomNumeric(10);
        return randomNum;
    }

    public static void dropDownMethod(WebElement xpath, String text){
        Select dropDown = new Select(xpath);
        dropDown.selectByVisibleText(text);
    }

//    public static String captureSceen(String tname) throws IOException {
//        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//
//        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//
//        String targetFilePath = System.getProperty("user.dir") + "//screenshots//" + tname + "_" + timeStamp + ".png";
//
//        File targetFile = new File(targetFilePath);
//        sourceFile.renameTo(targetFile);
//
//        return targetFilePath;
//    }

    public static String captureSceen(String tname) {
        if (driver == null) {
            return null;
        }
        String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String targetFilePath = System.getProperty("user.dir") + "//screenshots//" + tname + "_" + timeStamp + ".png";
        try {
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(targetFilePath));
            return targetFilePath;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
