package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	//Page factory OR:
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='login']")
	WebElement login;
	
	@FindBy(xpath="//a[@class='list-group-item'][1]")
	WebElement register;
	
	@FindBy(xpath="//button[contains(text(),' Your Store')]")
	WebElement YourStore;
	

}
