package com.cbt;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/obeyd/Documents/selenium dependencies/drivers/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");

	}

}
