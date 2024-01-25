package base;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.*;
import page.CreatePrimaryAccountPage;
import page.Homepage;
import utility.SeleniumUtility;


@Listeners({ExtentITestListenerClassAdapter.class})


public class UiBase extends SeleniumUtility {
    protected Homepage homepage;
    protected CreatePrimaryAccountPage createPrimaryAccountPage;
    @BeforeMethod
    public void startTest(){
        openBrowser();
        navigateURL();
        this.homepage = new Homepage();
        this.createPrimaryAccountPage = new CreatePrimaryAccountPage();
    }
    @AfterMethod
    public void endTest(){
        closeBrowser();
    }
}


