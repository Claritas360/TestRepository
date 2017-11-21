package com.tcs.claritasautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class CommonFunctions extends ClaritasLogin{
	
	
	WebDriver driver;
	String url="https://claritas360dev.claritas.com";
	
	public void browserSelection(String Browser,String UserID, String Pwd){
		try{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		if(Browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		driver.get(url);
		driver.findElement(By.id("logonIdentifier")).sendKeys(UserID);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
	}
		catch(Exception e){
			
			System.out.println("Browser not started");
		}
		driver.close();
	}
	
	
}
