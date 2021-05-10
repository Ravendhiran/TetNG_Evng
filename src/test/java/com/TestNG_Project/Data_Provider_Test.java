package com.TestNG_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "test_Data")
	private void credentials(String username, int password ) {
		
		System.out.println("Usernamme: "+username);
		System.out.println("Password "+password);
		
	}
	
	@DataProvider
	private Object[][] test_Data() {
		
		return new Object[][] {
		
			{"Ravi", 30},
			{"Ranjitha",24},
			{"Lithish",01}
			
	};
}
}
