package com.hms.elementrepository.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.PatientBasePage;

public class PatientDashboardPage extends PatientBasePage {

	public PatientDashboardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy( xpath = "//a[ contains( text() , 'Update Profile')]")
	private WebElement updateProfileLink;
	
	@FindBy( xpath = "//a[ contains( text() , 'View Appointment History')]")
	private WebElement viewAppointmentHistoryLink;
	
	@FindBy( xpath = "//a[ contains( text() , 'Book Appointment')]")
	private WebElement bookAppointmentLink;

	public WebElement getUpdateProfileLink() {
		return updateProfileLink;
	}

	public WebElement getViewAppointmentHistoryLink() {
		return viewAppointmentHistoryLink;
	}

	public WebElement getBookAppointmentLink() {
		return bookAppointmentLink;
	}

}
