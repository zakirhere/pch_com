package register_login;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import _common_files.*;

public class Account_login extends Pchcom_common {

	private String username = "zakir@pch.com";
	private String password = "zakzak";
	
	public void launch_pchcom1() {
		browser = new FirefoxDriver();
		browser.get("http://www.pch.com");
		assertTrue(IsElementPresent(By.className("unrecognized")));
	    assertTrue(IsTextPresent(By.xpath("//a[@class='sign-in link-button']"), "Sign In"));
	}
	
	public void enter_login_details() {
		browser.findElement(By.xpath("//a[@class='sign-in link-button']")).click();
		assertTrue(IsElementPresent(By.xpath("//label[@for='email']")));
		browser.findElement(By.xpath("//label[@for='email']/../input")).sendKeys(this.username);
		sendKeys(By.xpath("//label[@for='password']/../input"), this.password);
		
	}
	
	public void submit_login() {
		mouseClick(By.xpath("//button[@value='Sign In']"));
		assertTrue(IsElementPresent(By.cssSelector(".token-amount")));
		
	}
	
}
