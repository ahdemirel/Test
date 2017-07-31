package com.logintest;
import java.io.IOException;

import org.junit.Test;
public class TestClass extends Base {

	@Test
	public void DogruGiris() throws InterruptedException{
		new MainPage(driver).callPage().login("admin", "123456");
	}
	@Test 
	public void YanlisGiris() {
		new MainPage(driver).callPage().login("a", "password");
		//new Page(driver).fonk();	
}
	@Test
	public void DogruArama() {
		new MainPage(driver).callPage().login("admin", "123456");
		new MainPage(driver).callPageOdunc().ara("11111111111","Murat", "Yavuz", "muratyavuz", "");
		
		
	}
	@Test
	public void YanlisArama() {
		new MainPage(driver).callPage().login("admin", "123456");
		new MainPage(driver).callPageOdunc().ara("1111111111","Murat", "Yavuz", "muratyavuz", "");
		
	}
	@Test
	public void Temizleme() {
		new MainPage(driver).callPage().login("admin", "123456");
		new MainPage(driver).callPageOdunc().ara("11111111111","Murat", "Yavuz", "muratyavuz", "");
		new MainPage(driver).callPageOdunc().temizle();
	}
	@Test
	public void MateryalArama() {
		new MainPage(driver).callPage().login("admin", "123456");
		new MainPage(driver).callPageOdunc().materyal();
	}
	@Test
	public void KurallarEkle() {
		new MainPage(driver).callPage().login("admin", "123456");
		new MainPage(driver).Ekle().kuralTest();
	}
	@Test 
	public void KuralSilme() {
		new MainPage(driver).callPage().login("admin", "123456");
		new MainPage(driver).Ekle().kuralSilme();
	}
	@Test
	public void CezaTest() {
		new MainPage(driver).callPage().login("alihadi", "1");
		new MainPage(driver).Ekle().kuralkontrol();
	}
	@Test
	public void SureUzatma() throws IOException {
		new MainPage(driver).callPage().login("alihadi", "1");
		new MainPage(driver).Ekle().Uzatma();
	}
	@Test
	public void Iade() {
		new MainPage(driver).callPage().login("alihadi", "1");
		new MainPage(driver).Ekle().Iade();
	}
	@Test
	public void CezaRapor() {
		new MainPage(driver).callPage().login("alihadi", "1");
		new MainPage(driver).Ekle().Raporlar();
	}
	@Test
	public void Odunc() {
		new MainPage(driver).callPage().login("alihadi", "1");
		new MainPage(driver).Ekle().OduncAl();
	}
	
	
}
