package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page factory OR:
		@FindBy(xpath="//input[@name='email']")
		WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement login;
		
		@FindBy(xpath="//a[@class='list-group-item'][1]")
		WebElement register;
		
		@FindBy(xpath="//a[contains(text(),'Your Store')]")
		WebElement YourStore;
		
		//Initializing the page objects:
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean yourStoreImage() {
			return YourStore.isDisplayed();
		}
		public HomePage login(String un , String pwd) {
			username.sendKeys(un);
			password.sendKeys(pwd);
			login.click();
			
			return new HomePage();
		}

}
