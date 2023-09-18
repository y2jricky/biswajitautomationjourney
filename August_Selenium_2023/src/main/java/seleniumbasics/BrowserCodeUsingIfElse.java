package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCodeUsingIfElse {
	/*
	 * static WebDriver driver=null; static String browserName = "chrome";
	 */

	public static void main(String[] args) {

		WebDriver driver = null;
		String browserName = "chrome";

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Please enter the correct browser name");
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		System.out.println("My page title is :" + actualTitle);
		
		if (actualTitle.equals("Your Store")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		driver.close();
	}

}
