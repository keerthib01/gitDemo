package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePOF {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement user;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@title='Sign in']")
	WebElement go;
	
	@FindBy(linkText="Home")
	WebElement home;
	

	public RediffLoginPagePOF(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(d, this);
	}
	
	public WebElement User()
	{
		return user;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Go()
	{
		return go;
	}
	
	public WebElement Home()
	{
		return home;
	}
	
	
	
	

}
