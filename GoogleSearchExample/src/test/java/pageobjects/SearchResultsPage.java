package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultsPage extends BaseClass {
	
	public SearchResultsPage(WebDriver driver){
		super(driver);
	} 
	
	@FindBy(how=How.XPATH, using="//*[@id='rso']//h3/a")
	public static List<WebElement> alllinks;
	

}
