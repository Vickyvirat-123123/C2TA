package com.reusable;

import org.openqa.selenium.WebElement;

import com.baseclass.basescenario;

public class reusablescenario extends basescenario {
	
	public void entervalue(WebElement ele, String string) {
		ele.sendKeys();

	}
	public void doclick(WebElement ele) {
		ele.click();

	}

}
