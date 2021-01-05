package com.ShoppingApplication.pomreprository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author QSP
 *
 */

public class Product {
	/**
	 * Elements of Productpage
	 */
	@FindBy(id="selectProductSort")
	private WebElement sortByDd;
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[3]")
    private WebElement dress;

	public WebElement getSortByDd() {
		return sortByDd;
	}

	public WebElement getDress() {
		return dress;
	}
	
	public Product(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void selectedDress() {
		dress.click();
	}
	
}
