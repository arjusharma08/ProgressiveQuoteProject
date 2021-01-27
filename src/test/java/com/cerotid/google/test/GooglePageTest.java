package com.cerotid.google.test;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cerotid.google.GooglePage;


public class GooglePageTest {
	
	public WebDriver _driver;
	
	//Set system path
	
	@BeforeTest
	
	public void oneTimeSetUp() {
		
		   System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
		   _driver = new ChromeDriver();
		   
	}
	
	@Test()
	
	public void navigateToGoogleHomePage() {
		
		GooglePage googlePage = new GooglePage(_driver);
		googlePage.Automate();
		
		
	}
	
	@AfterTest()
	public void afterTest() {
		
		 _driver.close();
	}
	
	
	   
}
