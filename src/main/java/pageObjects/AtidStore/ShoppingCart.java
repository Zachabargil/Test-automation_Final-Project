package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {

    @FindBy(xpath = "//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")
    public WebElement Cart;

    @FindBy(xpath = "//*[@id=\"ast-site-header-cart\"]/div[1]/a/span/span/span")
    public WebElement PurcasheAmount;

    @FindBy(xpath = "//*[@id=\"post-39\"]/div/div/div/section[1]/div/div/div/div/div/h1")
    public WebElement Carttitle;

    @FindBy(name = "add-to-cart")
    public WebElement AddToCart_btn;
}
