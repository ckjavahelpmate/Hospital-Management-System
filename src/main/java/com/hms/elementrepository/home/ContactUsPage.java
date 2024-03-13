package com.hms.elementrepository.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	@FindBy(xpath = "//a[ @href = 'index.html' and text() = 'Home']")
	private WebElement homeButton;

	@FindBy(xpath = "//a[ @href = 'contact.php' ]")
	private WebElement contactButton;

	@FindBy(xpath = "//input[ @name = 'fullname']")
	private WebElement nameTextfield;

	@FindBy(xpath = "//input[ @name = 'emailid']")
	private WebElement emailTextfield;

	@FindBy(xpath = "//input[ @name = 'mobileno']")
	private WebElement mobileNoTextfield;

	@FindBy(xpath = "//textarea[ @name = 'description']")
	private WebElement descriptionTextfield;

	@FindBy(xpath = "//input[ @name = 'submit']")
	private WebElement submitButton;

	public ContactUsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getHomeButton() {
		return homeButton;
	}

	public WebElement getContactButton() {
		return contactButton;
	}

	public WebElement getNameTextfield() {
		return nameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getMobileNoTextfield() {
		return mobileNoTextfield;
	}

	public WebElement getDescriptionTextfield() {
		return descriptionTextfield;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
