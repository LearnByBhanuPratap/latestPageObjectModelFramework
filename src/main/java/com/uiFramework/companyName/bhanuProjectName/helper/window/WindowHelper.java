package com.uiFramework.companyName.bhanuProjectName.helper.window;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.uiFramework.companyName.bhanuProjectName.helper.logger.LoggerHelper;

public class WindowHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(WindowHelper.class);

	public WindowHelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method will switch to parent window
	 */
	public void switchToParentWindow() {
		log.info("switching to parent window...");
		driver.switchTo().defaultContent();
	}

	/**
	 * This method will switch to child window based on index
	 * @param index
	 */
	public void switchToWindow(int index) {
		Set<String> windows = driver.getWindowHandles();
		int i = 1;
		for (String window : windows) {
			if (i == index) {
				log.info("switched to : "+index + " window");
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
	}

	/**
	 * This method will close all tabbed window and 
	 * switched to main window
	 */
	public void closeAllTabsAndSwitchToMainWindow() {
		Set<String> windows = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();

		for (String window : windows) {
			if (!window.equalsIgnoreCase(mainwindow)) {
				driver.close();
			}
		}
		log.info("switched to main window");
		driver.switchTo().window(mainwindow);
	}
	
	/**
	 * This method will do browser back navigation
	 */
	public void navigateBack(){
		log.info("navigating back");
		driver.navigate().back();
	}
	
	/**
	 * This method will do browser forward navigation
	 */
	public void navigateForward(){
		log.info("navigating forward");
		driver.navigate().forward();
	}
}
