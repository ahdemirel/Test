package com.logintest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {
public WebDriver driver;
public Connection conn;
	@Before
	public void setUp() throws InterruptedException, ClassNotFoundException,SQLException{
		String baseUrl = "http://opactest.ankaref.com/circulationLogin";
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get(baseUrl);
	    driver.manage().window().maximize();		
		Thread.sleep(1000);
		
		try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://172.16.5.84;databaseName=librid_libridtest","sa","Ankaref1234");
			}
		catch (SQLException ex) {
				ex.printStackTrace();
				System.out.println("Veritabanına bağlantı sağlanamadı!");
				}
		}
	@After
	public void tearDown(){
		driver.close();
	}
}