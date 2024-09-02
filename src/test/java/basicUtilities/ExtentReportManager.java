package basicUtilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testCases.baseClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    String repName;

    public void onStart(ITestContext testContext) {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd>HH.mm.ss").format(new Date());

        repName = "Test-Report-" + timeStamp + ".html";
        sparkReporter = new ExtentSparkReporter("reports/" + repName);

        sparkReporter.config().setDocumentTitle("Open Cart Automation");// title of the report
        sparkReporter.config().setReportName("OpenCart Functional testing");// name of the report
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "openCart");
        extent.setSystemInfo("Module", "Admin");
        extent.setSystemInfo("sub module", "Customers");
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Enviornement", "QA");

        String os = testContext.getCurrentXmlTest().getParameter("os");
        extent.setSystemInfo("Operating System", os);

        String browser = testContext.getCurrentXmlTest().getParameter("browser");
        extent.setSystemInfo("Browser", browser);

        List<String> includeGrops = testContext.getCurrentXmlTest().getIncludedGroups();
        if (!includeGrops.isEmpty()) {
            extent.setSystemInfo("Groups", includeGrops.toString());
        }

    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups()); // to display groups in reports
        test.log(Status.PASS, result.getName() + "got successfully excuted");

    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());

        test.log(Status.FAIL, result.getName() + "got fails");
        test.log(Status.INFO, result.getThrowable().getMessage());

        try {
            String imgpath = new baseClass().captureSceen(result.getName());
            test.addScreenCaptureFromPath(imgpath);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());

        test.log(Status.SKIP, result.getName() + "got skipped");
        test.log(Status.INFO, result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext testContext) {

        extent.flush();

//        String pathOfExentReport = System.getProperty("user.dir") + "/reports/" + repName;
//
//        File extentReport = new File(pathOfExentReport);
//
//
//        try {
//            Desktop.getDesktop().browse(extentReport.toURI());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
