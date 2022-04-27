package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.Mobileflows;

@Listeners(utilities.Listeners.class)
public class FinancialCalcMobile extends CommonOps {

    @Test(description = "Test01 - Verify monthly payment")
    @Description("This test verifies the monthly payment of a loan.")
    public void VerifyFinancial() {
        Mobileflows.CalculateMorgage("2000", "2", "10", "6", "0");
        Verifications.Verifytext(mobileMain.MonthlyPayment_txt, "17.61");
    }

    @Test(description = "Test02 - Verify advanced monthly payment")
    @Description("This test verifies the advanced monthly payment of a loan.")
    public void VerifyFinancial02() {
        Mobileflows.Calculateadvancedpayment("500000", "2", "15", "2", "0", "10", "20", "30", "1500000");
        Verifications.Verifytext(mobileMain.MonthlyPayment_txt, "3,189.72");
    }


}
