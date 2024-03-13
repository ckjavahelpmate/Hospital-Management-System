package com.hms.elementrepository.doctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.DoctorBasePage;

public class ManagePatientPage extends DoctorBasePage {
	private WebDriver driver ;
	public ManagePatientPage(WebDriver driver) {
		super(driver);
		this.driver = driver ;
	}
	
	@FindBy( xpath = "//button [ text() = 'Add Medical History']")
	private WebElement medicalHistoryButton;

	public WebElement getMedicalHistoryButton() {
		return medicalHistoryButton; 
	}
	
	public void editPatient(String patient) 
	{
		driver.findElement(By.xpath("//td [ @class = 'hidden-xs' and text() = '"+patient+"' ]/ following-sibling::td[5]/a[1]")).click();
	}
	public void viewPatient(String patient) 
	{
		driver.findElement(By.xpath("//td [ @class = 'hidden-xs' and text() = '"+patient+"' ]/ following-sibling::td[5]/a[2]")).click();
	}

}
