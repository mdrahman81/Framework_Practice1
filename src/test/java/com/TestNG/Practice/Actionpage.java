package com.TestNG.Practice;

import org.testng.annotations.Test;

public class Actionpage extends BasePage {

	CargoPage cargoPage = new CargoPage();
	HomePage homePage = new HomePage();
	RealEstatePage realEstatePage = new RealEstatePage();


	
	public void DropDownmMenue() throws InterruptedException {

		homePage.launchRealEstate();
		realEstatePage.dropDownMenue();

	}

	
	public void hoverOver() throws InterruptedException {

		homePage.moveToTheElementJS();
		homePage.hoverOver();

	}

	@Test
	public void cargoflow() throws InterruptedException {

		homePage.launchCargo();
		cargoPage.formFillup();

	}

}
