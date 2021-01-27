package com.cerotid.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cerotid.helpers.ThreadService;

public class GooglePage extends ThreadService {
	
	
	
	// creating an instance of webdriver
	public WebDriver _driver;
	
	By goggleSearch = By.xpath("//input[@name='q']");
	
	
	//Constructor to create an object of this class
	 public GooglePage(WebDriver driver) {
			
			this._driver = driver;
	
	
	 }
	 
	 public void Automate() {
		 
		//Navigate to progressive page
			_driver.get("https://google.com");
			
			_driver.manage().window().maximize();
			
			Sleep(2500);
			
			googleSearch();
	 }
	 
	
	 
	 public void googleSearch() {
		 
		 WebElement searchField  = _driver.findElement(goggleSearch);
		 
		 
		 searchField.sendKeys("TestNG");
		 
		 searchField.sendKeys(Keys.ENTER);
		 
		 
		 
	 }

}
