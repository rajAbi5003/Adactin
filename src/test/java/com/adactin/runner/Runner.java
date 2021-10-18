package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.baseClass.BaseClass;
import com.adactin.configuration.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature" , glue = "com\\adactin\\stepDefinition",
				 plugin = {"pretty"},monochrome = true)

public class Runner 
{
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable 
	{
		String browser = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getBrowser();
		driver = BaseClass.setBrowser(browser);
		BaseClass.getWindowHandle();
	}
	
	@AfterClass
	public static void closeSession() throws InterruptedException 
	{
		BaseClass.closeBrowser();
		BaseClass.quitBrowser();
	}
}