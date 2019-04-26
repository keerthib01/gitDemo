package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	By user = By.xpath("//input[@id='login1']");
	By password = By.id("password");
	By go = By.xpath("//input[@title='Sign in']");
	By home = By.linkText("Home");
	
	public RediffLoginPage(WebDriver d)
	{
		this.driver = d;
	}
	
	public WebElement User()
	{
		return driver.findElement(user);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Go()
	{
		return driver.findElement(go);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
	
	
	
	

}
