package com.hms.elementrepository.doctor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hms.base.DoctorBasePage;

public class SearchPage extends DoctorBasePage {

	private WebDriver driver ;
	public SearchPage(WebDriver driver) {
		super(driver);
		this.driver = driver ;
	}

	@FindBy( id = "searchdata")
	private WebElement searchTextfield;
	
	@FindBy( id = "submit")
	private WebElement searchButton;

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

	public WebElement getSearchButton() {
		return searchButton;
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
