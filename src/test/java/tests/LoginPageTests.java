package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FlightFinderPage;
import pages.LoginPage;
import core.BaseClass;

public class LoginPageTests extends BaseClass {
	LoginPage objLoginPage;
	FlightFinderPage objFlightFinderPage;
	
  @Test
  public void loginApp() throws Exception {
	  objLoginPage=PageFactory.initElements(driver, LoginPage.class);
	  objLoginPage.setText(objLoginPage.userName, getDataPropertyFile("userName"));
	  objLoginPage.setText(objLoginPage.password, getDataPropertyFile("password"));
	  objLoginPage.clickButton(objLoginPage.loginButton);
	  objFlightFinderPage=PageFactory.initElements(driver, FlightFinderPage.class);
	  Assert.assertTrue(objFlightFinderPage.flightFinderPageHeader.isDisplayed(),"The user was able to login");
	  objFlightFinderPage.selectRadioButton(objFlightFinderPage.oneWay);
	  objFlightFinderPage.selectElementDropDown(objFlightFinderPage.passCount, "3");
	  objFlightFinderPage.selectElementDropDown(objFlightFinderPage.fromCity, "Paris");	  
  }
}
