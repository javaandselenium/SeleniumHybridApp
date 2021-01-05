package com.ShoppingApplication.scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppingApplication.genericlib.BaseClass;
import com.ShoppingApplication.genericlib.Propertylib;
import com.ShoppingApplication.genericlib.Utilites;
import com.ShoppingApplication.pomreprository.pages.EveningDress;
import com.ShoppingApplication.pomreprository.pages.Home;
import com.ShoppingApplication.pomreprository.pages.Login;

public class ProductDelivery extends BaseClass {
	@Test
	public void Delivery() throws FileNotFoundException, IOException, InterruptedException {
		Login l=new Login(driver);
		l.loginCredtails(Propertylib.getpropertydata("username"),Propertylib.getpropertydata("password"));
		Home h=new Home(driver);
		Thread.sleep(4000);
		Utilites.mouseHover(driver,h.getDressBtn());
		h.eveningProduct();
		EveningDress e=new EveningDress(driver);
		e.deliveryBtn();
	}

}
