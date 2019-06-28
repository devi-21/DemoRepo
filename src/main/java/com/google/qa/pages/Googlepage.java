package com.google.qa.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.qa.base.Testbase;

public class Googlepage extends Testbase {
	
	public static Properties prop;

	
	@FindBy(xpath="//img[contains(@id,'hplogo')]")
	WebElement googlelogo;
	
	@FindBy(xpath="//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")
	WebElement searchlabel;
	
	@FindBy(xpath="//div[@class='FPdoLc VlcLAe']//input[@name='btnI']")
	WebElement luckylabel;
	
	@FindBy(xpath="//a[contains(text(),'Advertising')]")
	WebElement advertisinglnk;
	
	@FindBy(xpath="//a[contains(text(),'Business')]")
	WebElement businesslnk;
	
	@FindBy(xpath="//a[contains(text(),'About')]")
	WebElement aboutlnk;
	
	@FindBy(xpath="//a[contains(text(),'  How Search works ')]")
	WebElement howsrchlnk;
	
	@FindBy(xpath="//a[contains(text(),'Gmail')]")
	WebElement gmaillnk;
	
	@FindBy(xpath="//a[contains(text(),'Images')]")
	WebElement imageslnk;
	
	@FindBy(xpath="//a[@class='gb_x gb_dc']")
	WebElement googleappslnk;
	
	@FindBy(xpath="//a[@id='gb_70']")
	WebElement signbtn;

	@FindBy(xpath="//input[@name='q']")
	WebElement srcharea;
	
	
	public Googlepage() {
		prop=new Properties();

		
		PageFactory.initElements(driver, this);
	}
	// Title Validating method
	public String validategoogletitle() {
		
		return driver.getTitle();
	}
	// Logo validating method
	public boolean validategoogleimg() {
		
		return googlelogo.isDisplayed();
	}
	
	
	public Resultpage validatesrch(String strn) {
		srcharea.sendKeys(strn);
		searchlabel.click();
		return new Resultpage();
		
	}
	
	public Resultpage validatesrchxl(String str) {
		srcharea.sendKeys(str);
		searchlabel.click();
		return new Resultpage();
		
	}
	
	
	public GmailPage clickOnGmailLink() {
		
		gmaillnk.click();
		return new GmailPage();
		
	}
	public ImagesPage clickOnImagesLink() {
		
		imageslnk.click();
		return new ImagesPage();
		
	}
	
	public GmailPage clickOnSignIn() {
		signbtn.click();
		return new GmailPage();
		
	}

}
