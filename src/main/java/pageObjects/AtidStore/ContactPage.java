package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

    @FindBy(xpath = "//*[@id=\"post-414\"]/div/div/div/section[1]/div[2]/div/div/div/div/h1")
    public WebElement ContactTitle;

    @FindBy(xpath = "//*[@id=\"menu-item-829\"]/a")
    public WebElement Contact_btn;

    @FindBy(xpath = "//*[@id=\"wpforms-15-field_0\"]")
    public WebElement Contact_Name;

    @FindBy(xpath = "//*[@id=\"wpforms-15-field_5\"]")
    public WebElement Contact_Subject;

    @FindBy(xpath = "//*[@id=\"wpforms-15-field_4\"]")
    public WebElement Contact_Email;

    @FindBy(xpath = "//*[@id=\"wpforms-15-field_2\"]")
    public WebElement Contact_Massage;

    @FindBy(xpath = "//*[@id=\"wpforms-submit-15\"]")
    public WebElement Contact_Submit_btn;



}
