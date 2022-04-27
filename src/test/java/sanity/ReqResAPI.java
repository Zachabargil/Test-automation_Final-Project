package sanity;

import extentions.ApiActions;
import extentions.Verifications;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.APIFlows;

@Listeners(utilities.Listeners.class)
public class ReqResAPI extends CommonOps {

    @Step("Test 01 - GET from ReqRes.")
    @Description("This test Verify user property.")
    @Test
    public void Test01_VerifyUser() {
      Verifications.Verifytextapi(APIFlows.getUsersDetails("data[0].first_name"), "Michael");
    }

    @Step("Test 02 - Add user and Verify.")
    @Description("This test adds a new user to the list and verifies it.")
    @Test
    public void Test02_AddAndVerifyUser() {
        APIFlows.Postuser("Sean", "QAEngineer");
        Verifications.Verifytextapi(ApiActions.extractFromJson(response,"name"), "Sean");
    }

    @Step("Test 03 - Update user and Verify.")
    @Description("This test update user to the list and verifies it.")
    @Test
    public void Test02_UpdateAndVerifyUser() {
        APIFlows.Updateuser("mor", "sw_developer");
        Verifications.Verifytextapi(ApiActions.extractFromJson(response,"name"), "mor");
        Verifications.Verifytextapi(ApiActions.extractFromJson(response,"job"), "sw_developer");
    }

    @Step("Test 04 - Delete user and Verify.")
    @Description("This test delete user to the list and verifies it.")
    @Test
    public void Test02_DeleteAndVerifyUser() {
        APIFlows.Deleteuser("2");
        Verifications.VerifyNumber(response.getStatusCode(), 204);
    }


}
