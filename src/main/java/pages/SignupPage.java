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

	public void hoverOnProfileButton() {
		// write your logic here
	}

	public void clickOnSignupButton() {
		// write your logic here
	}

	public void doSignup(String password) throws InterruptedException {
		// write your logic here
	}

	public static String generateRandomUsername() {
		// Generate a random unique ID
		String randomId = UUID.randomUUID().toString().substring(0, 8); // Take the first 8 characters
		return "user" + randomId + "@mailinator.com";
	}

	public boolean isuserLoggedIn() {
		boolean isMyAccountVisible = false;
		// write your logic here
		return isMyAccountVisible;
	}

	public void clickLogoutButton() {
		// write your logic here
	}

	public boolean isUserLoggedOut() {
		// write your logic here
			return false;
	}

}
