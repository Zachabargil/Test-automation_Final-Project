package utilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import workflow.Electronflows;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;


public class CommonOps extends base {

    /* ---------------------------------------------------
    Method Name: getData
    Method Description: This method extracts data from the Configuration File (DataConfig.xml)
    Method Parameters: String
    Method Return: String
    --------------------------------------------------- */
    public static String getData(String nodeName) {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    /* ---------------------------------------------------
    Method Name: initBrowser
    Method Description: This method initializes the prerequisite for web testing:
    - The browser type from the config file
    - The actions and waits for web testing
    - Call to the ManagePages.initSauceDemo() Method for Page Objects initializing
    Method Parameters: String
    Method Return: void
    --------------------------------------------------- */
    public static void initBrowser(String NameOfBrowser) throws Exception {
        if (NameOfBrowser.equalsIgnoreCase("Chrome"))
            driver = initChromeDriver();
        else if (NameOfBrowser.equalsIgnoreCase("Firefox"))
            driver = initFirefoxDriver();
        else if (NameOfBrowser.equalsIgnoreCase("InternetExplorer"))
            driver = initInternetExplorerDriver();
        else throw new Exception("name of BROWSER is invaild.");

        driver.manage().window().maximize();
        driver.get(getData("url"));
        Wait = new WebDriverWait(driver, 10);
        managePages.initAtidStore();
    }

    /* ---------------------------------------------------
    Method Name: initChromeDriver
    Method Description: This method initializes the chrome driver for web testing.
    Method Parameters: void
    Method Return: WebDriver
    --------------------------------------------------- */
    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    /* ---------------------------------------------------
    Method Name: initFirefoxDriver
    Method Description: This method initializes the firefox driver for web testing.
    Method Parameters: void
    Method Return: FirefoxDriver
    --------------------------------------------------- */
    public static WebDriver initFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    /* ---------------------------------------------------
    Method Name: initInternetExplorerDriver
    Method Description: This method initializes the IE driver for web testing.
    Method Parameters: void
    Method Return: InternetExplorerDriver
    --------------------------------------------------- */
    public static WebDriver initInternetExplorerDriver() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    /* ---------------------------------------------------
    Method Name: initMobile
    Method Description: This method initializes the prerequisite for mobile testing:
    - The Appium server configuration (url, desire capabilities) from the config file
    - The actions, waits for mobile testing
    - Call to the ManagePages.initMortgage() Method for Page Objects initializing
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initMobile() {
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("AppPackage"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("AppActivity"));
        try {
            mobileDriver = new AndroidDriver<>(new URL(getData("AppiumServer")), dc);
        } catch (Exception e) {
            System.out.println("Can not connect to Appium server, SEE DETAILs:" + e);
        }
        Wait = new WebDriverWait(mobileDriver, 7);
        managePages.initFinancialCalc();
        action = new Actions(mobileDriver);

    }

    /* ---------------------------------------------------
    Method Name: initAPI
    Method Description: This method initializes the prerequisite for API testing:
    - The baseURI of the RestAPI server
    - The httpRequests including authentication to the server
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initAPI() {
        RestAssured.baseURI = getData("url_api");
        httpRequest = RestAssured.given();
    }

    /* ---------------------------------------------------
    Method Name: initDesktop
    Method Description: This method initializes the prerequisite for desktop apps testing:
    - The WinAppDriverServer from the config file
    - The waits for desktop apps testing
    - Call to the ManagePages.initCalculator() method for Page Objects initializing
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    public static void initDesktop() {
        dc.setCapability("app", getData("CalculatorAPP"));
        try {
            driver = new WindowsDriver(new URL(getData("AppiumServerDesktop")), dc);
        } catch (Exception e) {
            e.printStackTrace();
        }
       managePages.initCalculator();
        Wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);

    }

    /* ---------------------------------------------------
    Method Name: initElectron
    Method Description: This method initializes the prerequisite for electron apps testing:
     - The Electron Driver and Desire Capabilities from the config file
     - The actions, waits for electron apps testing
     - Call to the ManagePages.initTodo() method for Page Objects initializing
     Method Parameters: void
     Method Return: void
    --------------------------------------------------- */
    public static void initElectron() {
        System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions options = new ChromeOptions();
        options.setBinary(getData("ElectronAppPath"));
        dc.setCapability("chromeOptions", options);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        managePages.initTODO();
        Wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);
    }

    /* ---------------------------------------------------
    Method Name: BeforeClass
    Method Description: This method initializes the prerequisite for the testing session:
    - The platform testing type: web, mobile, api, electron and desktop
    - The soft assertion object for testng assertions and screen object for recording tests
    - Call to ManageDB.openConnection() method to connect to the DB for testing with DB data
    Method Parameters: String PlatformName, String DDTFile, String EnableDB - from testng xml files
    Method Return: void
    --------------------------------------------------- */
    @BeforeClass
    @Parameters({"PlatformName"})
    public void BeforeClass(String PlatformName) throws Exception {
         Platform = PlatformName;
    if (Platform.equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
          else if (Platform.equalsIgnoreCase("mobile"))
             initMobile();
          else if (Platform.equalsIgnoreCase("api"))
            initAPI();
          else if (Platform.equalsIgnoreCase("electron"))
            initElectron();
          else if (Platform.equalsIgnoreCase("desktop"))
             initDesktop();
    else throw new Exception("name of PLATFORM is invaild.");
    softAssert = new SoftAssert();
    screen = new Screen();
    ManageDB.openConnection(getData("DBURL"), getData("DBUserName"), getData("DBPassword"));
    }

    /* ---------------------------------------------------
    Method Name: AfterClass
    Method Description: This method executes the following procedures after all the test cases finish running:
    - Close the web/mobile driver.
    - Close the connection to the DB server.
    Method Parameters: void
    Method Return: void
    --------------------------------------------------- */
    @AfterClass
    public void AfterClass() {
        if (Platform.equalsIgnoreCase("web"))
            driver.quit();
        if (Platform.equalsIgnoreCase("mobile"))
        mobileDriver.close();
  }

    /* ---------------------------------------------------
    Method Name: AfterMethod
    Method Description: This method navigated to the URL after the finish of each web test
    Method Parameters: void
    Method Return: void
   --------------------------------------------------- */
    @AfterMethod
    public void AfterMethod () {
     if (Platform.equalsIgnoreCase("web"))
        driver.get(getData("url"));
    }

    /* ---------------------------------------------------
    Method Name: BeforeMethod
    Method Description: This method initializes the prerequisite for each test case:
    - The params JSONObject to empty the JSON payload for post/put HTTPS requests
    - Call to the MonteScreenRecorder.startRecord(method.getName()) for starting the test recording
    Method Parameters: Method - for getting the Method name
    Method Return: void
    --------------------------------------------------- */
    @BeforeMethod
    public void BeforeMethod(Method method) {
        if (!Platform.equalsIgnoreCase("api")) {
            try {
                MonteScreenRecorder.startRecord(method.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
