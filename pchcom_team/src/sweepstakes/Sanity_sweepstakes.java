package sweepstakes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import _common_files.Pchcom_common;
import static org.junit.Assert.*;

public class Sanity_sweepstakes extends Pchcom_common{

	public void nav_sweepstakes() {
		mouseClick(By.cssSelector("a[href='/sweepstakes']"));
		assertTrue(IsElementPresent(By.cssSelector("img[src*='banner-sweep.png']")));
	}
	
	public void getAllActiveSweepstakes() {
		List<WebElement> itemsHolder = browser.findElements(By.xpath("//div[@class='itemsholder']/div"));
		
		for (WebElement item : itemsHolder) {
			WebElement sweep =  item.findElement(By.cssSelector(".imgholder img"));
			System.out.println(sweep.getAttribute("alt"));

			WebElement gwy =  browser.findElement(By.cssSelector(".qgwy"));
			String hiddenvalue = (String) ((JavascriptExecutor) browser).executeScript("return arguments[0].innerHTML;", gwy);
			System.out.println(hiddenvalue);

			
		}
	
	}
}
