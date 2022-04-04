package com.TestNG.Practice;

import org.openqa.selenium.Keys;

public class CargoPage extends BasePage{
	
	
	private static String firstNameField = "//input[@id='ff_7_names_first_name_']";
	private static String numberOfBoxes = "//input[@id='ff_7_numeric-field']";
	private static String totalWeight = "//input[@id='ff_7_numeric-field_1']";
	private static String phoneMobile = "//input[@id='ff_7_phone']";
	private static String email = "//input[@id='ff_7_email']";
	private static String messageBox = "//*[@id='ff_7_description']";
	private static String submitButton = "//button[@type='submit' and contains (text(),'Submit Form')]";
	
	
	
	
	public void formFillup() {
		
		entertext(firstNameField, "Rahman");
		entertext(numberOfBoxes, "7");
		entertext(totalWeight, "20");
		entertext(phoneMobile, "3472516671");
		entertext(email, "bangalis.com@gmail.com");
		entertext(messageBox, "This is a test submission\n ThankYou\nBangalis.com");
		isDisplayed("Submit Button ", submitButton);
		isEnabled("Submit Button ", submitButton);
		isSelected("Submit Button ", submitButton);
		enterKeys(submitButton, "Escape key", Keys.ESCAPE);
	
	}
	
	


}
