package steps;

import org.testng.Assert;

import coreUtilities.testbase.TestBase;
import io.cucumber.java.en.*;
import pages.FooterPage;

public class FooterStep extends TestBase{

	FooterPage fp = new FooterPage(driver);
	
	/**
	 * Step definition for clicking on the "Contact Us" link in the footer.
	 * This method delegates the action to FooterPage's clickOnContactUsLink().
	 */

	@When("Click on the Contact Us link in the footer")
	public void click_on_the_link_in_the_footer() {
		fp.clickOnContactUsLink();
	}
	
	/**
	 * Step definition to verify that the "Contact Us" page opens correctly.
	 * Asserts that the Contact Us heading is displayed on the page.
	 */

	@Then("The Contact Us page should open with relevant information")
	public void the_page_should_open_with_relevant_information() {
		Assert.assertTrue(fp.verifyContactUsHeading());
	}

} 
