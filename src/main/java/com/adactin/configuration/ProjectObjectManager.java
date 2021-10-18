package com.adactin.configuration;

import org.openqa.selenium.WebDriver;

import com.adactin.pomClass.LoginPage;
import com.adactin.pomClass.SearchHotel;
import com.adactin.pomClass.UserDetails;

public class ProjectObjectManager 
{
	public static WebDriver driver;
	private LoginPage lp;
	private SearchHotel sh;
	private UserDetails ud;
	
	public ProjectObjectManager(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public LoginPage getInstanceLoginPage() 
	{
		lp = new LoginPage(driver);
		return lp;
	}
	
	public SearchHotel getInstanceSearchHotel() 
	{
		sh = new SearchHotel(driver);
		return sh;
	}
	
	public UserDetails getInstanceUserDetails() 
	{
		ud = new UserDetails(driver);
		return ud;
	}
	
}
