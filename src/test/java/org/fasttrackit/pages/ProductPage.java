package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".configurable-swatch-list li:first-child")
    private List<WebElementFacade> productOptions;

    public void clickAddToCartButton() {
        selectAttributes();
        clickOn(addToCartButton);
    }

    @FindBy(css = "li > input")
    private WebElementFacade selectButton;

    public void clickSelectButton(){ clickOn((selectButton));}

    public void selectAttributes() {
        for (WebElementFacade element : productOptions) {
            clickOn(element);
        }
    }
}
//
//<ul id="configurable_swatch_color" class="configurable-swatch-list clearfix">
//<li class="option-indigo is-media selected" id="option26">

//<ul id="configurable_swatch_size" class="configurable-swatch-list clearfix">
//<li class="option-s" id="option80">

