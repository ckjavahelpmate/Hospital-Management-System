package com.hms.elementrepository.doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.DoctorBasePage;

public class UpdatePatientPage extends DoctorBasePage {

	public UpdatePatientPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "patname")
	private WebElement patientNameTextField;

	@FindBy(name = "patcontact")
	private WebElement patientContactNoTextField;

	@FindBy(id = "patemail")
	private WebElement patientEmailTextField;

	@FindBy(xpath = "//input [ @value = 'Male']")
	private WebElement femaleRadioButton;

	@FindBy(xpath = "//input [ @value = 'Female']")
	private WebElement maleRadioButton;

	@FindBy(name = "pataddress")
	private WebElement patientAddressTextField;

	@FindBy(name = "patage")
	private WebElement patientAgeTextField;

	@FindBy(name = "medhis")
	private WebElement medicalHistoryTextField;

	@FindBy(id = "submit")
	private WebElement updateButton;

	public WebElement getPatientNameTextField() {
		return patientNameTextField;
	}

	public WebElement getPatientContactNoTextField() {
		return patientContactNoTextField;
	}

	public WebElement getPatientEmailTextField() {
		return patientEmailTextField;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getPatientAddressTextField() {
		return patientAddressTextField;
	}

	public WebElement getPatientAgeTextField() {
		return patientAgeTextField;
	}

	public WebElement getMedicalHistoryTextField() {
		return medicalHistoryTextField;
	}

	public WebElement getUpdateButton() {
		return updateButton;
	}

}
