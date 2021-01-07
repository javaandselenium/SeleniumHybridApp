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
public class AddToCart extends BasePOMpage{
	/**
	 * Elements of Addtocart page
	 */
@FindBy(xpath="//i[@class='icon-plus']")
private WebElement plus;

@FindBy(xpath="//select[@class='form-control attribute_select no-print']")
private WebElement sizeDd;

public WebElement getPlus() {
	return plus;
}

public WebElement getSizeDd() {
	return sizeDd;
}

public WebElement getColor() {
	return color;
}

public WebElement getAddTocart() {
	return addTocart;
}

public WebElement getProceedTocheckout() {
	return proceedTocheckout;
}

@FindBy(name="White")
private WebElement color;

@FindBy(xpath="//span[text()='Add to cart']")
private WebElement addTocart;

@FindBy(xpath="//a[@title='Proceed to checkout']")
private WebElement proceedTocheckout;

public AddToCart(WebDriver driver){
	super(driver);
}

public void plusBtn() {
	plus.click();
}

public void addtocartBtn() {
	//color.click();
	addTocart.click();
	proceedTocheckout.click();
}


}



