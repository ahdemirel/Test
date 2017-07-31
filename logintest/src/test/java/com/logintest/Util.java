package com.logintest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {
	protected WebDriver driver;
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	public boolean isElementPresent(WebDriver driver, By by){
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public void setElementBy(By by, String value){
		WebElement element = driver.findElement(by);
		element.clear();
		element.sendKeys(value);
		sleep(1000);
	}
	public void setElementById(String id,String value){
		setElementBy(By.id(id),value);
	}
	
	public void clickElementBy(By by){
		driver.findElement(by).click();
		sleep(1000);
	}
	public void sleep(int millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}
}
