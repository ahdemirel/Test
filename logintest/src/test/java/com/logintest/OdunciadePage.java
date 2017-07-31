package com.logintest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OdunciadePage extends Util {
	public OdunciadePage(WebDriver driver) {
		super(driver);
	}
	public MainPage ara(String kimlikno,String ad,String soyad,String kullaniciadi,String barkod) {
		setElementBy(By.id("patron-search-id"),kimlikno);
		setElementBy(By.id("patron-search-name"),ad);
		setElementBy(By.id("patron-search-surname"),soyad);
		setElementBy(By.id("patron-search-username"),kullaniciadi);
		setElementBy(By.id("patron-search-barcode"),barkod);
		clickElementBy(By.id("search-user-button"));
		String mesaj=driver.findElement(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td")).getText();
		if(mesaj.equals("Eşleşen Kayıt Bulunmadı")) {
			System.out.print("Eşleşen Kayıt Bulunmadı");
		}
		else {
			String bilgi=driver.findElement(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr")).getText();
			System.out.println(bilgi);
		}
		return new MainPage(driver);

	}
	
	public MainPage temizle() {
		clickElementBy(By.id("delete-user-button"));
		if(!driver.findElements(By.xpath("//*[@id=\"patron-search-id\"]")).isEmpty()){
			System.out.println("Temizlendi");
		}
		return new MainPage(driver);
	}
	
	public MainPage materyal() {
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"builder_rule_0\"]/div[3]/select")));
		List <WebElement> elementCount = select.getOptions();
		for(int i =1; i< elementCount.size() ; i++){
			String value = elementCount.get(i).getText();
			select.selectByVisibleText(value);
			Select select2=new Select(driver.findElement(By.xpath("//*[@id=\"builder_rule_0\"]/div[4]/select")));
			List <WebElement> elementCount2 = select2.getOptions();
			for(int j=1;j<elementCount2.size();j++)
			{
				String value2=elementCount2.get(j).getText();
				select2.selectByVisibleText(value2);
				//sleep(1000);
				if(i==2||i==3||i==4) {
					Select select3=new Select(driver.findElement(By.xpath("//*[@id=\"builder_rule_0\"]/div[5]/select")));
					List <WebElement> elementCount3 = select3.getOptions();
					for(int k=2;k<elementCount3.size();k++)
					{
							String value3=elementCount3.get(k).getText();
							select3.selectByVisibleText(value3);
							//clickElementBy(By.id("search-advanced-button"));
					}
				}
				else if(i==7||i==8) {
					for(int k=0;k<5;k++) {
						String value4=elementCount2.get(k).getText();
						select2.selectByVisibleText(value4);
						if(k==4) {
								
								setElementBy(By.name("builder_rule_0_value_1"),"deneme");	
								break;
							}
						//clickElementBy(By.id("search-advanced-button"));
						}	
					}
				else if (i==10) {
					for(int k=0;k<2;k++) {
					String value6=elementCount2.get(k).getText();
					select2.selectByVisibleText(value6);
					//clickElementBy(By.id("search-advanced-button"));
					}
				}
				else if(i==14) {
						for(int x=0;x<3;x++) {
							String value5=elementCount2.get(x).getText();
							select2.selectByVisibleText(value5);
							if(x==2) {
									
									setElementBy(By.name("builder_rule_0_value_1"),"deneme");
									}
							//clickElementBy(By.id("search-advanced-button"));
							}
						}
				else if(i==19) {
					for(int x=0;x<4;x++) {
						String value5=elementCount2.get(x).getText();
						select2.selectByVisibleText(value5);
						//clickElementBy(By.id("search-advanced-button"));
						}
				}
				else {
					setElementBy(By.name("builder_rule_0_value_0"),"deneme");
					//clickElementBy(By.id("search-advanced-button"));
					}
			}
		}
		return new MainPage(driver);
	}
}