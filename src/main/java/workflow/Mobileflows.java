package workflow;

import extentions.MobileActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class Mobileflows extends CommonOps {

    @Step("Business Flow: Fill form, And calculate loan.")
    public static void CalculateMorgage(String loanamount, String interestRate, String loanYear, String loanMonth, String extraPerMonth) {
        MobileActions.tap(mobileMenu.LoanCala_btn);
        MobileActions.sendtext(mobileMain.Amount_txt, loanamount);
        MobileActions.sendtext(mobileMain.InterestRate_txt, interestRate);
        MobileActions.sendtext(mobileMain.LoanTermYears_txt, loanYear);
        MobileActions.sendtext(mobileMain.LoanTermMonths_txt, loanMonth);
        MobileActions.sendtext(mobileMain.ExtraPayment_txt, extraPerMonth);
        MobileActions.tap(mobileMain.Calculate_btn);
    }

    @Step("Business Flow: Fill out the form, and calculate a loan with more details.(Advanced Step)")
    public static void Calculateadvancedpayment(String loanamount, String interestRate, String loanYear, String loanMonth, String extraPerMonth, String PropertyTax, String insurance, String pmi, String PropertyPrice) {
        MobileActions.tap(mobileMain.reset_btn);
        MobileActions.sendtext(mobileMain.Amount_txt, loanamount);
        MobileActions.sendtext(mobileMain.InterestRate_txt, interestRate);
        MobileActions.sendtext(mobileMain.LoanTermYears_txt, loanYear);
        MobileActions.sendtext(mobileMain.LoanTermMonths_txt, loanMonth);
        MobileActions.sendtext(mobileMain.ExtraPayment_txt, extraPerMonth);
        MobileActions.tap(mobileMain.advanced_btn);
        MobileActions.sendtext(mobileMain.PropertyTax_txt, PropertyTax);
        MobileActions.sendtext(mobileMain.Insurance_txt, insurance);
        MobileActions.sendtext(mobileMain.PMI_txt, pmi);
        MobileActions.sendtext(mobileMain.PropertyPrice_txt, PropertyPrice);
        MobileActions.tap(mobileMain.Calculate_btn);
    }

}
