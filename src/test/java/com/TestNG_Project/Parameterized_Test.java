package com.TestNG_Project;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {

	@Test
	@Parameters({"username", "password"})
	private void credentials(@Optional("Smith")String username, int password ) {
		
		System.out.println("Usernamme: "+username);
		System.out.println("Password "+password);
		
	}
	
	
}
