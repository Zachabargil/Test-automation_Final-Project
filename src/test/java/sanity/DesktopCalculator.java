package sanity;


import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.Desktopflows;


@Listeners(utilities.Listeners.class)
public class DesktopCalculator extends CommonOps {

    @Test(description = "Test01 - Verification of calculation result.")
    @Description("This test verifies a multiplication operation in the calculator.")
    public void VerifyCalculationResult01() {
        Desktopflows.Calculatedoubling();
        Verifications.VerifyTextInElement(CalculatorMain.btn_CalculatorResults, "Display is 35");
    }

    @Test(description = "Test02 - Verification of calculation result.")
    @Description("This test verifies a Addition operation in the calculator.")
    public void VerifyCalculationResult02() {
        Desktopflows.Calculateaddition();
        Verifications.VerifyTextInElement(CalculatorMain.btn_CalculatorResults, "Display is 9");
    }

    @Test(description = "Test03 - Verification of calculation result.")
    @Description("This test verifies a Subtraction operation in the calculator.")
    public void VerifyCalculationResult03() {
        Desktopflows.Calculatesubtraction();
        Verifications.VerifyTextInElement(CalculatorMain.btn_CalculatorResults, "Display is 2");
    }

    @Test(description = "Test04 - Verification of calculation result.")
    @Description("This test verifies a Division operation in the calculator.")
    public void VerifyCalculationResult04() {
        Desktopflows.Calculatedivision();
        Verifications.VerifyTextInElement(CalculatorMain.btn_CalculatorResults, "Display is 3");
    }


}
