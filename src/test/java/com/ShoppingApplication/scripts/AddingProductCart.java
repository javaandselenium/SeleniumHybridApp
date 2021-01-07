package com.ShoppingApplication.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertylib;
import com.ShoppingApplication.genericlib.Utilites;
import com.ShoppingApplication.pomreprository.pages.AddToCart;
import com.ShoppingApplication.pomreprository.pages.Home;
import com.ShoppingApplication.pomreprository.pages.Login;
import com.ShoppingApplication.pomreprository.pages.Product;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AddingProductCart extends BaseClass {
	@Test
	public void addingProductcart() throws FileNotFoundException, IOException {
		ExtentTest test = reports.createTest("AddingProductCart");
		test.log(Status.PASS,"Open the browser");
		Login l=new Login(driver);
		l.loginCredtails(Propertylib.getpropertydata("username"),Propertylib.getpropertydata("password"));
		test.log(Status.SKIP,"Home page isdispalyed");
		Home h=new Home(driver);
		h.searching(Propertylib.getpropertydata("productname"));
		test.log(Status.WARNING,"adding cart");
		Product p=new Product(driver);
		Utilites.dropDown(p.getSortByDd(),Propertylib.getpropertydata("sortby"));
		test.log(Status.FAIL,"Home page isdispalyed");
		p.selectedDress();
		AddToCart a=new AddToCart(driver);
		a.plusBtn();
		Utilites.dropDown(a.getSizeDd(),Propertylib.getpropertydata("size"));
		a.addtocartBtn();
				
		
		
	}

}
