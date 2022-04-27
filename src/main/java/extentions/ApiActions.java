package extentions;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utilities.CommonOps;

public class ApiActions extends CommonOps {

    @Step("Get data from the server.")
    public static Response get(String parameters) {
        response = httpRequest.get(parameters);
        return response;
    }

    @Step("Extract value from json.")
    public static String extractFromJson(Response response, String path) {
    jp = response.jsonPath();
    return jp.get(path).toString();
    }

    @Step("Post data to the server.")
    public static void post(JSONObject Parameters, String resourse) {
     httpRequest.header("Content-Type", "application/json");
     httpRequest.body(Parameters.toJSONString());
     response = httpRequest.post(resourse);
    }

    @Step("Update data to the server.")
    public static void Update(JSONObject Parameters, String resourse) {
        httpRequest.header("Content-Type", "application/json");
        httpRequest.body(Parameters.toJSONString());
        response = httpRequest.put(resourse);
    }

    @Step("Delete data from the server.")
    public static void Delete(JSONObject Parameters, String resourse) {
        httpRequest.header("Content-Type", "application/json");
        response = httpRequest.delete(resourse);
    }


}
