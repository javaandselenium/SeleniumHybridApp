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

public class AddingProductCart extends BaseClass {
	@Test
	public void addingProductcart() throws FileNotFoundException, IOException {
		Login l=new Login(driver);
		l.loginCredtails(Propertylib.getpropertydata("username"),Propertylib.getpropertydata("password"));
		Home h=new Home(driver);
		h.searching(Propertylib.getpropertydata("productname"));
		Product p=new Product(driver);
		Utilites.dropDown(p.getSortByDd(),Propertylib.getpropertydata("sortby"));
		p.selectedDress();
		AddToCart a=new AddToCart(driver);
		a.plusBtn();
		Utilites.dropDown(a.getSizeDd(),Propertylib.getpropertydata("size"));
		a.addtocartBtn();
				
		
		
	}

}
