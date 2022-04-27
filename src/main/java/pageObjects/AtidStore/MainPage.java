package pageObjects.AtidStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {

    @FindBy(xpath = "//h1[@class='elementor-heading-title elementor-size-default']")
    public WebElement Title;

    @FindBy(xpath = "//ul[@id='ast-hf-menu-1']")
    public List<WebElement> List_MainNavigation;
}
