package com.logintest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Kurallar extends Util{
	public Kurallar(WebDriver driver) {
		super(driver);
	}
	public MainPage kuralTest() {
		clickElementBy(By.xpath("//*[@id=\"link-rules\"]"));
		clickElementBy(By.xpath("//*[@id=\"circAddRule\"]"));
		WebElement comboboxElement;
		comboboxElement=driver.findElement(By.xpath("//*[@id=\"biblioFrameworkSelection\"]"));
		Select combobox=new Select(comboboxElement);
		int random=new Random().nextInt(combobox.getOptions().size());
		combobox.selectByIndex(random);
		WebElement comboboxElementKullanici;
		comboboxElementKullanici=driver.findElement(By.xpath("//*[@id=\"patronTypeSelection\"]"));
		Select combobox2=new Select(comboboxElementKullanici);
		int random2=new Random().nextInt(combobox2.getOptions().size());
		combobox2.selectByIndex(random2);
		clickElementBy(By.xpath("//*[@id=\"hasInterval\"]"));
		clickElementBy(By.xpath("//*[@id=\"ruleIntervalStart\"]"));
		clickElementBy(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a"));
		clickElementBy(By.xpath("//*[@id=\"ruleIntervalEnd\"]"));
		clickElementBy(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[7]/a"));
		driver.findElement(By.xpath("//*[@id=\"checkoutableCheck\"]")).click();		
		setElementBy(By.xpath("//*[@id=\"checkoutPeriod\"]"),"1");
		Select oduncAlmaSure=new Select(driver.findElement(By.xpath("//*[@id=\"checkoutTimeUnitSelection\"]")));
		List <WebElement> oduncAlmaSureCount= oduncAlmaSure.getOptions();
		for(int i =0; i< oduncAlmaSureCount.size() ; i++){
			String value =  oduncAlmaSureCount.get(i).getText();
			oduncAlmaSure.selectByVisibleText(value);
		}
		WebElement comboboxElement3;
		comboboxElement3=driver.findElement(By.xpath("//*[@id=\"checkoutTimeUnitSelection\"]"));
		Select combobox3=new Select(comboboxElement3);
		int random3=new Random().nextInt(combobox3.getOptions().size());
		combobox3.selectByIndex(random3);
		setElementBy(By.xpath("//*[@id=\"retakePeriod\"]"),"12");
		Select tekrarOduncAlma=new Select(driver.findElement(By.xpath("//*[@id=\"retakeTimeUnitSelection\"]")));
		List <WebElement> tekrarOduncAlmaCounter = tekrarOduncAlma.getOptions();
		for(int i =0; i< tekrarOduncAlmaCounter.size() ; i++){
			String value = tekrarOduncAlmaCounter.get(i).getText();
			tekrarOduncAlma.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"allowedCheckoutCount\"]"),"12");
		driver.findElement(By.xpath("//*[@id=\"create-item-form\"]/div[6]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"renewableCheck\"]")).click();
		setElementBy(By.xpath("//*[@id=\"renewPeriod\"]"),"1");
		Select iadeUzatma=new Select(driver.findElement(By.xpath("//*[@id=\"renewTimeUnitSelection\"]")));
		List <WebElement> iadeUzatmaCount = iadeUzatma.getOptions();
		for(int i =0; i<iadeUzatmaCount.size() ; i++){
			String value = iadeUzatmaCount.get(i).getText();
			iadeUzatma.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"renewalTimeBeforeReturn\"]"),"1");
		Select iadeOncesi=new Select(driver.findElement(By.xpath("//*[@id=\"renewalTimeBeforeReturnTimeUnit\"]")));
		List <WebElement> iadeOncesiCount = iadeOncesi.getOptions();
		for(int i =0; i< iadeOncesiCount.size() ; i++){
			String value = iadeOncesiCount.get(i).getText();
			iadeOncesi.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"allowedRenewCount\"]"),"1");
		driver.findElement(By.xpath("//*[@id=\"create-item-form\"]/div[6]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"holdableCheck\"]")).click();
		setElementBy(By.xpath("	//*[@id=\"holdPeriod\"]"),"1");
		Select rezerve=new Select(driver.findElement(By.xpath("//*[@id=\"holdTimeUnitSelection\"]")));
		List <WebElement> rezerveCount = rezerve.getOptions();
		for(int i =0; i<rezerveCount.size() ; i++){
			String value=rezerveCount.get(i).getText();
			rezerve.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"allowedHoldCount\"]"),"1");
		driver.findElement(By.xpath("//*[@id=\"create-item-form\"]/div[6]/ul/li[4]/a")).click();
		setElementBy(By.xpath("//*[@id=\"fineDefaultAmount\"]"),"1");
		setElementBy(By.xpath("//*[@id=\"fineIncrementPeriod\"]"),"1");
		Select gecikenIade=new Select(driver.findElement(By.xpath("//*[@id=\"fineIncrementPeriodUnitSelection\"]")));
		List <WebElement> gecikenIadeCount = gecikenIade.getOptions();
		for(int i =0; i< gecikenIadeCount.size() ; i++){
			String value= gecikenIadeCount.get(i).getText();
			gecikenIade.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"fineIncrementAmount\"]"),"10");
		setElementBy(By.xpath("//*[@id=\"fineMaxAmount\"]"),"100");
		driver.findElement(By.xpath("//*[@id=\"create-item-form\"]/div[6]/ul/li[5]/a")).click();
		//*[@id="blacklistEnabledCheck"]
		clickElementBy(By.xpath("//*[@id=\"blacklistEnabledCheck\"]"));
		setElementBy(By.xpath("//*[@id=\"latencyPeriod\"]"),"1");
		Select toleransSure=new Select(driver.findElement(By.xpath("//*[@id=\"latencyTimeUnitSelection\"]")));
		List <WebElement>toleransSureCount= toleransSure.getOptions();
		for(int i =0; i<toleransSureCount.size() ; i++){
			String value=toleransSureCount.get(i).getText();
			toleransSure.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"latencyIncrementPeriod\"]"),"1");
		Select toleransGecikmeTur=new Select(driver.findElement(By.xpath("//*[@id=\"latencyIncrementTimeUnitSelection\"]")));
		List <WebElement> toleransGecikmeTurCount = toleransGecikmeTur.getOptions();
		for(int i =0; i<toleransGecikmeTurCount .size() ; i++){
			String value=toleransGecikmeTurCount .get(i).getText();
			toleransGecikmeTur.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"latencyBlacklistPeriod\"]"),"1");
		Select toleransGecikme=new Select(driver.findElement(By.xpath("//*[@id=\"latencyBlacklistTimeUnitSelection\"]")));
		List <WebElement> toleransGecikmeCount = toleransGecikme.getOptions();
		for(int i =0; i<toleransGecikmeCount.size() ; i++){
			String value=toleransGecikmeCount.get(i).getText();
			toleransGecikme.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"blacklistMaxPeriod\"]"),"1");
		Select maxKaraListe=new Select(driver.findElement(By.xpath("//*[@id=\"blacklistMaxTimeUnitSelection\"]")));
		List <WebElement> maxKaraListeCount = maxKaraListe.getOptions();
		for(int i =0; i<maxKaraListeCount.size() ; i++){
			String value=maxKaraListeCount.get(i).getText();
			maxKaraListe.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"maxLostCount\"]"),"1");
		setElementBy(By.xpath("//*[@id=\"lostBlacklistPeriod\"]"),"1");
		//*[@id="lostBlacklistTimeUnitSelection"]
		Select kayıpKaraListe=new Select(driver.findElement(By.xpath("//*[@id=\"lostBlacklistTimeUnitSelection\"]")));
		List <WebElement> kayıpKaraListeCount = kayıpKaraListe.getOptions();
		for(int i =0; i<kayıpKaraListeCount.size() ; i++){
			String value=kayıpKaraListeCount.get(i).getText();
			kayıpKaraListe.selectByVisibleText(value);
		}
		setElementBy(By.xpath("//*[@id=\"maxDamageCount\"]"),"1");
		setElementBy(By.xpath("//*[@id=\"damageBlacklistPeriod\"]"),"1");
		Select hasarKaraListe=new Select(driver.findElement(By.xpath("//*[@id=\"damageBlacklistTimeUnitSelection\"]")));
		List <WebElement> hasarKaraListeCount = hasarKaraListe.getOptions();
		for(int i =0; i<hasarKaraListeCount.size() ; i++){
			String value=hasarKaraListeCount.get(i).getText();
			hasarKaraListe.selectByVisibleText(value);
		}
		//driver.findElement(By.xpath("//*[@id=\"saveRule\"]")).click();
	return new MainPage(driver);
	}
	public MainPage kuralSilme() {	
		clickElementBy(By.cssSelector("#link-rules > span"));
		sleep(500);
	
		for(int i=1;i<9;) {
			String a=driver.findElement(By.xpath("//*[@id=\"circRulesTable\"]/tbody/tr["+i+"]/td[7]")).getText();
			if(a.equals("20.07.2017")) {
				clickElementBy(By.xpath("//*[@id=\"circRulesTable\"]/tbody/tr["+i+"]"));
				clickElementBy(By.xpath("//*[@id=\"circDeleteRule\"]"));
				clickElementBy(By.xpath("//*[@id=\"button-confirm-deletion\"]"));
			}
			else {
				clickElementBy(By.xpath("//*[@id=\"circRulesTable\"]/tbody/tr["+i+"]"));
				i++;
				}
			}
		return new MainPage(driver);
	}
	public MainPage OduncAl() {
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]"));
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button/i"));
		clickElementBy(By.xpath("//*[@id=\"search-advanced-button\"]"));
		clickElementBy(By.xpath("//*[@id=\"lastPage\"]"));
		clickElementBy(By.xpath("//*[@id=\"row_56\"]/td[1]/input"));
		clickElementBy(By.xpath("//*[@id=\"button-checkout\"]"));
		clickElementBy(By.xpath("//*[@id=\"delete-user-button\"]"));
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]"));
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button/i"));		
		clickElementBy(By.xpath("//*[@id=\"user-details\"]/div/ul/li[2]/a"));
		clickElementBy(By.xpath("//*[@id=\"readerCirculationTable\"]/tbody/tr"));
		String a=driver.findElement(By.xpath("//*[@id=\"readerCirculationTable\"]/tbody/tr[1]/td[2]")).getText();
			if(a.equals("MİLLİ GAZETE."))
				System.out.println("Ödünç alındı");
			else {
				System.out.println("Ödünç Alınamadı");
			}
		return new MainPage(driver);
	}
	public MainPage kuralkontrol() {
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]"));
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button/i"));
		clickElementBy(By.xpath("//*[@id=\"user-details\"]/div/ul/li[3]/a"));
		String paraCeza=driver.findElement(By.xpath("//*[@id=\"patronContent\"]/div[6]/span")).getText();
		if(paraCeza.equals("-")) {
			System.out.println("Borcunuz Bulunmamaktadır");
		}
		else {
			System.out.println("Para Cezanız"+" "+paraCeza);
		}
		return new MainPage(driver);
	}
	public MainPage Uzatma() throws IOException{
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]"));
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button"));
		clickElementBy(By.xpath("//*[@id=\"user-details\"]/div/ul/li[2]/a"));
		String uzatma=driver.findElement(By.xpath("//*[@id=\"readerCirculationTable\"]/tbody/tr/td[5]")).getText();
		if(uzatma.equals("27.07.2017 17:52")) {
			clickElementBy(By.xpath("//*[@id=\"readerCirculationTable\"]/tbody/tr/td[1]/input"));
			clickElementBy(By.xpath("//*[@id=\"button-patron-renew\"]"));
			sleep(500);
		}
		else {
			System.out.println("İade Edeceğiniz Süre Uzatılamadı");			
		}
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]"));
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button"));
		clickElementBy(By.xpath("//*[@id=\"user-details\"]/div/ul/li[2]/a"));
		String uzatılanSüre=driver.findElement(By.xpath("//*[@id=\"readerCirculationTable\"]/tbody/tr/td[6]")).getText();
		System.out.println("İade edeceğiniz süre uzatıldı yeni süreniz:"+" "+uzatılanSüre);
		String c=uzatılanSüre;
        File file = new File("C:\\Users\\AliHadi\\eclipse-workspace\\logintest\\src\\test\\java\\com\\logintest\\yazdır");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(c);
        bWriter.close();
		return new MainPage(driver);
		
	}
	public MainPage Iade() {
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");  
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]")); //ara
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button/i"));  //tik
		clickElementBy(By.xpath("//*[@id=\"user-details\"]/div/ul/li[2]/a")); 
		clickElementBy(By.xpath("//*[@id=\"readerCirculationTable\"]/tbody/tr/td[1]/input")); //iade edilecek kitap secme tik
		clickElementBy(By.xpath("//*[@id=\"button-patron-return\"]"));  //iade
		setElementBy(By.xpath("//*[@id=\"patron-search-username\"]"),"ali");  
		clickElementBy(By.xpath("//*[@id=\"search-user-button\"]")); //ara
		clickElementBy(By.xpath("//*[@id=\"patron-result-table\"]/tbody/tr/td[8]/button/i"));  //tik
		clickElementBy(By.xpath("//*[@id=\"user-details\"]/div/ul/li[4]/a"));
		String mesaj=driver.findElement(By.xpath("//*[@id=\"patronLogsTable\"]/tbody/tr[1]/td[4]/div")).getText();
		if(mesaj.equals("İade")) {
			System.out.println("Başarıyla İade  Yapıldı");
		}
		return new MainPage(driver);
	}
	public MainPage Raporlar() {
		clickElementBy(By.xpath("//*[@id=\"link-reports\"]"));
		clickElementBy(By.xpath("//*[@id=\"content\"]/div[2]/ul/li[8]/a"));
		for(int i=1;i<9;i++) {
			driver.findElement(By.xpath("//*[@id=\"circFeeReportTable\"]/tbody/tr["+i+"]/td[7]/div")).click();
			String a=driver.findElement(By.xpath("//*[@id=\"circFeeReportTable\"]/tbody/tr["+i+"]/td[1]/div")).getText();
			if(a.equals("Ali Hadi ankaref")) {
				sleep(500);
				String ödemeTarih=driver.findElement(By.xpath("//*[@id=\"circFeeReportTable\"]/tbody/tr[5]/td[8]/div")).getText();
				if(ödemeTarih.equals("")) {
					System.out.println("Ödeme yapmadınız");	
				}
				else {
					System.out.println("Ödeme Yaptığınız Tarih:"+ödemeTarih);
				}
				i=9;
			}
		}
		return new MainPage(driver);
	}
	}

	
