package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;


    public void clickAddToCartButton(){
        clickOn(addToCartButton);
    }


}
