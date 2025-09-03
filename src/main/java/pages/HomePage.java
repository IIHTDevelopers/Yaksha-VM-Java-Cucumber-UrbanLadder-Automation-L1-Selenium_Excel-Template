package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends StartupPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By homePageLogo = By.className("header__topBar_logo");

	/**
	 * Objective : Given "I am on the homepage of Urban Ladder."
	 *
	 * Step1 : Locate the homepage logo element on the page.
	 * Step2 : Check whether the logo is displayed.
	 * Step3 : Handle exceptions gracefully to avoid test failure if the element is missing.
	 * Step4 : Return true if the logo is displayed, otherwise return false.
	 *
	 * Verifies if the homepage logo is displayed.
	 * Uses exception handling to prevent test failure if the element is not found.
	 *
	 * @return true if the homepage logo is displayed, false otherwise.
	 */
	public boolean verifyHomePageLogo() {	
		//write your logic here
		
		return false;
	}

	/**
	 * Objective : Then "The page title should contain {string}."
	 *
	 * Step1 : Attempt to retrieve the current title of the homepage from the WebDriver.
	 * Step2 : Print the retrieved title in the console for debugging purposes.
	 * Step3 : Handle exceptions gracefully if the title cannot be captured.
	 * Step4 : Return the title as a String.
	 *
	 * Retrieves the title of the homepage.
	 * Uses exception handling to avoid failure in case the title cannot be fetched.
	 *
	 * @return The title of the homepage as a String.
	 */
	public String getTitleOfHomePage() {
		String title = "";
		//write your logic here
		return title;
	}

}
