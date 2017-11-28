package samplepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IrctcLoginTest {
	WebDriver driver;
	
	@Test
	public void Login(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver_Win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://irctc.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}

}
