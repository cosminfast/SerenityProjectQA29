package org.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{


    @Test
    public void searchForProductKeywordTest(){
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("SULLIVAN SPORT COAT");
    }

    @Test
    public void searchForFullProductNameTest(){
        searchSteps.searchForKeyword("SULLIVAN SPORT COAT");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("SULLIVAN SPORT COAT");
    }

    @Test
    public void verifyPriceAscendingTest(){
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.orderProductsByPrice();
        searchSteps.productsAreSortedByPriceAscending();
    }
}
