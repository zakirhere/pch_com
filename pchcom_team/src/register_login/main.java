package register_login;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import sweepstakes.Sanity_sweepstakes;
import _common_files.Pchcom_common;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	@BeforeClass
	public static void init() {
		Account_login user1 = new Account_login();
		user1.launch_pchcom();
	}
	
	
	@Test
	public void runTest1() {
		Account_register user = new Account_register();
		user.setEmailAddress("zakirsayed1@pch.com");
		user.createAccount();
	}
	
	@Test
	public void runTest2() {
		
	}
	
	@AfterClass
	public static void tearDown() {
		Pchcom_common.closeBrowser();
	}

}
