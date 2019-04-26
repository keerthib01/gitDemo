package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;
import ObjectRepository.RediffLoginPagePOF;




public class LoginApplication {
	// RediffLoginPage implemented in POF style
	//RediffHomepage implemented in POP style
	
	@Test
	public void Login()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	RediffLoginPagePOF rl = new RediffLoginPagePOF(d);
	rl.User().sendKeys("hello");
	rl.Password().sendKeys("hello");
	//rl.Go().click();
	rl.Home().click();
	
	RediffHomePage rh = new RediffHomePage(d);
	rh.Searchtext().sendKeys("books");
	rh.Searchbtn().click();
	
		
	
	
	}

}
