package com.adactin.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseClass.BaseClass;
import com.adactin.configuration.FileReaderManager;
import com.adactin.configuration.ProjectObjectManager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass
{
	public static WebDriver driver = Runner.driver;
	
	ProjectObjectManager pom = new ProjectObjectManager(driver);
		
	@Given("^User enters the URL for the application$")
	public void user_enters_the_URL_for_the_application() throws Throwable 
	{
		String url = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getUrl();
		getUrl(url);
	}

	@When("^User enters \"([^\"]*)\" valid username$")
	public void user_enters_valid_username(String UserName) throws Throwable
	{
		String userName = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getUserName();
		sendKeys(pom.getInstanceLoginPage().getUsername(), UserName);
	}

	@When("^User enters \"([^\"]*)\" valid password$")
	public void user_enters_valid_password(String Password) throws Throwable 
	{
		String password = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getPassword();
		sendKeys(pom.getInstanceLoginPage().getPassword(), Password);
	}

	@Then("^Verify username and password to login$")
	public void verify_username_and_password_to_login() throws Throwable 
	{
		click(pom.getInstanceLoginPage().getLogin());
	}
	
	@Given("^A Valid User Account$")
	public void a_Valid_User_Account() throws Throwable 
	{
	    getWait(5000);
	}

	@When("^All necessary details are given and submited$")
	public void all_necessary_details_are_given_and_submited() throws Throwable 
	{
		String country = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCountry();
		selectDropDownOptions("byValue",country, pom.getInstanceSearchHotel().getLocation());
		
		String hotelName = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getHotelName();
		selectDropDownOptions("byValue", hotelName, pom.getInstanceSearchHotel().getHotels());
		
		String roomType = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getRoomType();
		selectDropDownOptions("byValue", roomType,pom.getInstanceSearchHotel().getRoomType());
		
		pom.getInstanceSearchHotel().getDateCheckIn().clear();
		
		String checkIn = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCheckIn();
		sendKeys(pom.getInstanceSearchHotel().getDateCheckIn(), checkIn);
		
		pom.getInstanceSearchHotel().getDateCheckOut().clear();
		
		String checkOut = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCheckOut();
		sendKeys(pom.getInstanceSearchHotel().getDateCheckOut(), checkOut);
		
		String countOfAdults = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCountOfAdults();
		selectDropDownOptions("byVisibleText", countOfAdults , pom.getInstanceSearchHotel().getAdults());
	}

	@Then("^Click Submit to redirect to next page$")
	public void click_Submit_to_redirect_to_next_page() throws Throwable 
	{
		click(pom.getInstanceSearchHotel().getSubmit());
		click(pom.getInstanceSearchHotel().getRadio());
		click(pom.getInstanceSearchHotel().getGoNext());
	}
	
	@Given("^A redirected site$")
	public void a_redirected_site() throws Throwable 
	{
		Thread.sleep(1000);
	}

	@When("^all details are filled and click booked$")
	public void all_details_are_filled_and_click_booked() throws Throwable 
	{
	   String firstName = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getFirstName();
	   sendKeys(pom.getInstanceUserDetails().getFirstName(), firstName);
	   
	   String lastName = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getLastName();
	   sendKeys(pom.getInstanceUserDetails().getLastName(), lastName);
	   
	   String address = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getAddress();
	   sendKeys(pom.getInstanceUserDetails().getAddress(), address);
	   
	   String cardNumber = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCardNumber();
	   sendKeys(pom.getInstanceUserDetails().getCardNum(), cardNumber);
	   
	   String cardType = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCardType();
	   selectDropDownOptions("byValue", cardType, pom.getInstanceUserDetails().getCardType());
	   
	   String expireMonth = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getExpireMonth();
	   selectDropDownOptions("byVisibleText", expireMonth , pom.getInstanceUserDetails().getExpireMonth());
	   
	   String expireYear = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getExpireYear();
	   selectDropDownOptions("byVisibleText", expireYear , pom.getInstanceUserDetails().getExpireYear());
	   
	   String cvvNumber = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCvvNumber();
	   sendKeys(pom.getInstanceUserDetails().getCvvNumber(), cvvNumber);
	}

	@Then("^Booking Successful$")
	public void booking_Successful() throws Throwable 
	{
		click(pom.getInstanceUserDetails().getBookNow());
		System.out.println("Booking Successful..");
		scrollFeature(pom.getInstanceUserDetails().getItinerary());
		click(pom.getInstanceUserDetails().getItinerary());
		click(pom.getInstanceUserDetails().getLogout());
	}
}
