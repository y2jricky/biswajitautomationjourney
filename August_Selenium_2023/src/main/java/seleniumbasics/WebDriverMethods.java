package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/");

		// maximize browser window

		driver.manage().window().maximize();

		// Delete all cookies

		driver.manage().deleteAllCookies();

		// fetch the url of the page

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// fetch the page source of the page

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();

	}
}
