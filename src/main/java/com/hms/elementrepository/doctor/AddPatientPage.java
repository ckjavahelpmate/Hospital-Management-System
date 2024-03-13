package com.hms.elementrepository.doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.DoctorBasePage;

public class AddPatientPage extends DoctorBasePage {

	public AddPatientPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "patname")
	private WebElement patientNameTextField;

	@FindBy(name = "patcontact")
	private WebElement patientContactNoTextField;

	@FindBy(id = "patemail")
	private WebElement patientEmailTextField;

	@FindBy(id = "rg-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "rg-male")
	private WebElement maleRadioButton;

	@FindBy(name = "pataddress")
	private WebElement patientAddressTextField;

	@FindBy(name = "patage")
	private WebElement patientAgeTextField;

	@FindBy(name = "medhis")
	private WebElement medicalHistoryTextField;

	@FindBy(id = "submit")
	private WebElement addButton;

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

	public WebElement getAddButton() {
		return addButton;
	}


}
