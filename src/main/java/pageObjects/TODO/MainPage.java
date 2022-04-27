package pageObjects.TODO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {

    @FindBy(css = "input[placeholder='Create a task']")
    public WebElement Create_Field;

    @FindBy(className = "view_2Ow90")
    public List<WebElement> Tasks;

    @FindBy(className = "destroy_19w1q")
    public WebElement x_btn;

}
