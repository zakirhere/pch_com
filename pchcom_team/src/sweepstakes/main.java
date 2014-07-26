package sweepstakes;

import org.junit.After;
import org.junit.Test;

import register_login.Account_login;
import _common_files.Pchcom_common;

public class main {
	@Test
	public void runTest1() {
		Account_login user1 = new Account_login();
		user1.launch_pchcom();
		user1.enter_login_details();
		user1.submit_login();
	}
	
	@Test
	public void runTest2() {
		Sanity_sweepstakes user1 = new Sanity_sweepstakes();
		user1.nav_sweepstakes();
	}
	
	@After
	public void tearDown() {
		Pchcom_common.closeBrowser();
	}
	
}
