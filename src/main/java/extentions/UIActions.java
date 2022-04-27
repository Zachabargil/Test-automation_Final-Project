package extentions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click on element.")
    public static void click(WebElement element) {
        Wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    @Step("Update text of Element.")
    public static void sendtext(WebElement element, String text) {
        Wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    @Step("Update text as human.")
    public static void sendtextashuman(WebElement element, String text) {
        Wait.until(ExpectedConditions.visibilityOf(element));
        for (char ch : text.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
            element.sendKeys(ch + "");
        }
    }

    @Step("Mouse Hover.")
    public static void mousehover(WebElement element) {
        action.moveToElement(element).click().build().perform();
        //  Wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @Step("Insert Keys.")
    public static void Enter(WebElement element, Keys value ) {
        element.sendKeys(value);

    }
}




