package com.ShoppingApplication.pomreprository.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EveningDress extends BasePOMpage{
	@FindBy(xpath="(//div[@class='checker'])[3]")
   private WebElement sizecb;
	
	@FindBy(xpath ="(//input[@class='checkbox'])[8]")
	private WebElement manufacturecb;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement deliveryBtn;

	public WebElement getSizecb() {
		return sizecb;
	}

	public WebElement getManufacturecb() {
		return manufacturecb;
	}

	public WebElement getDeliveryBtn() {
		return deliveryBtn;
	}
	
	public EveningDress(WebDriver driver) {
		super(driver);
	}
	
	public void deliveryBtn() {
		sizecb.click();
		manufacturecb.click();
		deliveryBtn.click();
	}
	
	
}
