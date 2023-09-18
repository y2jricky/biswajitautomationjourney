package seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("https://www.google.com");

		// Try without "https"--- Browser will not open it will give
		// InvalidArgumentException

		driver.get("www.google.com");
		
		driver.quit();
	}

}
