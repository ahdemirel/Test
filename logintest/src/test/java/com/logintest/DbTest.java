package com.logintest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;

public class DbTest extends Base {

	@Test
	public void Db() throws  SQLException {
		new MainPage(driver).callPage().login("admin", "123456");
		//String sqlStr = "select  identity_no,name,surname,username from dbo.patrons WHERE name='Ali Hadi' ";
		String sqlStr="SELECT top 0.5 PERCENT *FROM dbo.patrons ORDER BY NEWID()";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sqlStr);
		while (rs.next()) {
			String a=rs.getString(3);
			String b=rs.getString(8);
			String c=rs.getString(10);
			String d=rs.getString(12);
			String e=" ";
			new MainPage(driver).callPageOdunc().ara(a,b,c,d,e);	
				
		}
	}
	
		
		
	}

