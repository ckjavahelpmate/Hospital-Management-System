package com.hms.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientBasePage extends BasePage {

	public PatientBasePage(WebDriver driver) {
		super(driver);
	}

	@FindBy( xpath = "//span[ text() = ' Book Appointment ']")
	private WebElement bookAnAppointment ;
	
	@FindBy( xpath = "//span[ text() = ' Appointment History ']")
	private WebElement appointmentHistoryButton;
	
	@FindBy( xpath = "//span[ text() = ' Medical History ']")
	private WebElement medicalHistoryButton;

	public WebElement getBookAnAppointment() {
		return bookAnAppointment;
	}
	
	public WebElement getAppointmentHistoryButton() {
		return appointmentHistoryButton;
	}

	public WebElement getMedicalHistoryButton() {
		return medicalHistoryButton;
	}

}
