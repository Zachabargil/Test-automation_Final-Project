package extentions;

import io.qameta.allure.Step;
import utilities.CommonOps;
import java.util.ArrayList;
import java.util.List;

public class DBActions extends CommonOps {

    @Step("Get credentials from Database")
    public static List<String> GetCredentials(String query) {
        List<String> Credentials = new ArrayList<String>();
        try {
            Rs = Sta.executeQuery(query);
            Rs.next();
          Credentials.add(Rs.getString(1));

        }
         catch (Exception e) {
            System.out.println("ERROR The database cannot be printed see details:" + e);
        }
        return Credentials;
    }
}
