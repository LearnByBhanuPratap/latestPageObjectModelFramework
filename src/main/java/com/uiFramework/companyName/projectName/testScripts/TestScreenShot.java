package com.uiFramework.companyName.projectName.testScripts;

import org.testng.annotations.Test;

import com.uiFramework.companyName.bhanuProjectName.testbase.TestBase;
/**
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class TestScreenShot extends TestBase{

	@Test
	public void testScreen(){
		driver.get("https://www.seleniumhq.org/download/");
		captureScreen("firstScreen");
		}
}
