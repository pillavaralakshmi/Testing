package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

import com.qa.base.BaseTest;

public class RegistationPage extends BaseTest{
	
	public RegistationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//a[@class='ico-register']")
	WebElement registerButton;
	
	@FindBy(xpath="//input[@id='gender-female']")
	WebElement radio;
	
	@FindBy (xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy (xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy (xpath="//*[@id='Password']")
	WebElement password;
	
	@FindBy (xpath="//*[@id='ConfirmPassword']")
	  WebElement confirmPassword;
	
	@FindBy (xpath="//input[@id='register-button']")
	 WebElement confirmRegister;
	
	@FindBy(xpath="(//a[@class='account'])[1]")
	WebElement account;
	
	public void registerUser(String first,String last,String mail) {
		registerButton.click();
		radio.click();
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		email.sendKeys(mail);
	}
	
	public void userPassword(String pass,String confirmPass) {
		password.sendKeys(pass);
		confirmPassword.sendKeys(confirmPass);
	}

	public void Register() {
		confirmRegister.click();
	}

	public String user() {	
		String acc = account.getText();
		return acc;	
		}
	
}
