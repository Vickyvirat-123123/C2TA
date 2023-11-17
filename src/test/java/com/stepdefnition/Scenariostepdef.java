package com.stepdefnition;

import java.io.IOException;

import com.baseclass.basescenario;
import com.pagess.Scenariopages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Scenariostepdef extends basescenario {
	public Scenariopages sp;
	@Given("To launch the Orange HRM application URL")
	public void to_launch_the_Orange_HRM_application_URL() throws InterruptedException, IOException {
		browserlaunch();
		sp=new Scenariopages(driver);
		
	}

	@When("To enter the value in username {string}")
	public void to_enter_the_value_in_username(String string) throws InterruptedException {
		Thread.sleep(2000);
	   sp.username().sendKeys(string);
	}

	@When("To enter the value in password {string}")
	public void to_enter_the_value_in_password(String string) throws InterruptedException {
		Thread.sleep(2000);
	   sp.password().sendKeys(string);
	}

	@When("To click the login button")
	public void to_click_the_login_button() throws InterruptedException {
		sp.login().click();
		Thread.sleep(5000);
		driver.close();
	}

}
