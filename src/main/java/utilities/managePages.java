package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.AtidStore.MainPage;

public class managePages extends base {

    /* ---------------------------------------------------
    Method Name: initAtidStore
    Method Description: This method initializes the page objects elements for the AtidStore website.
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initAtidStore(){
        AtidStoreMainPage = PageFactory.initElements(driver, MainPage.class);
        StorePage = PageFactory.initElements(driver, pageObjects.AtidStore.StorePage.class);
        Mens_Produtcs = PageFactory.initElements(driver, pageObjects.AtidStore.Mens_Products.class);
        ContactPage = PageFactory.initElements(driver, pageObjects.AtidStore.ContactPage.class);
        ShoppingCart = PageFactory.initElements(driver, pageObjects.AtidStore.ShoppingCart.class);
    }

    /* ---------------------------------------------------
    Method Name: initFinancialCalc
    Method Description: This method initializes the page objects elements for the Financial Calculator Mobile App.
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initFinancialCalc() {
        mobileMain = new pageObjects.financialCalc.MainPage(mobileDriver);
        mobileMenu = new pageObjects.financialCalc.MainMenu(mobileDriver);
    }

    /* ---------------------------------------------------
    Method Name: initTODO
    Method Description: This method initializes the page objects elements for the to do list Electron app.
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initTODO() {
        todoMain = PageFactory.initElements(driver, pageObjects.TODO.MainPage.class);

    }

    /* ---------------------------------------------------
    Method Name: initCalculator
    Method Description: This method initializes the page objects elements for the Calculator desktop app.
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initCalculator() {
        CalculatorMain = PageFactory.initElements(driver, pageObjects.Calculator.MainPageCalc.class);

    }



}

