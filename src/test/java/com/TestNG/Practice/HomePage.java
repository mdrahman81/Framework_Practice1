package com.TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage extends BasePage {

	private static String cargoButton = "//*[@data-id='909a30b']//span[contains(text(),'show more')]";
	private static String realEstate = "//*[@data-id='9face16']//span[contains(text(),'show more')]";
	private static String realEstateURL = "https://www.realestate.bangalis.com";
//	private static String dropDownMenue = "//span[@class='current' and contains (text(),'Sort by')]";

	DriverFactory driverFactory = new DriverFactory();
	CargoPage cargoPage = new CargoPage();

	@BeforeTest
	public void homePage_Load() throws InterruptedException {

		String url = driverFactory.getDriver().getCurrentUrl();
		String pageTitle = driverFactory.getDriver().getTitle();
		System.out.println(url + ": " + pageTitle);

	}

	public void launchCargo() throws InterruptedException {

		click(cargoButton);

	}

	public void launchRealEstate() throws InterruptedException {

		String url = driverFactory.getDriver().getCurrentUrl();
		String pageTitle = driverFactory.getDriver().getTitle();
		System.out.println(url + ": " + pageTitle);

		click(realEstate);
		driverFactory.getDriver().get(realEstateURL);
		driverFactory.getDriver().navigate().back();

	}

	
	public void moveToTheElementJS() throws InterruptedException {
		
		WebElement element = getDriver().findElement(By.xpath(cargoButton));
		
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		
		js.executeScript("javascript:window.scrollBy(200,1000)");
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].setAttribute ('style', 'background : yellow; color : red; border 15px solid red;')", element);
		Thread.sleep(3000);
		
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		
		js.executeScript("javascript:window.scrollBy(200,1000)");
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].setAttribute ('style', 'background : white; color : green; border 25px solid green;')", element);
		Thread.sleep(3000);
	}

	
	public void hoverOver() throws InterruptedException {
		Actions action = new Actions(getDriver());

		WebElement element = getDriver().findElement(By.xpath(cargoButton));
		action.moveToElement(element).build().perform();
		Thread.sleep(5000);

	}

	
	public void moveToTheElementPoint() throws InterruptedException {

		
		
	}

}
