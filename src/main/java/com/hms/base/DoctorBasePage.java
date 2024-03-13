package com.hms.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorBasePage extends BasePage {

	public DoctorBasePage(WebDriver driver) {
		super(driver);
	}

	@FindBy( xpath = "//span[ text() = ' Appointment History ']")
	private WebElement appointmentHistoryButton;
	
	@FindBy( xpath =  "//span[ text() = ' Patients ']")
	private WebElement patientDropdown;
	
	@FindBy(xpath = "//span[ text() = ' Add Patient']")
	private WebElement addPatientButton;
	
	@FindBy(xpath = "//span[ text() = ' Manage Patient ']")
	private WebElement managePatientButton;
	
	@FindBy(xpath = "//span[ text() = ' Search ']")
	private WebElement searchTextfield;

	public WebElement getAppointmentHistoryButton() {
		return appointmentHistoryButton;
	}

	public WebElement getPatientDropdown() {
		return patientDropdown;
	}

	public WebElement getAddPatientButton() {
		return addPatientButton;
	}

	public WebElement getManagePatientButton() {
		return managePatientButton;
	}

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

}
