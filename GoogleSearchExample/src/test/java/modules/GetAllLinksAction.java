package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.SearchResultsPage;

public class GetAllLinksAction {

	public static void GetAllLinksText(WebDriver driver) throws Exception{	
		
	
		
		for(WebElement link : SearchResultsPage.alllinks) {
			//print the links i.e. http://example.com or https://www.example.com
			System.out.println(link.getAttribute("href"));
		
		}
	}
	
}
