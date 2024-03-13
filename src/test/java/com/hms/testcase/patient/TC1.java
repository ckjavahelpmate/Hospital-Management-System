package com.hms.testcase.patient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hms.elementrepository.doctor.DoctorLoginPage;
import com.hms.elementrepository.patient.BookAppointmentPage;
import com.hms.elementrepository.patient.PatientDashboardPage;
import com.hms.elementrepository.patient.PatientLoginPage;

public class TC1 
{
	@Test
	public void patientLogin() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elftestingserver/domain/Hospital_Management_System");
		
		PatientLoginPage loginPage = new PatientLoginPage(driver);
		
		DoctorLoginPage doctorLoginPage = new DoctorLoginPage(driver);
		
		loginPage.patientLogin("Dinga@gmail.com", "Dinga@123") ;
		
//		doctorLoginPage.doctorLogin("test9@gmail.com", "Test@123");
		
		PatientDashboardPage dashboardPage = new PatientDashboardPage(driver);
		
		dashboardPage.getBookAnAppointment().click();
		
		BookAppointmentPage bookAppointmentPage = new BookAppointmentPage(driver);
		bookAppointmentPage.selectDoctorSpecializationByValue("Orthopedist");
		bookAppointmentPage.selectDoctorByVisibleText("Peter");
		bookAppointmentPage.selectDoctorFeesByValue("500");
		bookAppointmentPage.selectDate(06, 05, 2024);
		bookAppointmentPage.selectTimeSlot(3, 15, "pm");
		
		
	}
}
