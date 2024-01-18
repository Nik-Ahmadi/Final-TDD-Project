package test;

import base.UiBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Homepage;
import utility.SeleniumUtility;

public class HomePageTest extends UiBase {

    @Test
    public void verifyHeading() {
        navigateURL();
        Homepage homepage = new Homepage();
        String actualHeading = homepage.Heading.getText();
        Assert.assertEquals(actualHeading, "TEK Insurance App", "This is the first page of my Website");
    }

}