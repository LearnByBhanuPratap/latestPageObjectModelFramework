package com.uiFramework.companyName.projectName.helper.browserConfiguration.config;

public class B implements A{
	


	public void test1() {
		// TODO Auto-generated method stub
		
	}

	public void test2() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		A obj = new B();
		obj.test1();
		obj.test2();
		
		C.reader = new B();
		C.reader.test1();
		C.reader.test2();
	}

}
