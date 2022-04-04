package com.TestNG.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RealEstatePage extends BasePage {

	String dropDownMenue = "//span[@class='current' and contains (text(),'Sort by')]";
	String dropDownli = "//span[contains(text(),'Sort by')]//..//ul//li";
	String sortListItems = "(//ul[@class='list']//li)[]";
	
	
	@Test
	public void dropDownMenue() throws InterruptedException {
		
		click(dropDownMenue);
		
		List <WebElement> li = getDriver().findElements(By.xpath(dropDownli));
		
		System.out.println(li.size());
		
		for (WebElement e: li) {
			
			if (e.getText().contains("Low to High")) {
			System.out.println(e.getText());
			e.click();
			break;
			}
			
		
		}
		
		Thread.sleep(2000);
		/*
		 
		
		WebElement element = getDriver().findElement(By.xpath("//span[contains(text(),'Sort by')]//..//ul"));
		Select select = new Select(element);
		
		select.selectByIndex(1);
		select.selectByValue("https://realestate.bangalis.com?orderBy=priceAsc");
		select.selectByVisibleText("Price : Low to High");
		
		
		List<WebElement> options = select.getOptions();
		for (WebElement e: options) {
			
			System.out.println(e.getText());
			
			
		}*/
		
		
		
		
		
		
		
		
		
	}

}
