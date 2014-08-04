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
		
		try
		{
		
			JavascriptExecutor jse = (JavascriptExecutor) browser;
	//		jse.executeScript("document.getElementsByClassName('desktopmode')[0].setAttribute('type', 'zakirtext');");
			
			
			WebElement elm = browser.findElement(By.cssSelector("#mobileformatnotice span"));

//			WebElement elm = browser.findElement(By.cssSelector("#search div"));
			String hiddenvalue = (String) ((JavascriptExecutor) browser).executeScript("return arguments[0].innerHTML;", elm);

			System.out.println(hiddenvalue);
//			System.out.println(elm.getAttribute("value"));
		
		}
		catch(Exception ex) {
			System.out.println("EXCEPTION OCCURRED: " + ex.getMessage());
		}
		
		finally {
			browser.close();
		}
			
	}

}
