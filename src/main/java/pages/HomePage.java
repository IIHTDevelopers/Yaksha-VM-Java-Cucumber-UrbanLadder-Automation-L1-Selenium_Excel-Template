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
