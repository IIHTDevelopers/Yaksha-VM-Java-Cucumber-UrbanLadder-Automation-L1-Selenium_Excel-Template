package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends StartupPage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By homePageLogo = By.className("header__topBar_logo");

	public boolean verifyHomePageLogo() {	
		//write your logic here
		
		return false;
	}

	public String getTitleOfHomePage() {
		String title = "";
		//write your logic here
		return title;
	}

}
