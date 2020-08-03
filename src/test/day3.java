package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {


	@Test (dataProvider = "getdata" )
			public void Demo3(String  username,String password)
	{
		System.out.println("personnel");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	@Test
	public Object[][] getdata()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="user1";
		data[0][1]="password1";
		data[1][0]="user2";
		data[1][1]="password2";
		data[2][0]="user3";
		data[2][1]="password3";
		return data;
		
	}
}
