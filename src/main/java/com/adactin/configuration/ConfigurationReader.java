package com.adactin.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader 
{
	public static Properties pro;
	public ConfigurationReader() throws Throwable 
	{
		File file = new File("C:\\Users\\Abishek Raj\\eclipse-workspace\\Adactin\\src\\main\\java\\com\\adactin\\configuration\\Adactin.properties");
		FileInputStream fis = new FileInputStream(file);
		pro = new Properties();
		pro.load(fis);		
	}
	
	public String getBrowser() 
	{
		String browser = pro.getProperty("browser");
		return browser;
	}
	
	public String getUrl() 
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getUserName() 
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword() 
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getCountry() 
	{
		String country = pro.getProperty("country");
		return country;
	}
	
	public String getHotelName() 
	{
		String hotel = pro.getProperty("hotelName");
		return hotel;
	}
	
	public String getRoomType() 
	{
		String roomType = pro.getProperty("roomType");
		return roomType;
	}
	
	public String getCheckIn() 
	{
		String checkIn = pro.getProperty("checkIn");
		return checkIn;
	}
	
	public String getCheckOut() 
	{
		String checkOut = pro.getProperty("checkOut");
		return checkOut;
	}
	
	public String getCountOfAdults() 
	{
		String adults = pro.getProperty("adults");
		return adults;
	}
	
	public String getFirstName() 
	{
		String firstName = pro.getProperty("firstName");
		return firstName;
	}
	
	public String getLastName() 
	{
		String lastName = pro.getProperty("lastName");
		return lastName;
	}
	
	public String getAddress() 
	{
		String address = pro.getProperty("address");
		return address;
	}
	
	public String getCardNumber() 
	{
		String cardNumber = pro.getProperty("cardNumber");
		return cardNumber;
	}
	
	public String getCardType() 
	{
		String cardType = pro.getProperty("cardType");
		return cardType;
	}
	
	public String getExpireMonth() 
	{
		String expireMonth = pro.getProperty("expireMonth");
		return expireMonth;
	}
	
	public String getExpireYear() 
	{		
		String expireYear = pro.getProperty("expireYear");
		return expireYear;
	}
	
	public String getCvvNumber() 
	{
		String cvvNumber = pro.getProperty("cvvNumber");
		return cvvNumber;
	}	
}
