package com.cerotid.progressive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cerotid.helpers.GenderEnum;

public class Main {

	public static void main(String[] args) {
		
		//Set system path
		
	   System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
	   WebDriver driver = new ChromeDriver();
	   
	 //Mazimize current window
		 driver.manage().window().maximize();
	   
	   HomePage homePage = new HomePage(driver);
	   homePage.Automate();
	   
	   
	   EnterZipCode enterzipcode = new EnterZipCode(driver);
	   enterzipcode.Automate("75061");
	   
	   
	   PersonalInformation personalInformation = new PersonalInformation(driver);
	   personalInformation.Automate("Arju","Sharma","I" ,"09/13/1997", "3707 W pionner dr", "3307","Irving" , "75061" ,true);
	   
	   FillVehicleDetails fillVehicleDetails = new FillVehicleDetails(driver);
	   fillVehicleDetails.Automate("2021","Audi","A4","4TNC","2","B","No");
	   
	   
	   FillDriverDetails fillDriverDetails = new FillDriverDetails(driver);
	   fillDriverDetails.Automate(GenderEnum.FEMALE,"Single","Currently in college","Student (full time)","123456789","Own home","No","Valid","3 years or more","No","No");
	   
	   
	   FillFinalDetailsPage fillFinalDetailsPage = new FillFinalDetailsPage(driver);
	   fillFinalDetailsPage.Automate("Y","1 to 3 years","$50,000/$100,000","N","N","02/15/2021","arzu.sharma10@gmail.com","2","0","Y","M");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   
		

	}
	
	

	
	

}
