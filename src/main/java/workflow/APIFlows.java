package workflow;

import extentions.ApiActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class APIFlows extends CommonOps {


    @Step("Business Flow: Get information from a group of users.")
    public static String getUsersDetails(String jPath) {
        response = ApiActions.get("api/users?page=2");
        return ApiActions.extractFromJson(response, jPath);
    }

    @Step("Business Flow: Get information from the user.")
    public static String getUserDetails(String jPath) {
        response = ApiActions.get("api/users/2");
        return ApiActions.extractFromJson(response, jPath);
    }

    @Step("Business Flow: Create a new user.")
    public static void Postuser(String name, String job) {
    Parameters.put("name", name);
    Parameters.put("job", job);
    ApiActions.post(Parameters, "/api/users");
    }

    @Step("Business Flow: Update user details.")
    public static void Updateuser(String name, String job) {
        Parameters.put("name", name);
        Parameters.put("job", job);
        ApiActions.post(Parameters, "/api/users/2");
    }

    @Step("Business Flow: Delete user.")
    public static void Deleteuser(String id) {
        ApiActions.Delete(Parameters, "/api/users/" + id);
    }



}

