package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowerCodeUsingSwitchcase {
	public static void main (String []args) {
		WebDriver driver = null;
		String browserName = "edge";
		
		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the correct browser");
			break;
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
