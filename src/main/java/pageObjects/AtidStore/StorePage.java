package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StorePage {

    @FindBy(xpath = "//*[@id=\"menu-item-45\"]/a")
    public WebElement StoreBTN;

    @FindBy(xpath = "//*[@id=\"wc-block-search__input-1\"]")
    public WebElement StoreSearchField;


    @FindBy(xpath = "//*[@id=\"main\"]/div/ul")
    public List<WebElement> Results;

    @FindBy(xpath = "//*[@id=\"block-7\"]/div/form/div/button")
    public WebElement Submitbtn;

    @FindBy(xpath = "//*[@id=\"main\"]/div/p")
    public WebElement Result;

    @FindBy(xpath = "//*[@id=\"main\"]/div/ul/li[1]")
    public WebElement BlackShoe;
}
