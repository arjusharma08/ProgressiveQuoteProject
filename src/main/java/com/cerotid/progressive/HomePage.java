package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cerotid.helpers.ThreadService;


public class HomePage extends ThreadService {
	
    private WebDriver _driver;
    
    //Locating Elements using by object
  	By autoLinkPath = By.xpath("//div[@id='site']//a[@data-tracking-label='auto_section']");
    
	public HomePage(WebDriver driver) {
		
		this._driver = driver;
	}
	
	public void Automate() {
		
		//Navigate to progressive page
		_driver.get("https://www.progressive.com/");
		
		_driver.manage().window().maximize();
		
		Sleep(2500);
		clickAuto();
		
		
		
		
	}

	private  void clickAuto() {
		
		WebElement autoLinkElement = _driver.findElement(autoLinkPath);
		autoLinkElement.click();
		
		
		
	}
	
	
	
	
	

}
