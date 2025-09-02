package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage extends StartupPage {
	
	public FooterPage(WebDriver driver) {
		super(driver);
	}

	private By contactUsButton = By.xpath("");
	private By contactUsHeading = By.xpath("");

	/**
	 * Clicks on the "Contact Us" link in the footer section of the website.
	 */
	public void clickOnContactUsLink() {
		// write your logic here
		
	}
	
	/**
	 * Verifies whether the Contact Us heading is displayed on the page.
	 * @return true if the heading is displayed, false otherwise
	 */
	public boolean verifyContactUsHeading() {
		// write your logic here
		return false;
	}

}
