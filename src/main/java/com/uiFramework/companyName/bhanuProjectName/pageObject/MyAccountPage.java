package com.uiFramework.companyName.bhanuProjectName.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.bhanuProjectName.helper.logger.LoggerHelper;
import com.uiFramework.companyName.bhanuProjectName.helper.wait.WaitHelper;

/**
 * 
 * @author Bhanu Pratap
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 */
public class MyAccountPage {

	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(MyAccountPage.class);
	WaitHelper waitHelper;
	
	@FindBy(xpath="//*[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]")
	public WebElement successRegistrationMsg;
	
	@FindBy(xpath="//*[contains(text(),'Order history and details')]")
	public WebElement OrderHistoryAndDetails;
	
	@FindBy(xpath="//*[contains(text(),'My personal information')]")
	public WebElement MyPersonalInformation;
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		waitHelper.waitForElement(OrderHistoryAndDetails,ObjectReader.reader.getExplicitWait());
	}

}
