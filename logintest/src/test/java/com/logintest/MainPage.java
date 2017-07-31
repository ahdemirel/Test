package com.logintest;

import org.openqa.selenium.WebDriver;


public class MainPage extends Util{
	public MainPage(WebDriver driver) {
		super(driver);
	}	
	public Page callPage(){		
		return new Page(driver);
	}
	public OdunciadePage callPageOdunc() {
		return new OdunciadePage(driver);
	}
	public Kurallar Ekle() {
		return new Kurallar(driver);
	}
	
}
