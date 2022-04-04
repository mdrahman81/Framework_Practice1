package com.TestNG.Practice;

import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverFactory {
	
	private static WebDriver driver = null;
	
	@BeforeSuite
	public void initMethod() {
		
//		System.setProperty("webdriver.chrome.driver", "⁨Users⁩ ▸ ⁨mdrahman⁩ ▸ ⁨Downloads⁩ ▸ ⁨Selenium⁩ ▸ ⁨Chrome⁩");
		System.setProperty("webdriver.chrome.driver", "/Users/mdrahman/Downloads/Selenium/Chrome/chromedriver");
	    driver = new ChromeDriver();
	    
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    driver.get("https://bangalis.com");

	
	}
		
	
	
	@AfterMethod
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
	public WebDriver getDriver() {
		
		return driver;
		
		
	}

}