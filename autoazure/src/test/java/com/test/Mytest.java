package com.test;

import org.testng.annotations.Test;

public class Mytest {
	
	@Test
	void setup()
	{
		System.out.println("Setip method...");
	}
	
	@Test
	void login()
	{
		System.out.println("login method...");
	}
	
	@Test
	void tearup()
	{
		System.out.println("tearup method...");
	}
}
