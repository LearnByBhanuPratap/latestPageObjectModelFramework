package com.uiFramework.companyName.projectName.testScripts;

import org.testng.annotations.Test;

import com.uiFramework.companyName.projectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.projectName.testbase.TestBase;

public class Test1 extends TestBase{

	
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
