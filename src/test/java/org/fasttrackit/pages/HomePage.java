package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountButton;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css="[title='Register']")
    private WebElementFacade registerLink;


    public void clickOnAccountButton(){
        clickOn(accountButton);
    }

    public void clickOnLoginLink(){
        clickOn(loginLink);
    }

    public void clickOnRegisterLink(){
        clickOn(registerLink);
    }


}
