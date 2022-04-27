package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extentions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflow.Electronflows;

import java.util.concurrent.TimeUnit;

@Listeners(utilities.Listeners.class)
public class ElectronTODO extends CommonOps {

    @Test(description = "Test01 - Adding tasks, and verifying the number of tasks")
    @Description("This test adds new tasks and verifies the total number of tasks.")
    public void AddandVerify() {
        Electronflows.addtask("Learn C#");
        Electronflows.addtask("Learn JAVA");
        Electronflows.addtask("Learn Phyton");
        Verifications.VerifyNumber(Electronflows.Getnumberoftasks(), 3);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @Test(description = "Test02 - Adding and Remove tasks , and verifying the number of tasks")
    @Description("This test adds new tasks and deletes them and verifies the deletion.")
    public void AddandRemove() {
        Electronflows.addtask("Learn Kotlin");
        Electronflows.addtask("Learn C++");
        Electronflows.addtask("Learn Ruby");
        Electronflows.Removetask();
        Verifications.VerifyNumber(Electronflows.Getnumberoftasks(), 0);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

}
