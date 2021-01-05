package com.ShoppingApplication.genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Bharani
 *
 */

public class BaseClass implements AutoConstant{
	/**
	 * launch the application and enter the url 
	 */
	public WebDriver driver;
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException {
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Propertylib.getpropertydata("URL"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod()
	/**
	 * To take the screenshot of failed testcases and close the application
	 * @param r
	 * @throws IOException
	 */
	public void closeapp(ITestResult r) throws IOException {
		int status = r.getStatus();
		String name = r.getName();
		if(status==2) {
			Photo.getPhoto(driver, name);
		}
		driver.close();
	}

	

}
