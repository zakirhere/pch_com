package register_login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sweepstakes.Sanity_sweepstakes;
import _common_files.Pchcom_common;

public class main {

	@BeforeClass
	public static void init() {
		Pchcom_common.launch_pchcom();
	}
	
	
	@Test
	public void runTest1() {
		Account_register user = new Account_register();
		user.setEmailAddress("zakirs2@pch.com");
		user.createAccount();
	}
	
	@Test
	public void runTest2() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		//Pchcom_common.closeBrowser();
	}

}
