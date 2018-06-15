package com.uiFramework.companyName.bhanuProjectName.helper.frame;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uiFramework.companyName.bhanuProjectName.helper.logger.LoggerHelper;

public class FrameHelper {
	
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(FrameHelper.class);
	
	public FrameHelper(WebDriver driver){
		this.driver = driver;
	}
	
	/**
	 * this method will switchToFrame based on frame index
	 * @param frameIndex
	 */
	public void switchToFrame(int frameIndex){
		driver.switchTo().frame(frameIndex);
		log.info("switched to :"+ frameIndex+" frame");
	}
	
	/**
	 * this method will switchToFrame based on frame name
	 * @param frameName
	 */
	public void switchToFrame(String frameName){
		driver.switchTo().frame(frameName);
		log.info("switched to :"+ frameName+" frame");
	}
	
	/**
	 * this method will switchToFrame based on frame WebElement
	 * @param element
	 */
	public void switchToFrame(WebElement element){
		driver.switchTo().frame(element);
		log.info("switched to frame "+element.toString());
	}
}
