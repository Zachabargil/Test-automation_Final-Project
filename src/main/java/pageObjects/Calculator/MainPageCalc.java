package pageObjects.Calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageCalc {

    @FindBy(name = "Clear")
    public WebElement btn_Clear;

    @FindBy(name = "Seven")
    public WebElement btn_Seven;

    @FindBy(name = "Three")
    public WebElement btn_Three;

    @FindBy(name = "Six")
    public WebElement btn_Six;

    @FindBy(name = "Eigth")
    public WebElement btn_Eigth;

    @FindBy(name = "Four")
    public WebElement btn_Four;

    @FindBy(name = "Nine")
    public WebElement btn_Nine;

    @FindBy(xpath = "//*[@AutomationId='divideButton']")
    public WebElement btn_Division;

    @FindBy(name = "Two")
    public WebElement btn_Two;

    @FindBy(name = "Minus")
    public WebElement btn_Minus;

    @FindBy(name = "Five")
    public WebElement btn_Five;

    @FindBy(name = "Multiply by")
    public WebElement btn_Multiplication;

    @FindBy(name = "Plus")
    public WebElement btn_Plus;

    @FindBy(name = "Equals")
    public WebElement btn_Equals;

    @FindBy(xpath = "//*[@AutomationId='CalculatorResults']")
    public WebElement btn_CalculatorResults;




}
