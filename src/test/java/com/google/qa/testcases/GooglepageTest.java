package com.google.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.qa.base.Testbase;
import com.google.qa.pages.GmailPage;
import com.google.qa.pages.Googlepage;
import com.google.qa.pages.ImagesPage;
import com.google.qa.util.TestUtil;

public class GooglepageTest extends Testbase {

	Googlepage googlepage;
	String sheetName = "Search";
	public GooglepageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		googlepage= new Googlepage();
	}
	
	@Test(priority=1)
	public void googlepagetitletest() {
		String title = googlepage.validategoogletitle();
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void googlelogotest() {
		boolean lg =googlepage.validategoogleimg();
		Assert.assertTrue(lg);
	}
	
	@Test(priority=3)
	public void validatesrchtest() {
		googlepage.validatesrch("selenium");
		
		
	}
		
	@DataProvider
	
	public Object[][] getGoogleTestdata() {
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;	
	}
	@Test(priority=7,dataProvider="getGoogleTestdata")
	
	public void validatesearch(String searchString) {
		
		googlepage.validatesrchxl(searchString);
	}
	
	@Test(priority=4)
	public void validategmailTest() {
		googlepage.clickOnGmailLink();
		
	}
	@Test(priority=5)
	public void validateImageslnk() {
		
		googlepage.clickOnImagesLink();
		
	}
	@Test(priority=6)
	public void validateSignIn() {
		
		googlepage.clickOnSignIn();
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
