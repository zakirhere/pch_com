package register_login;

import org.openqa.selenium.By;

import _common_files.Pchcom_common;

public class Account_register extends Pchcom_common{

	public String emailAddress;
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void openRegisterPage() {
		
	}

	public void createAccount() {
		userdetails();
		addressdetails();
		emaildetails(this.emailAddress);
		submit_validate();
	}
	
	public void userdetails() {
		
		dropdownSelect(By.id("TI"), "Mr.");
		sendKeys(By.id("FN"), "Zakir");
		sendKeys(By.id("LN"), "Sayed");
		sendKeys(By.id("A1"), "43-32 Kissena bl, Apt 16s");
	}
	
	public void addressdetails() {
		sendKeys(By.id("ZI"), "11355");
		/* Validate the city and state are populated properly */
	}
	
	public void emaildetails(String email) {
		sendKeys(By.id("EM"), email);
		sendKeys(By.id("CE"), email);
	}
	
	public void submit_validate() {
		mouseClick(By.id("sub-btn"));
	}
	
}
