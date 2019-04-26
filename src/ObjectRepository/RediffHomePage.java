package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	
	WebDriver driver;
	
	By searchtext = By.cssSelector("input.homesrchbox");
	By searchbtn = By.className("newsrchbtn");
	
	
	public RediffHomePage(WebDriver d)
	{
		this.driver = d;
	}
	
	public WebElement Searchtext()
	{
		return driver.findElement(searchtext);
	}
	
	public WebElement Searchbtn()
	{
		return driver.findElement(searchbtn);
	}
}
