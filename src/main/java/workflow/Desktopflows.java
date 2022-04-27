package workflow;

import extentions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class Desktopflows extends CommonOps {

    @Step("Business flow: Doubling operation of 7 x 5")
    public static void Calculatedoubling() {
        UIActions.click(CalculatorMain.btn_Clear);
        UIActions.click(CalculatorMain.btn_Seven);
        UIActions.click(CalculatorMain.btn_Multiplication);
        UIActions.click(CalculatorMain.btn_Five);
        UIActions.click(CalculatorMain.btn_Equals);
    }

    @Step("Business flow: Addition operation of 3 + 6")
    public static void Calculateaddition() {
        UIActions.click(CalculatorMain.btn_Clear);
        UIActions.click(CalculatorMain.btn_Three);
        UIActions.click(CalculatorMain.btn_Plus);
        UIActions.click(CalculatorMain.btn_Six);
        UIActions.click(CalculatorMain.btn_Equals);
    }

    @Step("Business flow: Subtraction operation of 4 - 2")
    public static void Calculatesubtraction() {
        UIActions.click(CalculatorMain.btn_Clear);
        UIActions.click(CalculatorMain.btn_Four);
        UIActions.click(CalculatorMain.btn_Minus);
        UIActions.click(CalculatorMain.btn_Two);
        UIActions.click(CalculatorMain.btn_Equals);
    }

    @Step("Business flow: Division operation of 9 : 3")
    public static void Calculatedivision() {
        UIActions.click(CalculatorMain.btn_Clear);
        UIActions.click(CalculatorMain.btn_Nine);
        UIActions.click(CalculatorMain.btn_Division);
        UIActions.click(CalculatorMain.btn_Three);
        UIActions.click(CalculatorMain.btn_Equals);
    }
}
