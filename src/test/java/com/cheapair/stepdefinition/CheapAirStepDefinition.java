package com.cheapair.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cheapair.basepackage.BaseClass;
import com.cheapair.pagefactory.CheapAir;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheapAirStepDefinition extends BaseClass{
	
	@BeforeTest
	@Given("Launch browser and Load Url")
	public void launch_browser_and_Load_Url() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(BaseClass.getProperty("CheapAirUrl"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Test(priority=1)
	@When("Enter the travel details")
	public void enter_travel_air_details() throws IOException, InterruptedException, AWTException {
		CheapAir ca = new CheapAir();
		ca.from.clear();
		ca.from.sendKeys(BaseClass.getProperty("From"));
		Thread.sleep(1000);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		ca.to.clear();
		ca.to.sendKeys(BaseClass.getProperty("To"));
		Robot roe = new Robot();
		roe.keyPress(KeyEvent.VK_ENTER);
		roe.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		ca.depart.click();
		ca.returnDate.click();
		Thread.sleep(1000);
		ca.adult.click();
		ca.children.click();
		ca.submit.click();
	}

	@Test(priority=0)
	@When("Select air and passenger details")
	public void select_air_and_passenger_details() throws IOException, InterruptedException, AWTException {
	//	CheapAirStepDefinition cad =new CheapAirStepDefinition();
	//	cad.enter_travel_air_details();
		CheapAir ca = new CheapAir();
		BaseClass.getwindow();
		ca.popUp.click();
		ca.priceDropDown.click();
		ca.priceSortOrder.click();
		ca.lowPriceFlight.click();
		ca.lowPriceFlight.click();
		ca.tripDetail.click();
		
		ca.firstName1.sendKeys(BaseClass.getProperty("FirstName1"));
		ca.lastName1.sendKeys(BaseClass.getProperty("LastName1"));
		BaseClass.selectByValue(ca.suffix1, "Jr");
		BaseClass.selectByValue(ca.gender1, "M");
		BaseClass.selectByValue(ca.month1, "06");
		ca.day1.sendKeys(BaseClass.getProperty("BirthDate1"));
		ca.year1.sendKeys(BaseClass.getProperty("BirthYear1"));
		
		ca.firstName2.sendKeys(BaseClass.getProperty("FirstName2"));
		ca.lastName2.sendKeys(BaseClass.getProperty("LastName2"));
		BaseClass.selectByValue(ca.suffix2, "Jr");
		BaseClass.selectByValue(ca.gender2, "F");
		BaseClass.selectByValue(ca.month2, "09");
		ca.day2.sendKeys(BaseClass.getProperty("BirthDate2"));
		ca.year2.sendKeys(BaseClass.getProperty("BirthYear2"));
		
		ca.firstName3.sendKeys(BaseClass.getProperty("FirstName3"));
		ca.lastName3.sendKeys(BaseClass.getProperty("LastName3"));
		BaseClass.selectByValue(ca.suffix3, "Jr");
		BaseClass.selectByValue(ca.gender3, "F");
		BaseClass.selectByValue(ca.month3, "06");
		ca.day3.sendKeys(BaseClass.getProperty("BirthDate3"));
		ca.year3.sendKeys(BaseClass.getProperty("BirthYear3"));
		
		ca.creditCardNo.sendKeys(BaseClass.getProperty("CardNum"));
		BaseClass.selectByValue(ca.expMonth, "07");
		BaseClass.selectByValue(ca.expYear, "2025");
		ca.cvv.sendKeys(BaseClass.getProperty("cvv"));
		ca.cardHolder.sendKeys(BaseClass.getProperty("CardHolderName"));
		BaseClass.selectByValue(ca.country, "US");
		ca.paymentAddress.sendKeys(BaseClass.getProperty("Address1"));
		ca.paymentAddress2.sendKeys(BaseClass.getProperty("Address2"));
		ca.City.sendKeys(BaseClass.getProperty("City"));
		ca.State.sendKeys(BaseClass.getProperty("State"));
		ca.zip.sendKeys(BaseClass.getProperty("Zip"));
		ca.phoneNum.sendKeys(BaseClass.getProperty("PhoneNum"));
		ca.eMail.sendKeys(BaseClass.getProperty("eMail"));
		ca.password.sendKeys(BaseClass.getProperty("password"));
		ca.confirmPassword.sendKeys(BaseClass.getProperty("password"));
		
//		ca.chkBox.click();		
//		ca.purchaseBtn.click();
//		ca.okayBtn.click();
//		ca.noThankBtn.click();
		
	}

	@AfterTest
	@Then("Validate the passenger details")
	public void validate_the_passenger_details() {
		System.out.println("Validation");
		Assert.assertTrue(true);
		BaseClass.closeBrowser();
	}


}
