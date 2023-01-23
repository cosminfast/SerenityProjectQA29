package org.fasttrackit.steps;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.junit.Assert;

public class CartSteps extends BaseSteps {


    @Step
    public void clickAddToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void verifyProductWasAddedToCart(String productName) {
        Assert.assertTrue("Product was not added to cart!", cartPage.wasProductWasAddedToCart(productName));
    }

    public void clickAddToCartlink() {
        homePage.clickOnCartLink();
    }

    @Step
    public void navigateToCartPage() {
        homePage.open();
        homePage.clickOnCartLink();
    }

    @Step
    public void emptyCart(){
        cartPage.clickEmptyButton();
    }

    @Step
    public void selectproduct(){
        productPage.clickSelectButton();
    }

    public void verifyTotalPrice(){
        Double totalSum = CartPage.getSumOfPrices();
        Double pageTotal = CartPage.getTotalPrice();
        Assert.assertEquals("Totals differ", totalSum, pageTotal);
    }
}
