package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.RegistationPage;

public class TC_RegisterPage_002 extends BaseTest{
	
	@Test(priority = 1)
	public void test1() {
		TC_linkTest_001 tc1=new TC_linkTest_001();
		tc1.linkTest();
				
	}
  
	@Test(priority = 2)
	public void test2() {
		RegistationPage rp=new RegistationPage(driver);
		rp.registerUser("Sonu", "Vegi","raku4@gmail.com");
		rp.userPassword("Sonu@123", "Sonu@123");
		rp.Register();
	}
	   @Test(priority = 3)
	    public void testUserVerify() {
		RegistationPage rp=new RegistationPage(driver);
		String actualUser= rp.user();
		System.out.println("actual user name is ="+actualUser);
		String exceptUser=("raku4@gmail.com");
		System.out.println("excepted user name is="+exceptUser);
		
		Assert.assertEquals(actualUser, exceptUser);
	}

}
