package workflow;

import extentions.UIActions;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import utilities.CommonOps;

public class Electronflows extends CommonOps {

    @Step("Add Task to the list")
    public static void addtask(String taksname) {
        UIActions.sendtext(todoMain.Create_Field, taksname);
        UIActions.Enter(todoMain.Create_Field, Keys.RETURN);
    }

    @Step("Count and return number of tasks")
    public static int Getnumberoftasks() {
    return todoMain.Tasks.size();
    }

    @Step("Delete tasks from the list")
    public static void Removetask() {
     for (int i = 0; i < Getnumberoftasks();) {
         UIActions.mousehover(todoMain.x_btn);
     }

    }
}
