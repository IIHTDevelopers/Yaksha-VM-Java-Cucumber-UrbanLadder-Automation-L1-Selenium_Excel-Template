package pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SignupPage extends StartupPage {
	
	public SignupPage(WebDriver driver) {
		super(driver);
	}

	private By profileIcon = By.xpath(" ");
	private By signUpicon = By.cssSelector(" ");
	private By emailAddress = By.cssSelector(" ");
	private By userPassword = By.xpath(" ");
	private By signUpButton = By.cssSelector(" ");
	private By headerProfileIcon = By.cssSelector(" ");
	private By logoutButton = By.cssSelector(" ");

	
	/**
	 * Hovers over the profile button and clicks it to open the profile menu dropdown.
	 */
	public void hoverOnProfileButton() {
		// write your logic here
	}

	/**
	 * Clicks on the signup button/link in the header menu to open the signup form.
	 */
	public void clickOnSignupButton() {
		// write your logic here
	}
	
	/**
	 * Performs the signup operation by generating a random email address,
	 * entering it along with the provided password, and submitting the form.
	 *
	 * @param password The password to be used for signup.
	 * @throws InterruptedException if the thread sleep is interrupted.
	 */

	public void doSignup(String password) throws InterruptedException {
		// write your logic here
	}

	/**
	 * Generates a random unique email address for signup using UUID.
	 *
	 * @return A random email string (e.g., userabcd1234@mailinator.com).
	 */
	
	public static String generateRandomUsername() {
		// Generate a random unique ID
		String randomId = UUID.randomUUID().toString().substring(0, 8); // Take the first 8 characters
		return "user" + randomId + "@mailinator.com";
	}

	/**
	 * Verifies if the user is logged in by checking if the profile icon is displayed
	 * after hovering over the profile menu.
	 *
	 * @return true if profile icon is displayed, false otherwise.
	 */
	public boolean isuserLoggedIn() {
		boolean isMyAccountVisible = false;
		// write your logic here
		return isMyAccountVisible;
	}

	/**
	 * Clicks on the logout button to log the user out of the application.
	 */
	public void clickLogoutButton() {
		// write your logic here
	}
	
	/**
	 * Verifies if the user is logged out by checking the presence of the signup link
	 * in the profile dropdown after clicking on the profile icon.
	 *
	 * @return true if signup link is displayed (user is logged out), false otherwise.
	 */
	public boolean isUserLoggedOut() {
		// write your logic here
			return false;
	}

}
