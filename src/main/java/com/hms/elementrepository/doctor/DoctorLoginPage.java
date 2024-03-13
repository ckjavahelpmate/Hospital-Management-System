package com.hms.elementrepository.doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hms.elementrepository.home.HomePage;

public class DoctorLoginPage {
	
	private HomePage homePage;

	@FindBy(name = "username")
	private WebElement usernameTextfield;

	@FindBy(name = "password")
	private WebElement passwordTextfield;

	@FindBy(xpath = "//a[ contains( text() , 'Forgot Password' ) ]")
	private WebElement forgotPasswordLink;

	@FindBy(name = "submit")
	private WebElement loginButton;

	public DoctorLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		homePage = new HomePage(driver);
	}

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public void doctorLogin(String username, String password)
	{
		homePage.getDoctorLink().click();
		getUsernameTextfield().sendKeys(username);
		getPasswordTextfield().sendKeys(password);
		getLoginButton().click();
	}

}
