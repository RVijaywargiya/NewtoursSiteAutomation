package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import core.WebActions;

public class LoginPage extends WebActions {
	
	@FindBy(name="userName")
	public WebElement userName;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement loginButton;	
	
  }
