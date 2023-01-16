package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElementFacade firstnameField;

    @FindBy(id = "middlename")
    private WebElementFacade middlenameField;


    @FindBy(id = "lastname")
    private WebElementFacade lastnameField;

    @FindBy(id="email_address")
    private WebElementFacade emailField;

    @FindBy(id="password")
    private WebElementFacade passwordField;

    @FindBy(id="confirmation")
    private WebElementFacade confirmationField;

    @FindBy(id = "is_subscribed")
    private WebElement subscribeButton;

    @FindBy(css = "[title='Register'] span span")
    private WebElementFacade registerButton;

    @FindBy(css = "li.success-msg span")
    private WebElementFacade successfulRegisterMsg;

    @FindBy(css = "li.error-msg span")
    private WebElementFacade errorRegisterMsg;

    @FindBy(css = "div#advice-validate-email-email_address.validation-advice")
    private WebElementFacade errorEmailMsg;

    public void setFirstnameField(String value){
        typeInto(firstnameField, value);
    }

    public void setMiddlenameField(String value){
        typeInto(middlenameField, value);
    }

    public void setLastnameField(String value){
        typeInto(lastnameField, value);
    }

    public void setEmailField(String value){
        typeInto(emailField, value);
    }
    public void setPasswordField(String value){
        typeInto(passwordField, value);
    }

    public void setConfirmationField(String value){
        typeInto(confirmationField, value);
    }

    public void clickOnSubscribeButton(){
        clickOn(subscribeButton);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }
}




