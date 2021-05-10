package com.TestNG_Project;

import org.testng.annotations.Test;

public class Groups_Concept {
	
	@Test(groups = "Electronics")
	private void laptop() {
		System.out.println("Laptop");
	}
	
	@Test(groups = "Electronics")
	private void mobile() {
		System.out.println("Mobile");
	}
	
	@Test(groups = "Electronics")
	private void earphone() {
		System.out.println("Earphone");
	}
	
	@Test(groups = "Education")
	private void book() {
		System.out.println("Book");
	}
	
	@Test(groups = "Social Media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	
	@Test(groups = "Social Media")
	private void facebook() {
		System.out.println("Facebook");
	}

}
