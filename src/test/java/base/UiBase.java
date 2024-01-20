package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import page.Homepage;
import utility.SeleniumUtility;

public class UiBase extends SeleniumUtility {
    protected Homepage homepage;
    @BeforeMethod
    public void startTest(){
        openBrowser();
        navigateURL();
        this.homepage = new Homepage();
    }
    @AfterMethod
    public void endTest(){
        closeBrowser();
    }
}


