package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css="[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;




    public void clickOnAccountButton(){
        clickOn(accountButton);
    }

    public void clickOnLoginLink(){
        clickOn(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOn(registerLink);
    }


    public void setSearchField(String value){
        typeInto(searchField, value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }

    @FindBy(css=".top-link-cart")
    private WebElementFacade cartlink;

    public void clickOnCartLink(){
        clickOnAccountButton();
        clickOn(cartlink);
    }

}
