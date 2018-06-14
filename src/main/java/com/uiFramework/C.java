package com.uiFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C {
	int i = 1;
	
	@Test
	public void testLoginC(){

			System.out.println(i);
			i++;
			Assert.assertTrue(false);	
		
		
	}

}
