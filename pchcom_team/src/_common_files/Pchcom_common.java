package _common_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pchcom_common {
	protected static WebDriver browser;
	
	public static void mouseClick(By myBy) {
		browser.findElement(myBy).click();
	}
	
	public static void sendKeys(By myBy, String value) {
		browser.findElement(myBy).clear();
		browser.findElement(myBy).sendKeys(value);
	}
	
	public static boolean IsTextPresent(By myBy, String textToBeVerified)
	{
		try {
			if (browser.findElement(myBy).getText().equals(textToBeVerified))
			{
				return true;
			}
		} 
		catch (Exception e) {
			return false;
		}
		return false;
	}
	
	
	public static boolean IsElementPresent(By myBy)
	{
		try {
			if (browser.findElement(myBy) != null)
			{
				if(browser.findElement(myBy).isDisplayed())
					return true;
			}
		} 
		catch (Exception e) {
			return false;
		}
		return false;
	}
	
	public static void closeBrowser() {
		System.out.println("Closing the driver: " + browser.getCurrentUrl());
		browser.close();
	}
}
