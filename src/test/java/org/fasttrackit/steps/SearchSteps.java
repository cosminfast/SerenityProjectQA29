package org.fasttrackit.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void searchForKeyword(String keyword) {
        homePage.setSearchField(keyword);
    }

    @Step
    public void clickSearchIcon() {
        homePage.clickSearchButton();
    }

    @Step
    public void verifyProductIsInList(String productName) {
        Assert.assertTrue("The product was not found in the list!", searchResultsPage.isProductInList(productName));
    }

    @Step
    public void orderProductsByPrice() {
        searchResultsPage.selectPriceFromDropdown();
    }

    @Step
    public void productsAreSortedByPriceAscending() {
        Assert.assertTrue("The price is not sorted ascending!", searchResultsPage.isPriceAscending());
    }

    @Step
    public void goToProductDetailsPage(String productName) {
        searchForKeyword(productName);
        clickSearchIcon();
        verifyProductIsInList(productName);
//        selectFirstProduct();  // maybe?
    }
}