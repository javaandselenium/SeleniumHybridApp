package com.ShoppingApplication.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilites {
	/**
	 * To handle the dropdown
	 * @param element
	 * @param text
	 */
	
	public static void dropDown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
		
	}
	/**
	 * To handle the mouse hover
	 * @param driver
	 * @param element
	 */
	
	public static void mouseHover(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * To handle rightclick
	 * @param driver
	 * @param element
	 */
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * To handle the dropdown
	 * @param driver
	 */
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/**
	 * To handle the scrollbar
	 * @param driver
	 */
	
	public void scrollBar(WebDriver driver) {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("windows.scrollBy(0,5000)");
	}
	

}
