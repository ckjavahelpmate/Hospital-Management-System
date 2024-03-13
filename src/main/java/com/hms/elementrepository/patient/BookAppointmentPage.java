package com.hms.elementrepository.patient;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.hms.base.PatientBasePage;

public class BookAppointmentPage extends PatientBasePage {

	public BookAppointmentPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "Doctorspecialization")
	private WebElement doctorSpecializationDropdown;

	@FindBy(id = "doctor")
	private WebElement doctorDropdown;

	@FindBy(id = "fees")
	private WebElement consultancyFeesDropdown;

	@FindBy(name = "appdate")
	private WebElement dateTextfield;

	@FindBy(name = "apptime")
	private WebElement timeTextfield;

	@FindBy(name = "submit")
	private WebElement submitButton;

	public WebElement getDoctorSpecializationDropdown() {
		return doctorSpecializationDropdown;
	}

	public WebElement getDoctorDropdown() {
		return doctorDropdown;
	}

	public WebElement getConsultancyFeesDropdown() {
		return consultancyFeesDropdown;
	}

	public WebElement getDateTextfield() {
		return dateTextfield;
	}

	public WebElement getTimeTextfield() {
		return timeTextfield;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void selectDoctorSpecializationByValue(String value) {
		Select select = new Select(getDoctorSpecializationDropdown());
		select.selectByValue(value);
	}

	public void selectDoctorByVisibleText(String visibleText) {
		Select select = new Select(getDoctorDropdown());
		select.selectByVisibleText(visibleText);
	}

	public void selectDoctorFeesByValue(String value) {
		Select select = new Select(getConsultancyFeesDropdown());
		select.selectByValue(value);
	}

	public void selectDate(int dd, int mm, int yyyy) {
		LocalDate.of(yyyy, mm, dd);
		getDateTextfield().sendKeys(yyyy + "-" + mm + "-" + dd);
	}

	public void selectTimeSlot(int hour, int minute, String amPm) {
		if (hour > 12 || hour < 1 || minute < 1 || minute > 59) {
			throw new InvalidTimeException("Invalid Time");
		}
		WebElement time = getTimeTextfield() ;
		time.clear();
		if (amPm.charAt(0) == 'a' || amPm.charAt(0) == 'A') {
			time.sendKeys(hour + ":" + minute + " AM");
		} else if (amPm.charAt(0) == 'p' || amPm.charAt(0) == 'P') {
			time.sendKeys(hour + ":" + minute + " PM");
		} else {
			throw new InvalidTimeException("Invalid Time");
		}
		getSubmitButton().click();
	}

	private class InvalidTimeException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		private InvalidTimeException(String msg) {
			super(msg);
		}
	}
}
