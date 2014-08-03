package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Object_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browser = new FirefoxDriver();
		browser.get("http://newyork.craigslist.org/");
		
		JavascriptExecutor jse = (JavascriptExecutor) browser;
		jse.executeScript("document.getElementsByClassName('desktopmode')[0].setAttribute('type', 'zakirtext');");
		
		WebElement elm = browser.findElement(By.cssSelector(".desktopmode"));
		System.out.println(elm.getText()	);
		
		browser.close();
	}

}
