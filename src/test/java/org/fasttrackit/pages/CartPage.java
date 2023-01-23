package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class CartPage extends BasePage {


    @FindBy(css = ".success-msg span")
    private WebElementFacade addedToCartMessage;

    public boolean wasProductWasAddedToCart(String productName) {
        return addedToCartMessage.getText().equalsIgnoreCase(productName + " was added to your shopping cart.");
    }

    @FindBy(id ="empty_cart_button")
    private WebElementFacade emptyCartButton;

    public void clickEmptyButton(){
        clickOn(emptyCartButton);
    }

    private static Double getDoubleFromPrice(WebElementFacade element) {
        String price = element.getText().split(" ")[0].replaceAll(",", ".");
        return Double.parseDouble(price);
    }
    @FindBy(css = ".product-cart-total .price")
    private static List<WebElementFacade> productPrices;

    public static Double getSumOfPrices() {
        Double total = 0.0;
        for (WebElementFacade element: productPrices) {
            total += getDoubleFromPrice(element);
        }
        return total;
    }

    @FindBy(css = " .a-right > .price")
    private static List<WebElementFacade> totalProductsPage;

    public static Double getTotalPrice() {
        WebElementFacade totalWithoutTax = totalProductsPage.get(0);
        return getDoubleFromPrice(totalWithoutTax);
    }
}
