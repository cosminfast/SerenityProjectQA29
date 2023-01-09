package org.fasttrackit.steps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {


    private AccountPage accountPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private RegisterPage registerPage;

    @Step
    public void navigateToRegisterPage() {
        homePage.open();
        homePage.clickOnAccountButton();
        homePage.clickOnRegisterLink();
    }

    @Step
    public void typeUserName(String email) {
        loginPage.setEmailField(email);
    }

}
