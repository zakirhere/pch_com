package register_login;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import _common_files.*;

public class Account_login extends Pchcom_common {

	public static void launch_pchcom() {
		browser = new FirefoxDriver();
		browser.get("http://www.pch.com");
		WebElement e = browser.findElement(By.className("unrecognized"));
		if(e.isDisplayed()) {
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("Element is Absent");
		}
	    
	}
	
	public static void isElementPresent(WebElement e) {
		
	}
}
