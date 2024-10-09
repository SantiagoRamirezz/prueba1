package sra_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import sra_locators.LocatorsPageIncio;

public class BasePageWeb {

	// ***********************************************************************************************************
	// Instancias
	// ***********************************************************************************************************
	private WebDriver driver;
	
	
	LocatorsPageIncio loc;

	public BasePageWeb(WebDriver driver) {
		this.driver = driver;
		this.initializeLocators();
	}

	private void initializeLocators() {
		loc = new LocatorsPageIncio();
		AjaxElementLocatorFactory ajaxElementLocatorFactory  = new AjaxElementLocatorFactory(this.driver, 0);
		PageFactory.initElements(ajaxElementLocatorFactory, this.loc);
	}
	
	private void navigateTo(String url) {
		driver.get(url);
	}

	
	
	// Encapsulamiento
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
