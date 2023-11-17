package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basescenario {
	public WebDriver driver;
	public Properties propert;
	public void browserlaunch() throws InterruptedException, IOException {
		
	
		
		File fi=new File("src/test/resources/Proerties/Scenario.properties");	
		FileInputStream car = new FileInputStream(fi);
		propert = new Properties();
		propert.load(car);
		propert.getProperty("Broswer").equalsIgnoreCase("chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(propert.getProperty("URL"));

		Thread.sleep(5000);
	}




	}
