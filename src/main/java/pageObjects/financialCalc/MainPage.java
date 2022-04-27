package pageObjects.financialCalc;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;


public class MainPage {

    private AppiumDriver mobiledriver;

    public MainPage(AppiumDriver mobiledriver) {
        this.mobiledriver = mobiledriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobiledriver , Duration.ofSeconds(3)), this);
    }

    @AndroidFindBy(id = "loanAmount")
    public AndroidElement Amount_txt;

    @AndroidFindBy(id = "interestRate")
    public AndroidElement InterestRate_txt;

    @AndroidFindBy(id = "loanYear")
    public AndroidElement LoanTermYears_txt;

    @AndroidFindBy(id = "loanMonth")
    public AndroidElement LoanTermMonths_txt;

    @AndroidFindBy(id = "extraPerMonth")
    public AndroidElement ExtraPayment_txt;

    @AndroidFindBy(xpath = "//*[@text='CALCULATE']")
    public AndroidElement Calculate_btn;

    @AndroidFindBy(id = "monthlyPayment")
    public AndroidElement MonthlyPayment_txt;

    @AndroidFindBy(id = "propertyTax")
    public AndroidElement PropertyTax_txt;

    @AndroidFindBy(id = "insurance")
    public AndroidElement Insurance_txt;

    @AndroidFindBy(id = "pmi")
    public AndroidElement PMI_txt;

    @AndroidFindBy(id = "propertyPrice")
    public AndroidElement PropertyPrice_txt;

    @AndroidFindBy(id = "reset")
    public AndroidElement reset_btn;

    @AndroidFindBy(id = "advanced")
    public AndroidElement advanced_btn;
}
