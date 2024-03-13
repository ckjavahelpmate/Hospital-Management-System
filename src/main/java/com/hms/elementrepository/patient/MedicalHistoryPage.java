package com.hms.elementrepository.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.PatientBasePage;

public class MedicalHistoryPage extends PatientBasePage {

	public MedicalHistoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy( xpath = "// i [ @class='fa fa-eye']")
	private WebElement viewIcon;

	public WebElement getViewIcon() {
		return viewIcon;
	}

}
