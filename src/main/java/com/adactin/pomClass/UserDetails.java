package com.adactin.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetails 
{
	public static WebDriver driver;
	
	public UserDetails(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardNum;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expireMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expireYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogout() {
		return logout;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpireMonth() {
		return expireMonth;
	}

	public WebElement getExpireYear() {
		return expireYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
}
