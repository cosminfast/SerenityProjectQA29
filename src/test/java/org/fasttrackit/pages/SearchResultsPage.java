package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .product-name")
    private List<WebElementFacade> listOfProductNames;

    @FindBy(css = ".products-grid .regular-price")
    private List<WebElementFacade> listOfPrices;

    @FindBy(css = ".category-products > .toolbar select[title='Sort By']")
    private WebElementFacade sortByDropdown;

    public boolean isProductInList(String productName) {
        waitFor(listOfProductNames.get(0));

        for (WebElementFacade element : listOfProductNames) {
            System.out.println(element.getText());
            if (element.getText().equalsIgnoreCase(productName)) {
                element.click();
                return true;
            }
        }
        return false;
    }

    public void selectPriceFromDropdown() {
        sortByDropdown.selectByIndex(2);
    }

    public boolean isPriceAscending() {
        int firstPrice = getIntFromPrice(listOfPrices.get(0).getText());
        int secondPrice = getIntFromPrice(listOfPrices.get(listOfPrices.size() - 1).getText());
        return firstPrice <= secondPrice;
    }

}