package com.cerotid.progressive;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cerotid.helpers.ThreadService;

public class FillVehicleDetails extends ThreadService {
	
	private WebDriver  _driver;
	
	By selectVehicleYear = By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Year']//li");
	
	By selectVehicleMake = By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Make']//li");
	
	By selectVehicleModel =By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Model']//li");
	
	By choosePrimaryUse = By.xpath("//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']");
	
	By chooseOwnOrLease = By.xpath("//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']");
	
	By chooseBlindSpotWarning = By.xpath("//input[@id='VehiclesNew_embedded_questions_list_BlindSpotWarning_N']");
	
	By chooseOwnPeriod = By.xpath("//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']");
	
	By clickOnDone = By.xpath("//div[@id='Edit_Button_On_0']//loading-button[@class='blue']");
	
	By continueToNextPage = By.xpath("//forward-navigation//button");
			
			
	
	
	public FillVehicleDetails(WebDriver driver) {
		
		this._driver = driver;
		
 }
	
	public void Automate(String vechicleYear ,String vechicleMake ,String vechicleModel,String primaryUse,String ownOrLease,String vechiclePeriod,String blindSpotWarning) {
		
		
		Sleep(5000);
		selectVechicleYear(vechicleYear);
		
		Sleep(3500);
		selectVechileMake(vechicleMake);
		
		Sleep(2500);
		selectVechicleModel(vechicleModel);
		
		
		
		Sleep(3500);
		choosePrimaryUse(primaryUse);
		
		Sleep(2000);
		chooseOwnOrLease(ownOrLease);
		
		Sleep(2000);
		chooseOwnPeriod(vechiclePeriod);
		
		Sleep(2000);
		vechicleBlindSpotWarning(blindSpotWarning);
		
		Sleep(2000);
		clickOnDone();
		
		Sleep(2500);
		continueToNextPage();
		
}
	
	
	
	
	private void selectVechicleYear(String vechicleYear) {
		
	
	  // WebElement vehicleYear = _driver.findElement(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Year']"));
		
		List<WebElement> vehicleYearsList = _driver.findElements(selectVehicleYear);
		
		String YearToChoose = vechicleYear;
		  
		  for (int i = 0; i < vehicleYearsList.size(); i++) {
			  
			  if (vehicleYearsList.get(i).getText().equals(YearToChoose)) {
				  
				  vehicleYearsList.get(i).click();
					break;
					
				}
			
		}
		
		
}
	
	
	
	private void selectVechileMake(String vechicleMake) {
		
		//WebElement VehicleMake = _driver.findElement(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Make']"));
				
		
		List<WebElement> vehicleMakeList = _driver.findElements(selectVehicleMake);
 		
		String MakeToChoose = vechicleMake;
		
		for (int i = 0; i < vehicleMakeList.size(); i++) {
			  
			  if (vehicleMakeList.get(i).getText().equals(MakeToChoose)) {
				  
				  vehicleMakeList.get(i).click();
				  
					break;
					
			}
	 }
		
		
		
		
}
	

	
	
	private void selectVechicleModel(String vechicleModel) {
		
		//WebElement VechicleModel = _driver.findElement(By.xpath("//list-input[@id='VehiclesNew_embedded_questions_list_Model']"));
		
		List<WebElement> vehicleModelList = _driver.findElements(selectVehicleModel);
		
		String ModelToChoose = vechicleModel;
		
		for (int i = 0; i < vehicleModelList.size(); i++) {
			  
			  if (vehicleModelList.get(i).getText().equals(ModelToChoose)) {
				  
				  vehicleModelList.get(i).click();
				  
					break;
					
			}
	}
		
		
		
}
	
	
	
	private void choosePrimaryUse(String primaryUse) {
		
		WebElement primaryUseElement = _driver.findElement(choosePrimaryUse);
		
		Select selectPrimaryUse = new Select(primaryUseElement);
		
		String choosePrimaryUse = primaryUse;
		
		selectPrimaryUse.selectByValue(choosePrimaryUse);
		
		
		
		
	}
	

	
	private void chooseOwnOrLease(String ownOrLease) {
		
		WebElement vechicleOwnOrLease = _driver.findElement(chooseOwnOrLease);
		
		Select selectVechicleOwnOrLease = new Select(vechicleOwnOrLease);
		
		String chooseOwnOrLease = ownOrLease;
		
		selectVechicleOwnOrLease.selectByValue(chooseOwnOrLease);
		
	}
	
	
	
	
	
	
	private void chooseOwnPeriod(String vechiclePeriod) {
		
		WebElement vechicleOwnPeriod = _driver.findElement(chooseOwnPeriod);
		
		Select selectVechicleOwnPeriod = new Select(vechicleOwnPeriod);
		
		String chooseVechicleOwnPeriod =vechiclePeriod;
		
		selectVechicleOwnPeriod.selectByValue(chooseVechicleOwnPeriod);
		
		
	}
	
	private void  vechicleBlindSpotWarning(String blindSpotWarning ) {
		
		WebElement blindSpotWarningElement =  _driver.findElement(chooseBlindSpotWarning);
		
		blindSpotWarningElement.sendKeys(blindSpotWarning);
		blindSpotWarningElement.sendKeys(Keys.ENTER);
		
		
	}
	
	
	
	private void clickOnDone() {
		
		WebElement chooseClick = _driver.findElement(clickOnDone);
		
		chooseClick.click();
		
	}

	private void continueToNextPage() {
		
		WebElement chooseContinue = _driver.findElement(continueToNextPage);
		
		chooseContinue.click();
		
		
	}
	
	
	
	
	
	
	
	
	

}
