package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	// Create a webdriver refernece, use Private so no one can access

	private WebDriver driver = null;

	/**
	 * This method is used to initialize the browser based on the browser name
	 * 
	 * @param browserName
	 * @return This returns the driver
	 */
	public WebDriver intiDriver(String browserName) {
		System.out.println("My browser name is: " + browserName);

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("hey...please pass correct browser");
			break;
		}
		return driver;

	}

	public void launchURL(String url) {
		// perform null check, if url is null it will show error
		if (url == null) {
			System.out.println("url can not be null");

		}
		// check https should be present in URL
		if (url.indexOf("https") == 0) {
			driver.get(url);
		}

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("My page title is " + title);
		return title;

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("My page title is " + url);
		return url;

	}

	public void closeBrowser() {
		if (driver != null)
			driver.close();
	}

	public void quitBrower() {
		if (driver != null)
			driver.quit();
	}

}
