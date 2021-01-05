package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@ExtendedCucumberOptions(
//
//		detailedReport=true,
//		detailedAggregatedReport = true,
//		usageReport = true,
//		toPDF=true,
//		outputFolder="target"
//		)
@CucumberOptions(
		features="src//test//resources//features//",
		glue= {"stepdefs"},
		dryRun = false,
		strict= true,
		monochrome = true,
		plugin= {
				// "pretty",
				//"usage:target//cucumber-reports"
				//"html:target//html-reports"
				"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReports.html"
				//"com.aventstack.extentreportscucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html"
				}
		)

public class sampleRunner {
	@AfterClass
	public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"//src//test//resources//extent-config.xml"));
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

		Reporter.setSystemInfo("User Name ", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone ", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Application Name ", "Sample Test App");
		Reporter.setSystemInfo("OS ", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment ", "Testing Server");
}
}