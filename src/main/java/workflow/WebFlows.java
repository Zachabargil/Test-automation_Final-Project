package workflow;

import extentions.DBActions;
import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;
import java.util.List;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Send contact details.")
    public static void contact(String name, String subject, String email, String message) {
         UIActions.sendtext(ContactPage.Contact_Name, name);
         UIActions.sendtext(ContactPage.Contact_Subject, subject);
         UIActions.sendtext(ContactPage.Contact_Email, email);
         UIActions.sendtext(ContactPage.Contact_Massage, message);
         UIActions.click(ContactPage.Contact_Submit_btn);
     }

    @Step("Business Flow: Search and verify product.")
    public static void searchandverify(String productName, String shouldExist) {
        UIActions.sendtextashuman(StorePage.StoreSearchField, productName);
        UIActions.click(StorePage.Submitbtn);
        if (shouldExist.equalsIgnoreCase("exist"))
        Verifications.ExistanceOfElement(StorePage.Results);
            else if (shouldExist.equalsIgnoreCase("not-exist"))
            Verifications.NonxistanceOfElement(StorePage.Result);
    }

    @Step("Business Flow: Add products to the cart in ATIDSTORE, using DB credentials")
    public static void SearchProduct() {
    StorePage.StoreBTN.click();
    String query = "SELECT ProductName From Products WHERE ID = '1'";
    List<String> cred = DBActions.GetCredentials(query);
    UIActions.sendtext(StorePage.StoreSearchField, cred.get(0));
    StorePage.Submitbtn.click();
    StorePage.BlackShoe.click();
    ShoppingCart.AddToCart_btn.click();
    Verifications.VerifyTextInElement(ShoppingCart.PurcasheAmount, "61.00 ₪");
    }

}



