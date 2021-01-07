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
public class Login  {
	/**
	 * Login page elements
	 */
	public WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement signinBtn;
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id="passwd")
	private WebElement passwordTb;
	
	@FindBy(id="SubmitLogin")
	private WebElement sumbitBtn;
	
	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPasswordTb() {
		return passwordTb;
	}

	public WebElement getSumbitBtn() {
		return sumbitBtn;
	}

	public Login(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	

	public Home loginCredtails(String us,String pwd) {
		signinBtn.click();
		emailAddress.sendKeys(us);
		passwordTb.sendKeys(pwd);
		sumbitBtn.click();
		return new Home(driver);
	}
	

}
