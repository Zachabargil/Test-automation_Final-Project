package sanity;

import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.WebFlows;

@Listeners(utilities.Listeners.class)
public class AtidStoreDB extends CommonOps {

    @Test(description = "Test01 - Search and Add products using DB credentials")
    @Description("This test add products to the cart in ATIDSTORE, using DB credentials.")
    public void SearchProductDB() {
        WebFlows.SearchProduct();
    }
}
