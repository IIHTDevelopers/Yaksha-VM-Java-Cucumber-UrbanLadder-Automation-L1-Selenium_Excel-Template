package steps;

import org.testng.Assert;

import coreUtilities.testbase.TestBase;
import io.cucumber.java.en.*;
import pages.SignupPage;

/**
 * Step definition class for Signup-related Cucumber scenarios.
 * Extends TestBase to use the initialized WebDriver and other test utilities.
 * Provides the glue between feature file steps and SignupPage POM actions.
 */
public class SignUpStep extends TestBase {

	SignupPage signup = new SignupPage(driver);

	/**
	 * Step: Hovers over the profile icon to reveal the user options menu.
	 */
	@When("Hover on the profile icon")
	public void i_click_on_the_profile_icon() {
		signup.hoverOnProfileButton();
	}

	/**
	 * Step: Clicks on the "Sign Up" button to open the signup form.
	 */
	@When("Click on the Sign Up button")
	public void i_click_on_the_button() {
		signup.clickOnSignupButton();
	}

	/**
	 * Step: Completes the signup process by entering a generated email and the given password,
	 * then submits the signup form.
	 *
	 * @param password The password to be used for signup.
	 */
	@When("Complete the signup process with email and password {string}")
	public void complete_the_signup_process(String password) {
		try {
			signup.doSignup(password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Step: Verifies that the "My Account" section/profile icon is visible,
	 * confirming successful signup and login.
	 */
	@Then("Verify My Account is visible")
	public void verify_my_account_is_visible() {
		Assert.assertTrue(signup.isuserLoggedIn());
	}

	/**
	 * Step: Clicks on the logout button to sign the user out of the application.
	 */
	@When("Click on logout button")
	public void click_on_logout_button() {
		signup.clickLogoutButton();
	}

	/**
	 * Step: Verifies that the login (Sign Up) button is visible again after logout,
	 * confirming that the user has been logged out successfully.
	 */
	@Then("Verify Login button is visible")
	public void verify_login_button_is_visible() {
		Assert.assertTrue(signup.isUserLoggedOut());
	}

}
