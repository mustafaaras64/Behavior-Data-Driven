package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By login = By.xpath("//a[@class='login-link']");
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}	
}
