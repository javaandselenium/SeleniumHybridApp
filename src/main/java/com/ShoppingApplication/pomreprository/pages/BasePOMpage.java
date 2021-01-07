package com.ShoppingApplication.pomreprository.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePOMpage {
	public  WebDriver driver;
	
	public BasePOMpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
