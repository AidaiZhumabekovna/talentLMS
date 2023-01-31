package com.talentLMS.UI.driverFactory;

import com.talentLMS.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;

/**
 * @author Aidai Kurmanbekova
 */
public class Driver {
  private Driver(){

  }

  private static WebDriver driver;
  public static WebDriver getDriver(){
    if(driver == null){
      switch (ConfigReader.getProperty("browser").toLowerCase()){
        case "edge" :
          driver = EdgeWebDriver.loadEdgeDriver();
          break;
        case "chrome" :
          driver = ChromeWebDriver.loadChromeDriver();
      }
    }
      return driver;
  }

  public static void closeDriver(){
    try{
      if(driver != null){
        driver.close();
        driver.quit();
        driver = null;
      }
    }catch (Exception e){
      System.out.println("Error while closing driver");
    }
  }
}
