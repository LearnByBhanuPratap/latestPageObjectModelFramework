package com.uiFramework.companyName.bhanuProjectName.testScripts;

import org.testng.annotations.Test;

import com.uiFramework.companyName.bhanuProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.bhanuProjectName.testbase.TestBase;

public class Test2 extends TestBase{

	
	@Test
	public void testLogin(){
		AssertionHelper.makeTrue();
	}
	
	@Test
	public void testLogin1(){
		AssertionHelper.makeFalse();
	}
	
	@Test
	public void testLogin2(){
		AssertionHelper.makeTrue();
	}
	
	@Test
	public void testLogin3(){
		AssertionHelper.makeFalse();
	}
}
