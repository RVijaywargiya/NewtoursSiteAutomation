package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utils.*;

public class BaseClass extends Utilities{
	public static WebDriver driver;
		
  @BeforeTest
  public void getAppUrl() throws Exception{
	  System.setProperty("webdriver.chrome.driver",getDataPropertyFile("chromeDriverPath"));
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(getDataPropertyFile("url"));
  }
  
  @AfterTest
  public void tearDown(){
	  driver.quit();
  }
}
