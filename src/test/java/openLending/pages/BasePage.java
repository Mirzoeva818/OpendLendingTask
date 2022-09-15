package openLending.pages;

import openLending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//input[@title='Search']")
    public WebElement googleSearchInput;

    @FindBy(xpath="//h3[text()='Open Lending - LinkedIn']")
    public WebElement linkedinPageLinkOnGoogle;

    @FindBy(xpath="//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/div/cite")
    public WebElement linkedinPageAfterSearch;

}
