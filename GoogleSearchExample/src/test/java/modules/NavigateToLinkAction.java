package modules;


import org.openqa.selenium.WebDriver;

import pageobjects.SearchResultsPage;

public class NavigateToLinkAction {

	public static void NavigateToLink(WebDriver driver) throws Exception{		
		
		
		 String third_link = SearchResultsPage.alllinks.get(2).getAttribute("href");
		 System.out.println("The third link is:     "+ third_link);
		    driver.navigate().to(third_link);
		

		
	}
}
