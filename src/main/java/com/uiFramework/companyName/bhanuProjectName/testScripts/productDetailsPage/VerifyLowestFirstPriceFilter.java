package com.uiFramework.companyName.bhanuProjectName.testScripts.productDetailsPage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uiFramework.companyName.bhanuProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.bhanuProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.bhanuProjectName.helper.logger.LoggerHelper;
import com.uiFramework.companyName.bhanuProjectName.pageObject.NavigationMenu;
import com.uiFramework.companyName.bhanuProjectName.pageObject.ProductCategoryPage;
import com.uiFramework.companyName.bhanuProjectName.testbase.TestBase;


/**
 * @author Bhanu Pratap
 */
public class VerifyLowestFirstPriceFilter extends TestBase{
	
	private final Logger log = LoggerHelper.getLogger(VerifyLowestFirstPriceFilter.class);
	
	@Test
	public void verifyLowestFirstPriceListInProduct_deatilsPage() throws InterruptedException {

		getApplicationUrl(ObjectReader.reader.getUrl());
		
		NavigationMenu navigationMenu = new NavigationMenu(driver);
		
		ProductCategoryPage pcategoryPage = navigationMenu.clickOnMenu(navigationMenu.womenMenu);
		// select price filter
		pcategoryPage.selectSortByFilter("Price: Lowest first");
		
		// wait for some time to make sure price is sorted.
		Thread.sleep(8000);
		
		List<WebElement> price = pcategoryPage.getAllProductsPrice();
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		Iterator<WebElement> itr = price.iterator();
		
		ArrayList<Integer> data = pcategoryPage.getPriceMassagedData(itr);
		boolean status = pcategoryPage.verifyArrayHasAscendingData(data);
		AssertionHelper.updateTestStatus(status);

	/*	
		//price comes in "$16.40" format
		// remove $ from beginning and change to int for sorting order verification
		// Store it in array list
		while (itr.hasNext()) {
			String p = itr.next().getText();
			if (p.contains("$")) {
				String actualData = p.substring(1);
				log.info(actualData);
				double p1 = Double.parseDouble(actualData);
				int productPrice = (int) (p1);
				array.add(productPrice);
			}
		}
		
		
		
        log.info(array);
        //[16, 16, 26, 27, 28, 30, 50]
		for (int i = 0; i < array.size() - 1; i++) {
			// this condition will check all next price should be smaller than previous one.
			// next price can be grater and equal
			if (array.get(i) <= array.get(i + 1)) {
				log.info("obj.get(i):-" + array.get(i));
				log.info("obj.get(i+1):-" + array.get(i + 1));
			} else {
				Assert.assertTrue(false,"price filter is not working");
			}
		}
		
		*/
	}
	
}
