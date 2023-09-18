package seleniumbasics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingInSeleniumExample {
	public static void main (String []args) {
		
		
		//Browser Specific
		ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver1 = new FirefoxDriver();
		
		//WebDriver Specific (widely used)
		
		WebDriver driver3 = new ChromeDriver();
		
		// SearchContext top casting (But only 2 methods are there fe, fes)
		
		SearchContext sr = new ChromeDriver();
		
		
		//Remote WebDriver Specific
		
		RemoteWebDriver rd = new ChromeDriver();
		
		// SearchContext and WebDriver
		
		
		//SearchContext sr1 = new WebDriver();
		
		// SearchContext and RemoteWebDriver
		
		//SearchContext sr2 = new RemoteWebDriver();
		
		
		// WebDriver and RemoteWebDriver
		
		//WebDriver dr1 = new RemoteWebDriver();
		
		
	}

}
