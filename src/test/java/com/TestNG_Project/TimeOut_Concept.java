package com.TestNG_Project;

import org.testng.annotations.Test;

public class TimeOut_Concept {
	
	@Test(timeOut = 3000)
	private void demo() throws InterruptedException {
		
		
		System.out.println("Brrowser Launch");
		Thread.sleep(2000);
		System.out.println("Login Button Click");
		Thread.sleep(2000);
		System.out.println("Navigate To Another Page");
		
		
	}
	
}
