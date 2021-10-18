package com.adactin.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel 
{
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="datepick_in")
	private WebElement dateCheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement dateCheckOut;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement goNext;

	public WebElement getGoNext() {
		return goNext;
	}

	public WebElement getRadio() {
		return radio;
	}

	public SearchHotel(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getDateCheckIn() {
		return dateCheckIn;
	}

	public WebElement getDateCheckOut() {
		return dateCheckOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
