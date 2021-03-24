package stepDefination;
import java.util.Properties;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import pageObject.FirstPage;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.BasePage;

@RunWith(Cucumber.class)
public class stepDefinations extends BasePage {
	public WebDriver driver;
	public Properties prop;
	public LandingPage lp;
	public LoginPage l;
	public FirstPage fp;
	
	@Given("^User launch chrome browser$")
    public void user_launch_chrome_browser() throws Throwable {
		driver =initializeDriver();
    }

    @When("^User opens URL \"([^\"]*)\"$")
    public void user_opens_url_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
    }
    
    @And("^Click on login button$")
    public void click_on_login_button() throws Throwable {
    	lp = new LandingPage(driver);
    	lp.getLogin().click();
    }

    @And("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void user_enters_email_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
    	l = new LoginPage(driver);
    	l.getUsername().sendKeys(strArg1);
    	l.getPassword().sendKeys(strArg2);
    }
    
    @And("^Click on signin button$")
    public void click_on_signin_button() throws Throwable {
    	l.getSignIn().click();
    }

    @Then("^Page url must be \"([^\"]*)\"$")
    public void page_url_must_be_something(String strArg1) throws Throwable {
    	String currentUrl=driver.getCurrentUrl();
    	Assert.assertEquals(strArg1, currentUrl);
    	System.out.println("Page url validated");
    }
 
    @When("^User click on dropdown button$")
    public void user_click_on_dropdown_button() throws Throwable {
    	fp = new FirstPage(driver);
    	fp.getDropDown().click();
    } 
 
    @Then("^User click on logout button$")
    public void user_click_on_logout_button() throws Throwable {
    	fp.getLogout().click();
    }
 
    @And("^Page url should be \"([^\"]*)\"$")
    public void page_url_should_be_something(String strArg1) throws Throwable {
    	String currentUrl2=driver.getCurrentUrl();
    	Assert.assertEquals(strArg1, currentUrl2);
    	System.out.println("Page url validated");
    }
}
