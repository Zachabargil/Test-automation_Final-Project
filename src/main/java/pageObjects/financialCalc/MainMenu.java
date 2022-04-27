package pageObjects.financialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.App;

import java.time.Duration;
import java.util.List;


public class MainMenu {

    private AppiumDriver mobiledriver;

    public MainMenu(AppiumDriver mobiledriver) {
        this.mobiledriver = mobiledriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobiledriver , Duration.ofSeconds(3)), this);
    }

    @AndroidFindBy(xpath = "(//*[@id='mainGrid']/*/*[@id='icon'])[3]")
    public AndroidElement LoanCala_btn;
}
