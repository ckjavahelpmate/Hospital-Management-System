package com.hms.elementrepository.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//a[ @href = 'index.html' and text() = 'Home']")
	private WebElement homeButton;

	@FindBy(xpath = "//a[ @href = 'contact.php' ]")
	private WebElement contactButton;

	@FindBy(xpath = "//a[ @href='hms/user-login.php']")
	private WebElement petientLink;

	@FindBy(xpath = "//a[ @href='hms/doctor/' ]")
	private WebElement doctorLink;

	@FindBy(xpath = "//a[ @href='hms/admin' ]")
	private WebElement adminLink;

//	INitializing WebElements
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Getter Methods 
	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getContactButton() {
		return contactButton;
	}

	public WebElement getPetientLink() {
		return petientLink;
	}

	public WebElement getDoctorLink() {
		return doctorLink;
	}

	public WebElement getAdminLink() {
		return adminLink;
	}

}
