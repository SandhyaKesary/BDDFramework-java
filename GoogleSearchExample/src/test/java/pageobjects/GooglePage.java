package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GooglePage extends BaseClass {
	
	public GooglePage(WebDriver driver){
		super(driver);
	} 
	
	@FindBy(how=How.NAME, using="q")
	public static WebElement searchInput;
	
	@FindBy(how=How.XPATH, using=".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input")
	public static WebElement searchButton;

}
