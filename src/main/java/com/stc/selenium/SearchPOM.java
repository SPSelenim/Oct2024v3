package com.stc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPOM {

	public WebDriver driver=null;
	public String F="fname";
	public String L="lname";
	public String QA="//a[@name='QA']";
		
	
	public SearchPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private WebElement getF()
	{
		WebElement ele=null;
		
		ele=driver.findElement(By.id(F));
	return ele;
	
	}
	
	private WebElement getL()
	{
		WebElement ele=null;
		
		ele=driver.findElement(By.id(L));
	return ele;
	
	}
	
	private WebElement getQ()
	{
		WebElement ele=null;
		
		ele=driver.findElement(By.xpath(QA));
	return ele;
	
	}
	
	public void SendF(String FF)
	{
		getF().sendKeys(FF);
	}
	
	public void SendL(String FF1)
	{
		try {
		
		getL().sendKeys(FF1);
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		}
	
	public void ClickQA()
	{
		try {
		getQ().click();
		System.out.println("Clicked===========");
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		}
	
	
}
