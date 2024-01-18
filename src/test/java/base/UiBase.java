package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utility.SeleniumUtility;

public class UiBase extends SeleniumUtility {
    @BeforeTest
    public void startTest(){
        openBrowser();
    }
    @AfterTest
    public void endTest(){
        closeBrowser();
    }
}


