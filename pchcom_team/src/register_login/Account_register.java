package register_login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import _common_files.Pchcom_common;

public class Account_register extends Pchcom_common{

	public String emailAddress;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void createAccount() {
		openRegisterPage();
		userdetails();
		addressdetails();
		emaildetails(this.emailAddress);
		submit_validate();
	}
	
	public void openRegisterPage() {
		mouseClick(By.partialLinkText("Register"));
	}
	
	public void userdetails() {
		
		dropdownSelect(By.id("TI"), "Mr.");
		sendKeys(By.id("FN"), "Zakir");
		sendKeys(By.id("LN"), "Sayed");
		sendKeys(By.id("A1"), "43-32 Kissena bl");
	}
	
	public void addressdetails() {
		sendKeys(By.id("ZI"), "11355" + Keys.TAB);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* Validate the city and state are populated properly */
		sendKeys(By.id("A2"), "16s");
		sendKeys(By.id("CI"), "Flushing");
		dropdownSelect(By.id("ST"), "New York");
		
	}
	
	public void emaildetails(String email) {
		sendKeys(By.id("EM"), email);
		sendKeys(By.id("CE"), email);
	}
	
	public void submit_validate() {
		mouseClick(By.id("sub-btn"));
		
	}

	
	public void path_nav() {
		mouseClick(By.id("sub-btn"));
		/* Midpage */
		mouseClick(By.id("submitButton"));
		
		/* Bulls eye click */
		mouseClick(By.id("bullseye_target_0"));
		
		/* Wait for the continue button to show */
		mouseClick(By.id("mpNavNext"));
		
		mouseClick(By.id("mpNavNext"));

		mouseClick(By.id("mpNavNext"));

		mouseClick(By.id("mpNavNext"));

		mouseClick(By.id("submitButton"));
		
		/* Click1 sweep.  */
		mouseClick(By.id("PD_SkipButton"));
		mouseClick(By.id("PD_SkipButton"));
		mouseClick(By.id("PD_SkipButton"));
		mouseClick(By.id("PD_SkipButton"));
		mouseClick(By.id("PD_SkipButton"));
		mouseClick(By.id("PD_SkipButton"));
		mouseClick(By.id("PD_SkipButton"));

		/* Wait for interstitial video and portal page by what's new LB */
		mouseClick(By.className("closeBtn close"));
		
		
}
	
}
