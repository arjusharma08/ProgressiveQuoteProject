package com.cerotid.progressive.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cerotid.helpers.GenderEnum;
import com.cerotid.helpers.PropertiesExtension;
import com.cerotid.helpers.ScreenShotUtility;
import com.cerotid.progressive.EnterZipCode;
import com.cerotid.progressive.FillDriverDetails;
import com.cerotid.progressive.FillFinalDetailsPage;
import com.cerotid.progressive.FillVehicleDetails;
import com.cerotid.progressive.HomePage;
import com.cerotid.progressive.PersonalInformation;

public class ProgressivePageTest {
	
	 WebDriver _driver;
	 
	 ExtentReports extentReports;
	 PropertiesExtension properties;
	 
	 ScreenShotUtility utility;
	
	

   @BeforeTest
	public void setUpTest() {
	
	    extentReports  = new ExtentReports();
	    ExtentHtmlReporter  spark = new ExtentHtmlReporter("index.html");//html file will be generated
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("ProgressiveReport");
		extentReports.attachReporter(spark);
		
		properties = new PropertiesExtension();
		 utility = new ScreenShotUtility();
		 
		
		if(properties.isChrome()) {
			 System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
			   _driver  = new ChromeDriver();
			   
		}else {
			 System.setProperty("webdriver.gecko.driver", "./libs/geckodriver");
			_driver = new FirefoxDriver();
			
		}
		
		
		
		
}
   
   
   
    @Test()
    public void AutoQuoteTest() {

    	
    	
          ExtentTest quoteTest = extentReports.createTest("Progressive Auto Quote Test");
          
          try {
        	  quoteTest.info("Starting HomePage");
              HomePage homePage = new HomePage(_driver);
        	  homePage.Automate();
        	  quoteTest.log(Status.PASS, "Home Page Test Passes");
        	  
        	  
			} catch (Exception e) {
				quoteTest.log(Status.FAIL, "Home Page Test Failed");
			}
    	  
    	  
    	  
    	  try {
    		  
    		  quoteTest.info("Starting Zipcode Test");
        	  EnterZipCode zipCode = new EnterZipCode(_driver);
        	  zipCode.Automate("75062");
        	  quoteTest.log(Status.PASS, "ZipCOde Test Passes");
			
		} catch (Exception e) {
			quoteTest.log(Status.FAIL, "ZipCOde Test Failed");
			
		}
    	  
    	  
    	  
       	  try {
       		 quoteTest.info("Starting PersonalInformation Test");
          	  PersonalInformation personalInformation = new PersonalInformation(_driver);
    	      personalInformation.Automate("Arju","Sharma","I" ,"09/13/1997", "3707 W pionner dr", "3307","Irving" , "75061",true);
    	      quoteTest.log(Status.PASS, "PersonalInfromation Test Passes");
			
		} catch (Exception e) {
			 quoteTest.log(Status.FAIL, "PersonalInfromation Test Failed");
			
		}
    	  
    	  
       	 
 	      
 	      try {
 	    	 quoteTest.info("Starting FillVechicleDetails Test");
 	 	      FillVehicleDetails fillVehicleDetails = new FillVehicleDetails(_driver);
 	 		  fillVehicleDetails.Automate("2021","Audi","A4","4TNC","2","B","No");
 	 		  quoteTest.log(Status.PASS, "FillVehicleDetails Test Passes");
 	 		  
			
		} catch (Exception e) {
			quoteTest.log(Status.FAIL, "FillVehicleDetails Test Failed");
			
		}
 	      
 	     
 		  try {
 			 quoteTest.info("Starting FillDriverDetails Test"); 
 	 		  FillDriverDetails fillDriverDetails = new FillDriverDetails(_driver);
 	 		  fillDriverDetails.Automate(GenderEnum.FEMALE,"Single","Currently in college","Student (full time)","123456789","Own home","No","Valid","3 years or more","No","No");
 	 		  quoteTest.log(Status.PASS, "FillDriverDetails Test Passes"); 
 	 		  
			
		} catch (Exception e) {
			quoteTest.log(Status.FAIL, "FillDriverDetails Test Failed"); 
			
		}
 		  
 		  
 		  
 		  try {
 			 quoteTest.info("Starting FillFinalDetailsPage Test");
 	 		  FillFinalDetailsPage fillFinalDetailsPage = new FillFinalDetailsPage(_driver);
 	 		  fillFinalDetailsPage.Automate("Y","1 to 3 years","$50,000/$100,000","N","N","02/15/2021","arzu.sharma10@gmail.com","2","0","Y","M");
 	 		   quoteTest.log(Status.PASS, "FillFinalDetailsPage Test Page Passes");
 	 	      
 			  
		} catch (Exception e) {
			quoteTest.log(Status.FAIL, "FillFinalDetailsPage Test Page Failed");
	 	      
			
		}
 		  
       	  
 		  
 }

    @AfterTest()
    public void Aftertest() {
	   
	   _driver.close();
	   extentReports.flush();
   	 
    }

}
