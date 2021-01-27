package com.cerotid.progressive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.ThreadService;

public class FillFinalDetailsPage extends ThreadService{
	
	private WebDriver  _driver;
	
	By haveAutoInsurance = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_Y']");
	
	By timeWithCurrentCompany =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_RecentAutoInsuranceCompanyPeriod']");
	
	
	By bodilyInjuryLimits =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']");
	
	By nonAutoPolicyWithProgressive = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']");
	
	By previousAutoPolicyWithProgressive =By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_PriorProgressive_N']");
	
	By policyStartDate = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']");
	
	By policyHolderEmailAddress = By.xpath("//input[@id='FinalDetailsEdit_embedded_questions_list_PrimaryEmailAddress']");
	
	By policyHolderFamilySize =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']");
	
	By numberOfInjuryClaims =By.xpath("//select[@id='FinalDetailsEdit_embedded_questions_list_TotalPipClaimsCount']");
	
	By chooseContinue = By.xpath("//forward-navigation//button");
	
	By enrollSnapShot = By.xpath("//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_Y']");

	By snapShotEnrollmentOption = By.xpath("//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotEnrollmentExperience_M']");
		
	By chooseContinueForNextPage =By.xpath("//forward-navigation//button");
	
	By clickNoThanks = By.xpath("//div[@id='Div1']//loading-button");

	
  public FillFinalDetailsPage(WebDriver driver) {
		
		this._driver = driver;

       }

   public void Automate(String autoInsurance,String insuredTimeWithCompany,String bodyInjuryLimit,String nonAutoPolicy,String previousPolicyWithProgressive,String startDate,String emailAddress,String familySize,String injuryClaims,String snapEnroll,String snapShotOption) {
	
	Sleep(2500);
	haveAutoInsurance(autoInsurance);
	
	Sleep(2000);
	timeWithCurrentCompany(insuredTimeWithCompany);
	
	Sleep(2000);
	bodilyInjuryLimits(bodyInjuryLimit);
	
	Sleep(2000);
	nonAutoPolicyWithProgressive(nonAutoPolicy);
	
	Sleep(2000);
	previousAutoPolicyWithProgressive(previousPolicyWithProgressive);
	
	Sleep(2000);
	policyStartDate(startDate);
	
	Sleep(2500);
	PolicyHolderEmailAddress(emailAddress);
	
	
	Sleep(2500);
	policyHolderFamilySize(familySize);
	
	Sleep(2000);
	numberOfInjuryClaims(injuryClaims);
	
	
	Sleep(2500);
	chooseContinue();
	
	Sleep(2000);
	enrollSnapShot(snapEnroll);
	
	Sleep(2000);
	snapShotEnrollmentOption(snapShotOption);
	
	Sleep(2500);
	chooseContinueForNextPage();
	
	Sleep(2500);
	clickNoThanks();
	
	
	
  }

   private void haveAutoInsurance(String autoInsurance ) {
	   
	   WebElement autoInsuranceElement =_driver.findElement(haveAutoInsurance);
	   
	   autoInsuranceElement.sendKeys(autoInsurance);
	   
	   autoInsuranceElement.click();
	   
	   
	   
	   
}
   
   private void timeWithCurrentCompany(String insuredTimeWithCompany) {
	   
	   WebElement autoInsuredTime = _driver.findElement(timeWithCurrentCompany);
	   
	   Select currentCompany = new Select(autoInsuredTime);
	   
	   String chooseAutoInsuredTime = insuredTimeWithCompany;
	   
	   currentCompany.selectByVisibleText(chooseAutoInsuredTime);
			 
	   
	   
   }
   
   private void bodilyInjuryLimits(String bodyInjuryLimit) {
	   
	   WebElement injuryLimit = _driver.findElement(bodilyInjuryLimits);
	   
	   Select selectInjuryLimit = new Select(injuryLimit);
	   
	   String chooseBodilyInjuryLimit =bodyInjuryLimit;
	   
	   selectInjuryLimit.selectByVisibleText(chooseBodilyInjuryLimit);
	   
   }
   
   private void nonAutoPolicyWithProgressive(String nonAutoPolicy) {
	   
	   WebElement hasNoneAutoPolicy = _driver.findElement(nonAutoPolicyWithProgressive);
	   
	   hasNoneAutoPolicy.sendKeys(nonAutoPolicy);
	   
	   hasNoneAutoPolicy.click();
	   
	   
	   
   }
   
   private void previousAutoPolicyWithProgressive(String previousPolicyWithProgressive) {
	   
	   WebElement noAutoPolicyWithProgressive = _driver.findElement(previousAutoPolicyWithProgressive);
	   
	   noAutoPolicyWithProgressive.sendKeys(previousPolicyWithProgressive);
	   
	   noAutoPolicyWithProgressive.click();
	   
   }
   
   
   private void policyStartDate (String startDate) {
	   
	   WebElement startDateWithProgressive = _driver.findElement(policyStartDate);
	   
	   startDateWithProgressive.sendKeys(startDate);
	   
	   startDateWithProgressive.sendKeys(Keys.ENTER);
	   
   }
   
   private void PolicyHolderEmailAddress(String emailAddress) {
	   
	   WebElement emailAddressElement = _driver.findElement(policyHolderEmailAddress);
	   
	   emailAddressElement.sendKeys(emailAddress);
	   
	   emailAddressElement.sendKeys(Keys.ENTER);
	   
	   
 }
   
   private void policyHolderFamilySize(String familySize) {
	   
	   WebElement holderFamilySize = _driver.findElement(policyHolderFamilySize);
	   
	   Select selectFamilySize = new Select(holderFamilySize);
	   
	   String chooseHolderFamilySize =familySize;
	   
	   selectFamilySize.selectByValue(chooseHolderFamilySize);
	   
	   
	   
	   
	   
	   
	   
   }
   
   private void numberOfInjuryClaims(String injuryClaims ) {
	   
	   WebElement InjuryClaimsElement = _driver.findElement(numberOfInjuryClaims);
	   
	   Select selectPreviousInjuryClaims = new Select(InjuryClaimsElement);
	   
	   String choosePreviousClaims =injuryClaims;
	   
	   selectPreviousInjuryClaims.selectByVisibleText(choosePreviousClaims);
	   
	   
	   
	   
   }
   
   private void chooseContinue() {
	   
	   WebElement continueToNextPage = _driver.findElement(chooseContinue);
	   
	   continueToNextPage.click();
	   
	   
   }
   
   
   public void enrollSnapShot(String snapEnroll) {
   	
   	WebElement snapEnrollment = _driver.findElement(enrollSnapShot);
   	
   	snapEnrollment.sendKeys(snapEnroll);
   	
   	snapEnrollment.click();
   	
   	
   }
   
   private void snapShotEnrollmentOption(String snapShotOption) {
   	
   	WebElement chooseenrollmentOption = _driver.findElement(snapShotEnrollmentOption);
   	
   	chooseenrollmentOption.sendKeys(snapShotOption);
   	
   	chooseenrollmentOption.click();
   	
   	
   }
   
   private void chooseContinueForNextPage() {
   	
   	WebElement continueForNextPage =_driver.findElement(chooseContinueForNextPage);
   	
   	continueForNextPage.click();
   	
   }
   
   private void clickNoThanks() {
	   
	   WebElement noThanks = _driver.findElement(clickNoThanks);
	   noThanks.click();
	   
	   
   }
   
   
   
   


}
