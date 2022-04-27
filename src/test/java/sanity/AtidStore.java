package sanity;

import extentions.UIActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.WebFlows;


@Listeners(utilities.Listeners.class)
public class
AtidStore extends CommonOps {



    @Test(description = "Test01 - VerifyMainPageTitle")
    @Description("This test verifies the main title of the page.")
    public void VerifyMainPageTitle() {
        Verifications.VerifyMainpagetitle(AtidStoreMainPage.Title, "ATID Demo Store");
    }

    @Test(description = "Test02 - VerifyNavigationElements")
    @Description("This test verifies the elements of the navigation menu.")
    public void VerifyNavigationElements() {
        Verifications.VisibilityofListOfelements(AtidStoreMainPage.List_MainNavigation);
    }

    @Test(description = "Test03 - VerifyTextField")
    @Description("This test verifies the search field and the page's filter button in the men's area.")
    public void VerifyTextField() {
        UIActions.click(Mens_Produtcs.Men_btn);
        Verifications.VisibilityOfelement(Mens_Produtcs.Text_Field);
        Verifications.VisibilityOfelement(Mens_Produtcs.Sort);
    }

    @Test(description = "Test04 - VerifyContactPage")
    @Description("This test verifies the title and button of the contact page, And sends contact information.")
    public void VerifyContactPage() {
        UIActions.click(ContactPage.Contact_btn);
        Verifications.VisibilityOfelement(ContactPage.ContactTitle);
        Verifications.VerifyTextInElement(ContactPage.ContactTitle, "Contact Us");
        WebFlows.contact("Zach", "Automation", "zzz@aaa.com", "Automation");
    }

    @Test(description = "Test05 - VerifyShoppingCart")
    @Description("This test verifies the button and title of the shopping cart, And adds an item to the shopping cart for checking the integrity of the cart.")
    public void VerifyShoppingCart() {
        Verifications.VisibilityOfelement(ShoppingCart.Cart);
        UIActions.click(ShoppingCart.Cart);
        Verifications.VisibilityOfelement(ShoppingCart.Carttitle);
        Verifications.VerifyTextInElement(ShoppingCart.Carttitle, "Cart");
        Verifications.VerifyTextInElement(ShoppingCart.PurcasheAmount, "0.00 ₪");
        UIActions.click(Mens_Produtcs.Men_btn);
        UIActions.click(Mens_Produtcs.ShoeItem);
        UIActions.click(ShoppingCart.AddToCart_btn);
        Verifications.VerifyTextInElement(ShoppingCart.PurcasheAmount, "80.00 ₪");
    }

    @Test(description = "Test06 - VerifyMainLogo")
    @Description("This test verifies the main logo.")
    public void VerifyMainLogo() {
        Verifications.VerifyMainLogo("LogoAtidCollageStore");
    }

    @Test(description = "Test07 - Search Products", dataProvider = "data-provider-products", dataProviderClass = utilities.ManageDDT.class)
    @Description("This test search product in results using DDT.")
    public void Searchproducts(String user, String shouldexist) {
        UIActions.click(StorePage.StoreBTN);
        WebFlows.searchandverify(user, shouldexist);
    }

}

