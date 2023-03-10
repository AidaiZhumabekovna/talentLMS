package uiTests;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.helper.WebElementActions;
import com.talentLMS.UI.page.BasePage;
import com.talentLMS.UI.page.LearnerHomePage;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.UserCredentials;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUiTest extends BasePage {
    LoginPage loginPage;
    WebElementActions webElementActions;
    LearnerHomePage learnerHomePage;
    UserCredentials userCredentials;
    WebDriver driver;
    @BeforeClass
    public void setUpUiTest(){
        loginPage = new LoginPage();
        webElementActions = new WebElementActions();
        learnerHomePage = new LearnerHomePage();
        userCredentials = new UserCredentials();
        driver = Driver.getDriver();
    }

    @AfterClass
    public void tearDown(){

    }
}
