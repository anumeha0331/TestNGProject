package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Parameters({ "URL" })
	@Test
	public void mobileold(String urlname) 
	{
		System.out.println("weblogincar");
		System.out.println(urlname);

		
	}

	
	@Test
	public void Mobilenew(){
		
		System.out.println("Mobile");}

	@Test
	public void Demo1(){
		System.out.println("bye");
		
	}
}
