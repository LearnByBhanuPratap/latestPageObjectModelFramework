
package com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.uiFramework.companyName.bhanuProjectName.helper.resource.ResourceHelper;

public class FirefoxBrowser {

	public FirefoxOptions getFirefoxOptions() {

		DesiredCapabilities firefox = DesiredCapabilities.firefox();

		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		
		firefox.setCapability(FirefoxDriver.PROFILE, profile);
		firefox.setCapability("marionette", true);

		FirefoxOptions firefoxOptions = new FirefoxOptions(firefox);
		// Linux
		if (System.getProperty("os.name").contains("Linux")) {
			firefoxOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
		}
		return firefoxOptions;
	}

	public WebDriver getFirefoxDriver(FirefoxOptions cap) {

		if (System.getProperty("os.name").contains("Mac")) {
			System.setProperty("webdriver.gecko.driver",ResourceHelper.getResourcePath("src/main/resources/drivers/geckodriver"));
			return new FirefoxDriver(cap);
		} else if (System.getProperty("os.name").contains("Window")) {
			System.setProperty("webdriver.gecko.driver",ResourceHelper.getResourcePath("src/main/resources/drivers/geckodriver.exe"));
			return new FirefoxDriver(cap);
		} else if (System.getProperty("os.name").contains("Linux")) {
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			return new FirefoxDriver(cap);
		}
		return null;
	}
	
	public static void main(String[] args) {
		FirefoxBrowser obj = new FirefoxBrowser();
		WebDriver driver = obj.getFirefoxDriver(obj.getFirefoxOptions());
		driver.get("https://www.zomato.com/bangalore/punjabi-nawabi-hsr/order/LoqDdXx");
	}


}
