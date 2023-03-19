package com.cheapair.pagefactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cheapair.basepackage.BaseClass;


public class CheapAir extends BaseClass{
	
	public CheapAir(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='from1']")
	public WebElement from;
	
	@FindBy(xpath="//input[@id='to1']")
	public WebElement to;
	
	@FindBy(xpath="//input[@id='departs']//following::a[5]")
	public WebElement depart;
	
	@FindBy(xpath="//input[@id='departs']//following::a[7]")
	public WebElement returnDate;
	
	@FindBy(xpath="//input[@id='adults']//following::button[2]")
	public WebElement adult;
	
	@FindBy(xpath="//input[@id='seniors']//following::button[2]")
	public WebElement senior;
	
	@FindBy(xpath="//input[@id='children']//following::button[2]")
	public WebElement children;
	
	@FindBy(xpath="//input[@id='infants']//following::button[2]")
	public WebElement infants;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//div[@class=\"sc-fnGiBr kCVmbb\"]")
	public WebElement popUp;
	
	@FindBy(xpath="//div[@kind='light']//following::div[4]")
	public WebElement priceSortOrder;
	
	@FindBy(xpath="(//div[@class='src__Box-sc-1sbtrzs-0 imREpE']"
			+ "/following-sibling::span)[1]")
	public WebElement priceDropDown;
	
	@FindBy(xpath="(//span[@class='sc-heFykY dnRYbf']//span)[1]")
	public WebElement lowPriceFlight;
	
	@FindBy(xpath="//div[text()=\"Continue\"]")
	public WebElement tripDetail;
	
	@FindBy(xpath="//input[@id='firstName1']")
	public WebElement firstName1;
	
	@FindBy(xpath="//input[@id='lastName1']")
	public WebElement lastName1;
	
	@FindBy(xpath="//select[@id='suffix1']")
	public WebElement suffix1;
	
	@FindBy(xpath="//select[@id='gender1']")
	public WebElement gender1;
	
	@FindBy(xpath="//select[@id='dobMonth1']")
	public WebElement month1;
	
	@FindBy(xpath="//input[@id='dobDay1']")
	public WebElement day1;
	
	@FindBy(xpath="//input[@id='dobYear1']")
	public WebElement year1;
	
	@FindBy(xpath="//input[@id='firstName2']")
	public WebElement firstName2;
	
	@FindBy(xpath="//input[@id='lastName2']")
	public WebElement lastName2;
	
	@FindBy(xpath="//select[@id='suffix2']")
	public WebElement suffix2;
	
	@FindBy(xpath="//select[@id='gender2']")
	public WebElement gender2;
	
	@FindBy(xpath="//select[@id='dobMonth2']")
	public WebElement month2;
	
	@FindBy(xpath="//input[@id='dobDay2']")
	public WebElement day2;
	
	@FindBy(xpath="//input[@id='dobYear2']")
	public WebElement year2;
	
	@FindBy(xpath="//input[@id='firstName3']")
	public WebElement firstName3;
	
	@FindBy(xpath="//input[@id='lastName3']")
	public WebElement lastName3;
	
	@FindBy(xpath="//select[@id='suffix3']")
	public WebElement suffix3;
	
	@FindBy(xpath="//select[@id='gender3']")
	public WebElement gender3;
	
	@FindBy(xpath="//select[@id='dobMonth3']")
	public WebElement month3;
	
	@FindBy(xpath="//input[@id='dobDay3']")
	public WebElement day3;
	
	@FindBy(xpath="//input[@id='dobYear3']")
	public WebElement year3;
	
	@FindBy(xpath="//input[@id='ccNum1']")
	public WebElement creditCardNo;
	
	@FindBy(xpath="//select[@id='expMonth1']")
	public WebElement expMonth;
	
	@FindBy(xpath="//select[@id='expYear1']")
	public WebElement expYear;
	
	@FindBy(xpath="//input[@id='cvv1']")
	public WebElement cvv;
	
	@FindBy(xpath="//input[@id='paymentName1']")
	public WebElement cardHolder;
	
	@FindBy(xpath="//select[@id='paymentCountry1']")
	public WebElement country;
	
	@FindBy(xpath="//input[@id='paymentAddress1']")
	public WebElement paymentAddress;
	
	@FindBy(xpath="//input[@id='paymentAddress21']")
	public WebElement paymentAddress2;
	
	@FindBy(xpath="//input[@id='paymanetCity1']")
	public WebElement City;
	
	@FindBy(xpath="//select[@id='paymentState1']")
	public WebElement State;
	
	@FindBy(xpath="//input[@id='paymentZip1']")
	public WebElement zip;
	
	@FindBy(xpath="//input[@id='paymentPhone1']")
	public WebElement phoneNum;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement eMail;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='termsCheck']")
	public WebElement chkBox;
	
	@FindBy(xpath="//button[@id='purchaseBtn']")
	public WebElement purchaseBtn;
	
	@FindBy(xpath="//button[@id='hazmatAuthorize']")
	public WebElement okayBtn;
	
	@FindBy(xpath="//body[@id='body']")
	public WebElement noThankBtn;
	
}
	