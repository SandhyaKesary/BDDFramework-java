package modules;

import org.openqa.selenium.WebDriver;
import helpers.Log;
import pageobjects.GooglePage;

public class SearchAction {

public static void Execute(WebDriver driver, String value) throws Exception{
		
	   Log.info("Element to search");
	   GooglePage.searchInput.sendKeys(value);	
	   Log.info("Sign out is performed");
	   GooglePage.searchButton.click();
	   Log.info("Search action completed");

	}
}
