package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cerotid.helpers.ThreadService;

public class EnterZipCode extends ThreadService {
	
    private WebDriver _driver;
    
  //Locating Elements using by object
  	By enterZipCodeInputPath = By.xpath("//input[@id='zipCode_overlay']");
  	By getQuoteButtonPath = By.xpath("//input[@id='qsButton_overlay']");
  	
  	
     public EnterZipCode(WebDriver driver) {
		
		this._driver = driver;
		
		
	}
	
	public void Automate(String zipCode) {
		
		Sleep(2000);
		enterZipCode(zipCode);
		
		
		
		getQuote();
		
	}
	
	private void enterZipCode(String zipCode) {
		
		WebElement zipCodeElement = _driver.findElement(enterZipCodeInputPath);
		
		
		zipCodeElement.sendKeys(zipCode);
		zipCodeElement.sendKeys(Keys.ENTER);
		
	 }
	
	
	private void getQuote() {
		
		WebElement getQuote = _driver.findElement(getQuoteButtonPath);
		
		getQuote.click();
	}
	
	
	
	


}
