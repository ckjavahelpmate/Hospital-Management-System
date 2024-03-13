package com.hms.elementrepository.doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.DoctorBasePage;

public class AddMedicalHistoryPage extends DoctorBasePage {

	public AddMedicalHistoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy( name = "bp")
	private WebElement bloodPressureTextfield;
	
	@FindBy( name = "bs")
	private WebElement bloodSugarTextfield;
	
	@FindBy( name = "weight")
	private WebElement weightTextfield;
	
	@FindBy( name = "temp")
	private WebElement bodyTeperatureTextfield;
	
	@FindBy( name = "pres")
	private WebElement prescriptionTextfield;
	
	@FindBy( name = "submit")
	private WebElement submitButton;
	
	@FindBy( xpath = "//button [ @class = 'btn btn-secondary']")
	private WebElement closeButton;

	public WebElement getBloodPressureTextfield() {
		return bloodPressureTextfield;
	}

	public WebElement getBloodSugarTextfield() {
		return bloodSugarTextfield;
	}

	public WebElement getWeightTextfield() {
		return weightTextfield;
	}

	public WebElement getBodyTeperatureTextfield() {
		return bodyTeperatureTextfield;
	}

	public WebElement getPrescriptionTextfield() {
		return prescriptionTextfield;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

}
