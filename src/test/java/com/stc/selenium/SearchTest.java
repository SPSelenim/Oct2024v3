package com.stc.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	public WebDriver driver = null;

	@BeforeClass
	public void tearUp() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	
	}

	@Test
	public void f() {
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		try {
SearchPOM ss=new SearchPOM(driver);
ss.SendF("xx");
ss.SendL("yy");
ss.ClickQA();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
