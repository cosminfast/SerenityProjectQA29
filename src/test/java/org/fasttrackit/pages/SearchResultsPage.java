package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage{
    @FindBy(css=".products-grid .product-name")
    private List<WebElementFacade> listofproductname
}
