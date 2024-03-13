package com.hms.elementrepository.patient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hms.base.PatientBasePage;

public class AppointmentHistorypage extends PatientBasePage {

	private WebDriver driver ;
	public AppointmentHistorypage(WebDriver driver) {
		super(driver);
		this.driver = driver ;
	}

	public void cancleAppointment(String patient) 
	{
		driver.findElement(By.xpath("//td [ @class = 'hidden-xs' and text() = '"+patient+"']/following-sibling::td[6]/div/a")).click();
		driver.switchTo().alert().accept();
	}
	
	
}
