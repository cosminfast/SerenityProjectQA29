package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import utils.Constants;
public class LoginTest extends BaseTest {
    @Test
    public void validLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
    }

    @Test
    public void invalidPasswordLoginTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword("123123123123");
        loginSteps.clickLogin();
//        TODO: FINISH THIS LATER
    }
    @Test
    public void verifyPasswordRequiredFieldTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.clickLogin();
    }
}