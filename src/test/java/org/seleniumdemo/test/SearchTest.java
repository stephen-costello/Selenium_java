package org.seleniumdemo.test;

import org.junit.Test;
import org.seleniumdemo.common.Base;
import org.seleniumdemo.pageobject.HomePage;
import org.seleniumdemo.pageobject.SearchResultPage;

import static org.junit.Assert.assertTrue;

/**
 * Project Name    : selenium-demo
 * Developer       : Stephen Costello
 * Version         : -
 * Date            : 7/11/2022
 * Time            : -
 * Description     : Sample selenium UI test
 **/

public class SearchTest extends Base {

    @Test
    public void searchDressAndValidateResults() {
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        homePage.loadHomePage();
        homePage.search("dress");

        boolean isDressDisplayed = searchResultPage.isResultItemDisplayed("Printed Chiffon Dress");
        assertTrue(isDressDisplayed);
    }
}
