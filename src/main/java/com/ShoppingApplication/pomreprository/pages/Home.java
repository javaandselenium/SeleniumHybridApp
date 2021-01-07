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
public class Home extends BasePOMpage {
	/**
	 * Elements of Homepage
	 */
	public WebDriver driver;
	
	@FindBy(id="search_query_top")
	private WebElement serachTb;
	
	@FindBy(name="submit_search")
	private WebElement serachBtn;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dressBtn;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement eveningdress;

	
	
	

	public WebElement getDressBtn() {
		return dressBtn;
	}

	public WebElement getEveningdress() {
		return eveningdress;
	}

	public WebElement getSerachTb() {
		return serachTb;
	}

	public WebElement getSerachBtn() {
		return serachBtn;
	}
	
	public Home(WebDriver driver){
//  this.driver=driver;
//  PageFactory.initElements(driver,this);
		super(driver);
	}
	
	public Product searching(String productes) {
		serachTb.sendKeys(productes);
		serachBtn.click();
		return new Product(driver);
	}
	
	public void eveningProduct() {
		eveningdress.click();
	}
	

}
