package openLending.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import openLending.pages.BasePage;
import openLending.pages.LinkedinPage;
import openLending.utilities.BrowserUtils;
import openLending.utilities.ConfigurationReader;
import openLending.utilities.Driver;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class LinkedinPageSloganStepDef {
    BasePage basePage=new BasePage();
    LinkedinPage linkedinPage= new LinkedinPage();

    @Given("user is on google page")
    public void user_is_on_google_page() {
        String googleUrl= ConfigurationReader.getProperty("googlePage");
        Driver.getDriver().get(googleUrl);
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        basePage.googleSearchInput.sendKeys(ConfigurationReader.getProperty("messageInSearching"));
        basePage.googleSearchInput.submit();
    }
    @When("user searches for Open Lending linkedin account on google")
    public void user_searches_for_open_lending_linkedin_account_on_google() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        basePage.linkedinPageLinkOnGoogle.click();


    }
    @When("user clicks on Company linkedin page")
    public void user_clicks_on_company_linkedin_page() {

        String username =ConfigurationReader.getProperty("username");
        String password =ConfigurationReader.getProperty("password");
        String companyLinkedinUrl=ConfigurationReader.getProperty("linkedinPageUrl");

        linkedinPage.signInOnLinkedin.click();
        linkedinPage.inputUsernameLinkedin.sendKeys(username);
        linkedinPage.inputPasswordLinkedin.sendKeys(password);
        linkedinPage.singinButtonOnLinkedin.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(companyLinkedinUrl);
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


    }
    @Then("user should verify the slogan")
    public void user_should_verify_the_slogan() {
        String expectedMessage = ConfigurationReader.getProperty("messageToVerify");
        String actualMessage= linkedinPage.sloganMessage.getText();
//        System.out.println(expectedMessage+"expected");
//        System.out.println(actualMessage+"actual");
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
