package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/obeyd/Documents/selenium dependencies/drivers/ChromeDriver.exe");//( actual address of driver)
		WebDriver driver=new ChromeDriver(); // open the browser
		driver.get("https://www.amazon.com"); //goes to a website
		String expected="Google"; 
		String actual=driver.getTitle(); //gets the title of the tab
		
		if(expected.equals(actual)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		System.out.println("Expected:\t"+expected);
		System.out.println("Actual:\t"+actual);
		}
		
		
	}
}
