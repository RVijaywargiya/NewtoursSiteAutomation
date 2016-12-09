package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.WebActions;

public class FlightFinderPage extends WebActions {
  
	@FindBy(xpath="//img[contains(@src,'flightfinder.gif')]")
	public WebElement flightFinderPageHeader;
	
	@FindBy(xpath="//input[@name='tripType'][@value='oneway']")
	public WebElement oneWay;
	
	@FindBy(name="passCount")
	public WebElement passCount;
	
	@FindBy(name="fromPort")
	public WebElement fromCity;
	
	@FindBy(name="toPort")
	public WebElement toCity;
	
	
	
}
