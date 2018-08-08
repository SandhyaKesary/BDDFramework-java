package step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.GetAllLinksAction;
import modules.NavigateToLinkAction;
import modules.SearchAction;
import pageobjects.GooglePage;
import pageobjects.SearchResultsPage;

public class KeywordSearchSteps {
	
	 public WebDriver driver;
	    
	 public KeywordSearchSteps()
	    {
	    	driver = Hooks.driver;
	    }
	 
	@Given("^I am on Google page$")
	public void i_am_on_Google_page() throws Throwable {
	
        driver.get("https://www.google.com/");
        assertEquals("https://www.google.com/",driver.getCurrentUrl());
	}
	
	@Given("^I search for \"(.*?)\"$")
	public void i_search_for(String keyword) throws Throwable {
		
		PageFactory.initElements(driver, GooglePage.class);
		SearchAction.Execute(driver, keyword);
		
	}

	@When("^I navigate to third link$")
	public void i_navigate_to_third_link() throws Throwable {
	   PageFactory.initElements(driver, SearchResultsPage.class);
	   GetAllLinksAction.GetAllLinksText(driver);
	}

	@Then("^I should be redirected to that page successfully$")
	public void i_should_be_redirected_to_that_page_successfully() throws Throwable {
		PageFactory.initElements(driver, SearchResultsPage.class);
		  NavigateToLinkAction.NavigateToLink(driver);
		  System.out.println("Navigated Successfully");
	}

	


}
