package steps;

import org.testng.Assert;

import coreUtilities.testbase.TestBase;
import io.cucumber.java.en.*;
import pages.HomePage;

/**
 * Step definition class for Home Page related actions in Urban Ladder tests.
 * Extends TestBase to leverage setup and driver initialization.
 */
public class HomePageStep extends TestBase{

	HomePage hp = new HomePage(driver);

	/**
	 * Step definition for navigating to the homepage of Urban Ladder.
	 * Verifies the homepage is correctly loaded by checking the presence of the logo.
	 */
	@Given("I am on the homepage of Urban Ladder.")
	public void i_am_on_the_homepage_of_urban_ladder() {
		Assert.assertEquals(hp.verifyHomePageLogo(), true);
	}

	
	/**
	 * Step definition to validate the homepage title.
	 * Ensures that the actual page title contains the expected title string.
	 * 
	 * @param expectedPageTitle The expected substring to be present in the homepage title.
	 */
	@Then("The page title should contain {string}.")
	public void the_page_title_should_contain(String expectedPageTitle) {
		Assert.assertEquals(hp.getTitleOfHomePage().contains(expectedPageTitle), true);
	}

}
