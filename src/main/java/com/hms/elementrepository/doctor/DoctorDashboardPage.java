package com.hms.elementrepository.doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.DoctorBasePage;

public class DoctorDashboardPage extends DoctorBasePage {

	public DoctorDashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy( xpath = "//a[ contains( text() , 'Update Profile')]")
	private WebElement updateProfileLink;
	
	@FindBy( xpath = "//a[ contains( text() , 'View Appointment History')]")
	private WebElement viewAppointmentHistoryLink;

	public WebElement getUpdateProfileLink() {
		return updateProfileLink;
	}

	public WebElement getViewAppointmentHistoryLink() {
		return viewAppointmentHistoryLink;
	}

}
