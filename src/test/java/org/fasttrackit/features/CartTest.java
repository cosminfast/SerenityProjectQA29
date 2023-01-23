package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;

import org.fasttrackit.pages.CartPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Constants;

import java.util.Arrays;
import java.util.List;


@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest {

    @Test
    public void searchForProductKeywordTest() {
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("SULLIVAN SPORT COAT");
    }

    @Test
    public void searchForFullProductNameTest() {
        searchSteps.searchForKeyword("SULLIVAN SPORT COAT");
        searchSteps.clickSearchIcon();
        searchSteps.verifyProductIsInList("SULLIVAN SPORT COAT");
    }

    @Test
    public void verifyPriceAscendingTest() {
        searchSteps.searchForKeyword("top");
        searchSteps.clickSearchIcon();
        searchSteps.orderProductsByPrice();
        searchSteps.productsAreSortedByPriceAscending();
    }

    @Test
    public void addToCartTest() {
        String productName = "TRIBECA SKINNY JEAN";
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        cartSteps.navigateToCartPage();
        cartSteps.emptyCart();
        List<String> productNames = Arrays.asList("TRIBECA SKINNY JEAN", "ANN ANKLE BOOT", "DUMBO BOYFRIEND JEAN");
        for (String name : productNames){
            searchSteps.goToProductDetailsPage(name);
            cartSteps.clickAddToCart();
        }
        cartSteps.verifyTotalPrice();

    }




}

//    @Test
//    public void add3ProductsToCart(){
//
//        String productName = "A TALE OF TWO CITIES";
//        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
//        searchSteps.goToProductDetailsPage(productName);
//        cartSteps.selectproduct();
//        cartSteps.clickAddToCart();
//        cartSteps.verifyProductWasAddedToCart(productName);
//        String productName2 = "MODERN MURRAY CERAMIC VASE";
//        searchSteps.goToProductDetailsPage(productName2);
//        cartSteps.clickAddToCart();
//        cartSteps.verifyProductWasAddedToCart(productName2);
//        String productName3 = "TRIBECA SKINNY JEAN";
//        searchSteps.goToProductDetailsPage(productName3);
//        cartSteps.selectproduct();
//        cartSteps.clickAddToCart();
//        cartSteps.verifyProductWasAddedToCart(productName3);
//    }


