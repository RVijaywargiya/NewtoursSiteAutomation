package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions extends BaseClass {
	
	//WebDriver driver=BaseClass.driver;
	
WebDriverWait wait=new WebDriverWait(driver,50);

public void clickButton(WebElement element){
	wait.until(ExpectedConditions.elementToBeClickable(element));
	element.click();	
}

public void getElementText(WebElement element){
	wait.until(ExpectedConditions.visibilityOf(element));
	element.getText();
}

public void setText(WebElement element,String textToEnter){
	wait.until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(textToEnter);
}

public void selectRadioButton(WebElement radioButtonElement){
	wait.until(ExpectedConditions.elementToBeClickable(radioButtonElement));
	radioButtonElement.click();
}

public void selectElementDropDown(WebElement dropDown,String valueToSelect){
	wait.until(ExpectedConditions.elementToBeClickable(dropDown));
	Select select=new Select(dropDown);
	select.selectByValue(valueToSelect);
}

public void selectCheckBox(WebElement checkBoxToSelect){
	wait.until(ExpectedConditions.elementToBeClickable(checkBoxToSelect));
	checkBoxToSelect.click();
}

}
