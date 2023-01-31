package com.talentLMS.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Aidai Kurmanbekova
 */
public class LearnerHomePage extends BasePage {

    @FindBy(xpath = "//span[@title='Aidai Kurmanbekova']")
    public WebElement fullUserName;

    @FindBy(xpath = "//div[@class='container ']")
    public WebElement homePageContainer;
    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement homeTextInHomePage;



}
