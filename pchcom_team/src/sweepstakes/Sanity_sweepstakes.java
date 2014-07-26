package sweepstakes;

import org.openqa.selenium.By;

import _common_files.Pchcom_common;
import static org.junit.Assert.*;

public class Sanity_sweepstakes extends Pchcom_common{

	public void nav_sweepstakes() {
		mouseClick(By.cssSelector("a[href='/sweepstakes']"));
		assertTrue(IsElementPresent(By.cssSelector("img[src*='banner-sweep.png']")));
	}
	
}
