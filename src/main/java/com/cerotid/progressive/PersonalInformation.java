package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.ThreadService;

public class PersonalInformation  extends ThreadService{
	
	private WebDriver _driver;
	
	By enterFirstName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']");
	
	By enterMiddleName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_MiddleInitial']");
	
	By enterLastName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']");
	
	By enterSuffix = By.xpath("//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']");
	
	By enterDateOfBirth = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']");
			 
	By enterMailingAddress = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_MailingAddress']");
	
	By enterApartmentNumber = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_ApartmentUnit']");
	
	By enterCityName = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_City']");
	
	By enterZipCode = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_ZipCode']");
	
	By pOBoxMilitary = By.xpath("//input[@id='NameAndAddressEdit_embedded_questions_list_MailingZipType']");
	
	By startMyQuote = By.xpath("//div[@class='forward-navigation-wrapper']//button");
	
	
	
	 public PersonalInformation(WebDriver driver) {
		 
			this._driver = driver;
			
	 }
	 
	 
	 
	 public void Automate(String firstName,String lastName,String suffix, String DOB ,String mailingAddress ,String aptNumber,String cityName,String zipCode,Boolean checkPoBox) {
		 
		 Sleep(4000);
		 enterFirstName(firstName);
		 
		 
		 
		 
		 Sleep(2000);
		 enterLastName(lastName);
		 
		 Sleep(2000);
		 selectSuffix(suffix);
		 
		 
		 Sleep(3000);
		 enterDateOfBirth(DOB);
		 
		 Sleep(3000);
		 enterMailingAddress(mailingAddress);
		 
		 Sleep(2000);
		 enterApartmentNumber(aptNumber);
		 
		 Sleep(2000);
		 enterCityName(cityName);
		 
		 Sleep(2000);
		 enterZipCode(zipCode);
		 
		 
		 Sleep(2000);
		 pOBoxMilitary(checkPoBox);
		 
		Sleep(2500);
		startMyQuote();
		 
		 
		 
		 
	 }
	 
	 
	 private void enterFirstName(String firstName) {
		 
		 WebElement firstNameElement = _driver.findElement(enterFirstName);
		 firstNameElement.sendKeys(firstName);
		 firstNameElement.sendKeys(Keys.ENTER);
	 }
	 
	 
	 
	 private void enterLastName(String lastName) {
		 
		 WebElement lastNameElement = _driver.findElement(enterLastName);
		 
		 lastNameElement.sendKeys(lastName);
		 lastNameElement.sendKeys(Keys.ENTER);
	 }
	 
	 private void selectSuffix(String suffix) {
		 
		 WebElement suffixElement = _driver.findElement(enterSuffix);
		 
		 
		 Select selectSuffix = new Select(suffixElement);
		 
		 String chooseSuffix = suffix;
		 selectSuffix.selectByValue(chooseSuffix);
		 
		 
		 
		 
	 }
	 
	 private void enterDateOfBirth (String DOB) {
		 
		 WebElement dateOfBirthElement = _driver.findElement(enterDateOfBirth);
		 
		 dateOfBirthElement.sendKeys(DOB);
		 dateOfBirthElement.sendKeys(Keys.ENTER);
	 }
	 
	 
	 private void enterMailingAddress(String mailingAddress) {
		 WebElement streetNumberAndName = _driver.findElement(enterMailingAddress);
		 
		 streetNumberAndName.sendKeys(Keys.ENTER);
		 Sleep(2000);
		 streetNumberAndName.sendKeys(mailingAddress);
		 streetNumberAndName.sendKeys(Keys.ENTER);
		 
		 
	 }
	 
	 private void enterApartmentNumber(String aptNumber) {
		 WebElement aptNumberElement = _driver.findElement(enterApartmentNumber);
		 
		 aptNumberElement.sendKeys(aptNumber);
		 aptNumberElement.sendKeys(Keys.ENTER);
		 
		 
	 }
	 
	 private void enterCityName (String cityName) {
		 
		 WebElement cityNameElement = _driver.findElement(enterCityName);
		 cityNameElement.sendKeys(Keys.ENTER);
		 cityNameElement.sendKeys(cityName);
		 cityNameElement.sendKeys(Keys.ENTER);
		 
		 
		 
	}
	 
	 private void enterZipCode(String zipCode) {
			
			WebElement zipCodeElement = _driver.findElement(enterZipCode);
			
			
			zipCodeElement.sendKeys(zipCode);
			zipCodeElement.sendKeys(Keys.ENTER);
			
		 }
	 
	 
	 private void pOBoxMilitary (Boolean checkPoBox) {
		 //true
		 if(checkPoBox) {
			 WebElement selectPOBoxMilitary = _driver.findElement(pOBoxMilitary);
			 
			 selectPOBoxMilitary.click();
		 }
		 
		
		 
	 }
	 
	private void startMyQuote() {
		
		WebElement clickStartMyQuote = _driver.findElement(startMyQuote);
		
		clickStartMyQuote.click();
		
		
	}
	 
	 
	 
	 
	 
	
	 
	 
	 
	
}
