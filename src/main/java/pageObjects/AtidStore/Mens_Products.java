package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Mens_Products {

    @FindBy(id = "menu-item-266")
    public WebElement Men_btn;


    @FindBy(id = "wc-block-search__input-1")
    public WebElement Text_Field;


    @FindBy(className = "orderby")
    public WebElement Sort;

    @FindBy(xpath = "//*[@id=\"main\"]/div/ul/li[1]/div[2]/a/h2")
    public WebElement ShoeItem;

}
