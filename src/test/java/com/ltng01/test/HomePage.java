package com.ltng01.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	@BeforeSuite
	public void before_suite(){
		System.out.println("I am Before Suite");
	}
	@AfterSuite
	public void after_suite(){
		System.err.println("I am After Suite");
	}
	@BeforeTest
	public void before_test(){
		
		System.out.println("I am before Test");
	}
	@AfterTest
	public void after_test(){
		System.out.println("I am after test");
	}
	@BeforeClass
	public void before_class(){
		System.out.println("I AM BEFORE CLASS");
		
	}
	@AfterClass
	public void after_class(){
		System.out.println("I am After Class");
	}
	@BeforeMethod
	public void before_method(){
		System.out.println("I am Before Method");
	}
	@AfterMethod()
	public void after_method(){
		System.out.println("I am After Method");
	}
	
  @Test(priority=1,dataProvider="dp_test", dataProviderClass=DataProvider_Test.class) //,enabled=false) 
  public void test_HomePage(String s1, String s2, String s3) {
	  System.out.println("Test case 1 : test_HomePage");
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println(s3);
	 AssertJUnit.assertTrue(true);
  }
  @Test(priority=2,dependsOnMethods={"test_HomePage"})
  public void test_DashBoard_Login() {
	  System.out.println("Test case 2 : test_DashBoard_Login");
	 AssertJUnit.assertTrue(true);
  }
  @Test(priority=3,groups={"FunTest"})
  public void test_About() {
	  System.out.println("Test case 3 : test_About");
	 AssertJUnit.assertTrue(true);
  }
  @Test(priority=4,groups={"RegTest","FunTest"})
  public void test_Help() {
	  System.out.println("Test case 4 : test_Help");
	 AssertJUnit.assertTrue(true);
  }
  @Test(priority=5,dependsOnMethods={"test_HomePage","test_DashBoard_Login"},alwaysRun=true)
  public void test_DashBoard_Logout() {
	  System.out.println("Test case 5 : test_DashBoard_Logout");
	 AssertJUnit.assertTrue(true);
  }
  
  
}
