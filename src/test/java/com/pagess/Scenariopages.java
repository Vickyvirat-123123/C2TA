package com.pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.basescenario;

public class Scenariopages extends basescenario {
	public Scenariopages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement name;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement pass;
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement login;

	public WebElement username() {

		return name;

	}

	public WebElement password() {

		return pass;

	}
	public WebElement login() {

		return login;

	}
}
