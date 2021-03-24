package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
	public WebDriver driver;
	public FirstPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By button = By.cssSelector("li[class='dropdown']>a[role='menuitem']");
	private By logout = By.cssSelector("ul[class='dropdown-menu']>li:nth-of-type(4)>a");
	
	public WebElement getDropDown() {
		return driver.findElement(button);
	}
	public WebElement getLogout() {
		return driver.findElement(logout);
	}
}
