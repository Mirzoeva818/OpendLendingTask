package openLending.pages;

import openLending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedinPage {
    public LinkedinPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//p/button[text()=' Sign in ']")
    public WebElement signInOnLinkedin;

    @FindBy(xpath = "//input[@id='session_key']")
    public WebElement inputUsernameLinkedin;

    @FindBy(xpath= "//input[@id='session_password']")
    public WebElement inputPasswordLinkedin;

    @FindBy(xpath="//button[@class='sign-in-form__submit-button']")
    public WebElement singinButtonOnLinkedin;
    @FindBy(xpath = "//p[@class='org-top-card-summary__tagline t-16 t-black']")
    public WebElement sloganMessage;
}
