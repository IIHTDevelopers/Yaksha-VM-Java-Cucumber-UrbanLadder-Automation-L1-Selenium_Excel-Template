package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage extends StartupPage {
	
	public FooterPage(WebDriver driver) {
		super(driver);
	}

	private By contactUsButton = By.xpath("");
	private By contactUsHeading = By.xpath("");

	public void clickOnContactUsLink() {
		driver.findElement(contactUsButton).click();
	}

	public boolean verifyContactUsHeading() {
		// write your logic here
		return false;
	}

}
