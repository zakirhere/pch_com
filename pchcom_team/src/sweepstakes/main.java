package sweepstakes;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import _common_files.Pchcom_common;
import register_login.Account_login;

public class main {
	
	@BeforeClass
	public static void init() {
		Pchcom_common.launch_pchcom();
		Account_login user1 = new Account_login();
		user1.enter_login_details();
		user1.submit_login();
	}
	
	
	@Test
	public void runTest1() {
		Sanity_sweepstakes user1 = new Sanity_sweepstakes();
		user1.nav_sweepstakes();
		user1.getAllActiveSweepstakes();
	}
	
	@Test
	public void runTest2() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		Pchcom_common.closeBrowser();
	}
	
}
