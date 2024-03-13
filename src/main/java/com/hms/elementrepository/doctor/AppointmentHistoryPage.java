package com.hms.elementrepository.doctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hms.base.DoctorBasePage;

public class AppointmentHistoryPage extends DoctorBasePage {

	private WebDriver driver ;
	public AppointmentHistoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver ;
	}

	public void cancleAppointment(String patient) 
	{
		driver.findElement(By.xpath("//td [ @class = 'hidden-xs' and text() = '"+patient+"']/following-sibling::td[6]/div/a")).click();
		driver.switchTo().alert().accept();
	}

}
