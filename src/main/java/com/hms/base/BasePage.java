package com.hms.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	@FindBy(xpath = "//i[ @class = 'ti-align-justify']")
	private WebElement menuHamburger;

	@FindBy(xpath = "//span[ text() = ' Dashboard ']")
	private WebElement dashBoardButton;

	@FindBy(xpath = "//span[ @class = 'username']")
	private WebElement profileIcon;

	@FindBy(xpath = "//a[ contains( text() , 'My Profile') ]")
	private WebElement myProfileButton;

	@FindBy(xpath = "//a[ contains( text() , 'Change Password') ]")
	private WebElement changePasswordButton;

	@FindBy(xpath = "//a[ contains( text() , 'Log Out') ]")
	private WebElement logoutButton;

	@FindBy(xpath = "//i[ @class = 'fa fa-spin fa-gear' ]")
	private WebElement settingIcon;

	@FindBy(xpath = "//input [ @ id = 'fixed-header' ] /following-sibling::span")
	private WebElement fixedHeaderToggleSwitch;

	@FindBy(xpath = "//input [ @ id = 'fixed-sidebar' ] /following-sibling::span")
	private WebElement fixedSidebarToggleSwitch;

	@FindBy(xpath = "//input [ @ id = 'closed-sidebar' ] /following-sibling::span")
	private WebElement clsedSidebarToggleSwitch;

	@FindBy(xpath = "//input [ @ id = 'fixed-footer' ] /following-sibling::span")
	private WebElement fixedFooterToggleSwitch;

	private WebElement backgroundRadioButton;

//	Initializing WebElements
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	Providing public Accesses or Getter methods to WebElements	

	public WebElement getMenuHamburger() {
		return menuHamburger;
	}

	public WebElement getDashBoardButton() {
		return dashBoardButton;
	}

	public WebElement getProfileIcon() {
		return profileIcon;
	}

	public WebElement getMyProfileButton() {
		return myProfileButton;
	}

	public WebElement getChangePasswordButton() {
		return changePasswordButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSettingIcon() {
		return settingIcon;
	}

	public WebElement getFixedHeaderToggleSwitch() {
		return fixedHeaderToggleSwitch;
	}

	public WebElement getFixedSidebarToggleSwitch() {
		return fixedSidebarToggleSwitch;
	}

	public WebElement getClsedSidebarToggleSwitch() {
		return clsedSidebarToggleSwitch;
	}

	public WebElement getFixedFooterToggleSwitch() {
		return fixedFooterToggleSwitch;
	}

	public WebElement getBackgroundRadioButton() {
		return backgroundRadioButton;
	}

}
