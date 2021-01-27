package com.cerotid.helpers;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility extends ThreadService{
	
	
public  void takeSnapShots(WebDriver _driver , String screenShotName) {
		
		try {
			//Creating a file object to take screenshot
			File src = ((TakesScreenshot) _driver).getScreenshotAs(OutputType.FILE);
			
			//store  source file in a new file "Screenshot"
			FileUtils.copyFile(src, new File( ("./ScreenShots/FullPage.png")));
			
			
			
			
			Thread.sleep(20000);
			
			System.out.println("Screenshots was Taken");
			
			
		}catch (Exception e) {
			System.out.println("Exception while taking Screnshot" + e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	
	
	

	
	



}
