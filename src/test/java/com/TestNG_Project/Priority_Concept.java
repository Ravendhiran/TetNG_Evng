package com.TestNG_Project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = -1)
	private void laptop() {
		System.out.println("Laptop");
	}
	
	@Test(priority = 0)
	private void mobile() {
		System.out.println("Mobile");
	}
	
	@Test
	private void earphone() {
		System.out.println("Earphone");
	}
	
	@Test(priority = 1)
	private void book() {
		System.out.println("Book");
	}

}
