package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SearchPage extends StartupPage {
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	private By searchBar = By.cssSelector(" ");
	private By searchButton = By.cssSelector(" ");
	private By searchedProductTitle = By.xpath(" ");
	private By wishIcon = By.xpath(" ");
	private By wishlistCount = By.cssSelector(" ");
	private By viewProductButton = By.xpath(" ");
	private By productTitle = By.xpath(" ");
	private By priceFilter = By.xpath(" ");
	private By priceRange = By.xpath(" ");
	private By productPrice = By.cssSelector(" ");
	private By inStockOnlyCheckBox = By.cssSelector(" ");
	private By headerWishlistIcon = By.cssSelector("  ");
	private By wishlistPageProductName = By.cssSelector(" ");
	private By addToCompareButton = By.xpath(" ");
	private By widgetProduct = By.xpath(" ");

	public void searchForProduct(String productName) {
		driver.findElement(searchBar).sendKeys(productName);
		driver.findElement(searchButton).click();
	}

	public boolean verifySearchedProduct(String expectedProductName) {
		// Write your logic here
			return false;	
	}

	int beforeParsedItemWishlistedText;
	String getWishlistProductText;

	public void addItemToWishlist() {
		// Write your logic here
	}

	public boolean verifyProductAddedToWishlist() {
		// Write your logic here
			return false;
	}

	String actualProductName = "";

	public void clickOnViewProduct() {
		// Write your logic here
	}

	public boolean verifyProductDetailsOnProductInfoPage() {
		// Write your logic here
			return false;
	}

	public void applyPriceFilter() {
		// Write your logic here
	}

	public boolean verifyProductPriceLiesInRange() throws InterruptedException {
		// Write your logic here
		return false;
	}

	public boolean verifyWishlistedProductDetails() {
		// Write your logic here
			return false;
	}

	public void clickOnAddToCompareButton() {
		// Write your logic here
	}

	public boolean verifyProductIsPresentInCompareList() {
		// Write your logic here
			return false;
	}

}
