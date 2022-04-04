package com.TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BasePage extends DriverFactory {

	boolean b = false;

	WebElement element;
	JavascriptExecutor js = ((JavascriptExecutor)getDriver());

	public void click(String xpath) {

		try {
			element = getDriver().findElement(By.xpath(xpath));
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].setAttribute ('style','background : yellow; color : red; border 15px solid red;')", element);
			Thread.sleep(1000);

			element.click();

		} catch (Exception e) {

			e.toString();
			e.printStackTrace();
			e.getMessage();

		}
	}

	public void entertext(String xpath, String entry) {

		getDriver().findElement(By.xpath(xpath)).sendKeys(entry);

	}

	public void enterKeys(String xpath, String buttonName, Keys entry) {

		getDriver().findElement(By.xpath(xpath)).sendKeys(entry);
		System.out.println(buttonName + ": from the keyboard is clicked !");

	}

	public void isDisplayed(String objectName, String xpath) {

		b = getDriver().findElement(By.xpath(xpath)).isDisplayed();

		if (b) {
			System.out.println(objectName + " is displayed");
		} else {
			System.out.println("Error !!! " + objectName + " is not displayed !!! ");
		}
	}

	public void isEnabled(String objectName, String xpath) {

		b = getDriver().findElement(By.xpath(xpath)).isEnabled();

		if (b) {
			System.out.println(objectName + " is enabled");
		} else {
			System.out.println("Error !!! " + objectName + " is not enabled !!! ");
		}
	}

	public void isSelected(String objectName, String xpath) {

		b = getDriver().findElement(By.xpath(xpath)).isSelected();

		if (b) {
			System.out.println(objectName + " is selected");
		} else {
			System.out.println("Error !!! " + objectName + " is not selected !!! ");
		}

	}

}
