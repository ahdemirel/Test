package com.logintest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Page extends Util{

	public Page(WebDriver driver) {
		super(driver);
	}
	
		
	public MainPage login(String username,String password){
		setElementBy(By.name("username"),username);
		setElementBy(By.name("password"),password);
		clickElementBy(By.id("button-submit-login"));
		driver.get("http://opactest.ankaref.com/circulationLogin");
		tekrar(username,password);
		return new MainPage(driver);
	}
	public void tekrar(String username,String password) {
		setElementBy(By.name("username"),username);
		setElementBy(By.name("password"),password);
		clickElementBy(By.id("button-submit-login"));
		fonk();
		hata();
	}
	public void fonk() {
		String i=driver.getCurrentUrl();
		if(i.equals("http://opactest.ankaref.com/circulation")) {
			System.out.println("Enter the True page");
		}                           
		else
			System.out.println("Enter the Wrong page");	
	}
	public void hata() {
		if(!driver.findElements(By.xpath("//*[@id=\"login-form\"]/footer")).isEmpty()){
			String uyari =  driver.findElement(By.xpath("//*[@id=\"login-form\"]/footer/div/em")).getText();
		if(uyari.equals("Oturum açma bilgileriniz yanlış. Lütfen tekrar deneyiniz.")){
				System.out.println("Oturum açma bilgileriniz yanlış. Lütfen tekrar deneyiniz.");
			}
		}
		else	
		     System.out.println("Sisteme başarıyla giriş yapılmıştır."); 
		}
	}
	

