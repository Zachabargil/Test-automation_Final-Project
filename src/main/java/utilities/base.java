package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class base {

    //General
    protected static WebDriverWait Wait;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static Actions action;
    protected static String Platform;

    //WEB
    protected static WebDriver driver;

    //Rest API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject Parameters = new JSONObject();
    protected static JsonPath jp;

    //DataBase
    protected static Connection Con;
    protected static Statement Sta;
    protected static ResultSet Rs;


    //Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();


    //Page Objects - WEB
    protected static pageObjects.AtidStore.MainPage AtidStoreMainPage;
    protected static pageObjects.AtidStore.StorePage StorePage;
    protected static pageObjects.AtidStore.Mens_Products Mens_Produtcs;
    protected static pageObjects.AtidStore.ContactPage ContactPage;
    protected static pageObjects.AtidStore.ShoppingCart ShoppingCart;

    //Page Objects - Mobile
    protected static pageObjects.financialCalc.MainPage mobileMain;
    protected static pageObjects.financialCalc.MainMenu mobileMenu;

    //Page Objects - Electron
    protected static pageObjects.TODO.MainPage todoMain;

    //Page Objects - Desktop
    protected static pageObjects.Calculator.MainPageCalc CalculatorMain;



}
