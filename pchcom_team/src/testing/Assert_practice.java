package testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Assert_practice {
	public static String name = "Zakir";
	public static boolean flag = true;
	
	public static void main(String[] args) {
		System.out.println("main testing..");
		Assert.assertNotEquals(name, "Zakir");

	}
	
	@Test
	public void cmpString() {
		System.out.println("Unit testing..");
//		assertEquals(name, "Zakir");
		assertTrue(name, false);
	}

}
