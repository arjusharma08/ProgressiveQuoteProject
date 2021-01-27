package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.*;



public class FillDriverDetails extends ThreadService{
	
private WebDriver  _driver;

By selectGenderFemalPath = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_F']");

By selectGenderMalePath = By.xpath("/input[@id='DriversAddPniDetails_embedded_questions_list_Gender_M']");

By selectMaritalStatus = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']");

By selectLevelOfEdu = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']");

By selectEmployementStatus = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']");

By fillSSN = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_SocialSecurityNumber']");

By selectPrimaryResidence = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']");

By latestMoved = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']");

By licenseStatus = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']");

By licenseYear = By.xpath("//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']");

By selectAccidentClaimOrNot = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']");

By clickTicketsOrViolations = By.xpath("//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']");

By clickToNextPage = By.xpath("//forward-navigation//button");

By clickContinueToFinalDetailPage = By.xpath("//forward-navigation//button");


	public FillDriverDetails(WebDriver driver) {
		
		this._driver = driver;
		
		
 }
	
	public void Automate(GenderEnum genderType,String maritalStatus,String education,String employementStatus,String SSN,String driverPrimaryResidence,String movedStatus,String driverLicenseStatus,String licensedYear, String accidentClaim, String violationTickets){
		
		Sleep(3500);
		selectGender(GenderEnum.FEMALE);
		
		Sleep(2000);
		selectMaritalStatus(maritalStatus);
		
		Sleep(2000);
		selectLevelOfEdu(education);
		
		
		Sleep(2000);
		selectEmployementStatus(employementStatus);
		
		Sleep(2000);
		fillSSN(SSN);
		
		Sleep(2000);
		selectPrimaryResidence(driverPrimaryResidence);
		
		Sleep(2000);
		latestMoved(movedStatus);
		
		Sleep(2000);
		licenseStatus (driverLicenseStatus);
		
		Sleep(2000);
		licenseYear(licensedYear);
		
		Sleep(2000);
		selectAccidentClaimOrNot(accidentClaim);
		
		Sleep(2000);
		clickTicketsOrViolations(violationTickets);
		
		
		Sleep(2500);
		clickToContinueForNextPage();
		
		Sleep(2500);
		clickContinueToFinalDetailPage();
		
		
}
	
	private void selectGender(GenderEnum genderType) {
		
		
		
		
		if(genderType == GenderEnum.FEMALE) {
			// check female radio button
			
			
			WebElement genderButton = _driver.findElement(selectGenderFemalPath);
			
			genderButton.sendKeys("Checked");
			genderButton.sendKeys(Keys.ENTER);
			
			
	}else {
			//check male radio button
		
		WebElement genderButton = _driver.findElement(selectGenderMalePath);
		genderButton.sendKeys("Checked");
		genderButton.sendKeys(Keys.ENTER);
			
			
			
		}
		
		
	}
	
	private void selectMaritalStatus(String maritalStatus) {
		
		WebElement maritalStatusElement = _driver.findElement(selectMaritalStatus);
		
		Select selectMaritalStatus = new Select(maritalStatusElement);
		
		String choosemaritalStatus = maritalStatus;
		
	     selectMaritalStatus.selectByVisibleText(choosemaritalStatus);
	     
	     
	
}
	
	
	private void selectLevelOfEdu(String education) {
		
		WebElement levelOfEducation = _driver.findElement(selectLevelOfEdu);
		
		Select selectLevelOfEducation = new Select(levelOfEducation);
		
		String chooseEducation = education;
		
		selectLevelOfEducation.selectByVisibleText(chooseEducation);
		
		
		
}
	
	
	private void selectEmployementStatus(String employementStatus) {
		
		WebElement driverEmployementStatus = _driver.findElement(selectEmployementStatus);
		
		Select selectEmployementStatus = new Select(driverEmployementStatus);
		
		String chooseStatus = employementStatus;
		
		selectEmployementStatus.selectByVisibleText(chooseStatus);
		
		
		
	}
	
	
	private void fillSSN(String SSN) {
		
		
		WebElement SSNElement = _driver.findElement(fillSSN);
		
		SSNElement.sendKeys(SSN);
		SSNElement.sendKeys(Keys.ENTER);
		
	}
	
	
	private void selectPrimaryResidence(String driverPrimaryResidence) {
		
		WebElement primaryResidenceElement = _driver.findElement(selectPrimaryResidence);
		
		Select driverResidence = new Select(primaryResidenceElement);
		
		String chooseResidence = driverPrimaryResidence;
		
		driverResidence.selectByVisibleText(chooseResidence);
		
		
		
		
	}
	
	private void latestMoved(String movedStatus) {
		
		WebElement driverLatestMoved = _driver.findElement(latestMoved);
		
		Select driverMovedStatus = new Select(driverLatestMoved);
		
		String chooseStatus = movedStatus;
		
		driverMovedStatus.selectByVisibleText(chooseStatus);
		
		
	}
	
	private void licenseStatus(String driverLicenseStatus) {
		
		WebElement driverLicenseStatusElement = _driver.findElement(licenseStatus);
		
		Select selectLicenseStatus = new Select(driverLicenseStatusElement);
		
		String chooseDriverLicenseStatus = driverLicenseStatus;
		
		selectLicenseStatus.selectByVisibleText(chooseDriverLicenseStatus);
		
		
		
		
	}
	
	private void licenseYear(String licensedYear) {
		
		WebElement driverLicenseYear = _driver.findElement(licenseYear);
		
		Select selectYearLicensed = new Select(driverLicenseYear);
		
		String chooseLivensedYear = licensedYear;
		
		selectYearLicensed.selectByVisibleText(chooseLivensedYear);
		
		
		
	}
	
	
	private void selectAccidentClaimOrNot(String accidentClaim) {
		
		
		WebElement accidentClaimOrNot =_driver.findElement(selectAccidentClaimOrNot);
		
		accidentClaimOrNot.sendKeys("accidentClaim");
		
		accidentClaimOrNot.sendKeys(Keys.ENTER);
		
		
		
		
	}
	
	private void clickTicketsOrViolations(String violationTickets) {
		
		WebElement ticketsOrViolations = _driver.findElement(clickTicketsOrViolations);

		ticketsOrViolations.sendKeys(violationTickets);
		
		ticketsOrViolations.sendKeys(Keys.ENTER);
		
	
	
	
	}
	
    private void clickToContinueForNextPage() {
    	
    	WebElement continueForNextPage = _driver.findElement(clickToNextPage);
    	
    	continueForNextPage.click();
    	
    	 
    }
    
    
    private void clickContinueToFinalDetailPage() {
    	
    	WebElement finalDetailPage = _driver.findElement(clickContinueToFinalDetailPage);
    	
    	finalDetailPage.click();
    	
    	
    }
   
    
    
    
}
