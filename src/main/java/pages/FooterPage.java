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
	 * Objective : "Click on the Contact Us link in the footer"
	 *
	 * Step1 : Locate the "Contact Us" link element in the footer section.
	 * Step2 : Click on the "Contact Us" link.
	 *
	 * Clicks on the "Contact Us" link in the footer section of the website.
	 */
	
	public void clickOnContactUsLink() {
		// write your logic here
		
	}
	
	/**
	 * Objective : Then "The Contact Us page should open with relevant information"
	 *
	 * Step1 : Locate the Contact Us heading element on the page.
	 * Step2 : Check if the heading is displayed.
	 * Step3 : Return true if displayed, otherwise return false.
	 *
	 * Verifies whether the Contact Us heading is displayed on the page.
	 *
	 * @return true if the heading is displayed, false otherwise
	 */
	public boolean verifyContactUsHeading() {
		// write your logic here
		return false;
	}

}
