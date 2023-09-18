package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {

		String browser = "chrome";

		BrowserUtil broweserUtil = new BrowserUtil();

		WebDriver driver = broweserUtil.intiDriver(browser);

		broweserUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();

		String title = broweserUtil.getPageTitle();
		if (title.equalsIgnoreCase("Register Account")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		// Locators of element

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By agreeCheckBox = By.name("agree");
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");

		ElementUtils elementUtil = new ElementUtils(driver);

		elementUtil.doSendKeys(firstName, "Biswajit");
		elementUtil.doSendKeys(lastName, "Mahapatra");
		elementUtil.doSendKeys(email, "biswajit.ricky031@gmail.com");
		elementUtil.doSendKeys(telephone, "9438065665");
		elementUtil.doSendKeys(password, "@stoneCold316");
		elementUtil.doSendKeys(confirmPassword, "@stoneCold316");

		elementUtil.doClick(agreeCheckBox);

		elementUtil.doClick(continueBtn);

		By successMsg = By.xpath("//*[@id=\"content\"]/h1");

		String msg = elementUtil.getElementText(successMsg);
		System.out.println(msg);
		driver.close();

	}

}
