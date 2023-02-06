package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;

import com.talentLMS.UI.page.UserCredentials;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseUiTest{

    @BeforeMethod
    public void openLoginPage(){
       driver.navigate().to(ConfigReader.getProperty("qa_env"));
    }
    @Test(description = "Verify user can not login with invalid username")
    public void loginWithInvalidUsernameTest(){
        loginPage.fillUpUsernameAndPassword("testName","HelloAAAAsds");
        String expectedErrMes = "Your username or password is incorrect. Please try again, making sure that CAPS LOCK key is off.";
        assertEquals(loginPage.loginErrMess.getText(),expectedErrMes);
        Driver.closeDriver();
        webElementActions.pause(5000);
    }

    @Test(description = "Verify user can login with valid credentials")
    public void loginWithValidCredentials1(){
        loginPage.fillUpUsernameAndPassword(userCredentials.userName, userCredentials.getUserPassword());
        webElementActions.pause(2000);
        try {
            String expectedFullUserName = "AIDAI KURMANBEKOVA";
            assertEquals(learnerHomePage.fullUserName.getText(),expectedFullUserName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(learnerHomePage.homeTextInHomePage.getText(), "Home");
    }

//    @Test
//    public void homePage(){
//        String expectedWindow = "https://digitalnomads.talentlms.com/dashboard";
//        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
//        assertEquals(ConfigReader.getProperty("qa_env_home"), expectedWindow);
//    }

    @Test(description = "verify that user can login with valid credentials")
    public void loginWithValidCredentials(){
        List<String> users = new ArrayList<>();
        users.add(userCredentials.userName);
        users.add(userCredentials.getUserPassword());




    }

}
