package extentions;

import io.appium.java_client.MobileElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import java.util.List;
import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("Verify Main Page Title (ATID-STORE).")
    public static void VerifyMainpagetitle(WebElement element, String Expected) {
        Wait.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getText(), Expected);
    }

    @Step("Verify text in element.")
    public static void VerifyTextInElement(WebElement element, String Expected) {
        Wait.until(ExpectedConditions.visibilityOf(element));
        assertEquals(element.getText(), Expected);
    }

    @Step("Visibility test of elements.")
    public static void VisibilityofListOfelements(List<WebElement> elements) {
        for (WebElement element:elements) {
            softAssert.assertTrue(element.isDisplayed());
        }
    }

    @Step("Verify Text field.")
    public static void VisibilityOfelement (WebElement element) {
        element.isDisplayed();
    }

    @Step("Visual test of the main logo")
    public static void VerifyMainLogo(String ExpectedImageName) {
        try {
            screen.find(getData("ImageRepo") + ExpectedImageName + ".PNG");
        } catch (FindFailed e) {
            System.out.println("ERROR Comparing Image File " + e);
            fail("ERROR Comparing Image File " + e );
        }
    }

    @Step("Verify Element Displayed.")
    public static void ExistanceOfElement(List<WebElement> Elements) {
        assertTrue(Elements.size() > 0);
    }

    @Step("Verify Element Not Displayed.")
    public static void NonxistanceOfElement(WebElement Element) {
        Wait.until(ExpectedConditions.visibilityOf(Element));
        assertEquals(Element.getText(), "No products were found matching your selection.");
    }

    @Step("Verify Text.")
    public static void Verifytext(MobileElement Actual, String Expected) {
        assertEquals(Actual.getText(),Expected);
    }

    @Step("Verify Text. (API)")
    public static void Verifytextapi(String Actual, String Expected) {
        assertEquals(Actual,Expected);
    }

    @Step("Verify Number.")
    public static void VerifyNumber(int Actual, int Expected) {
        assertEquals(Actual,Expected);
    }

}