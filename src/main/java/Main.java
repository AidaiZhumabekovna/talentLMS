import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import org.openqa.selenium.WebElement;

public class Main {
    public static void main(String[] args) {
        Driver.getDriver().get("https://www.amazon.com/");
        Driver.closeDriver();

        WebElement element = null;

        WebElementActions webElementActions = new WebElementActions();
        webElementActions.waitElementToBeClickable(element)
                .waitElementToBeDisplayed(element);
        System.out.println("browser");
    }
}
