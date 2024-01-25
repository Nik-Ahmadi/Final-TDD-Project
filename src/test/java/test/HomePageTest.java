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
        //String actualHeading = homepage.Heading.getText();
        String actualHeading = getElementText(homepage.Heading);
        Assert.assertEquals(actualHeading, "TEK Insurance App", "This is the first page of my Website");
    }
    @Test
    public void verifyCreatePrimaryButtonAccount(){
       // String actualButtonText = homepage.createAccountButton.getText();
        String actualButtonText = getElementText(homepage.createAccountButton);
        Assert.assertEquals(actualButtonText,"Create Primary Account");

    }
    @Test
    public void verifyCreatePrimaryButtonAccountForm(){
        clickElement(homepage.createAccountButton);
        String actualHeadingText = getElementTextWait(homepage.createPrimaryAccountForm);
        Assert.assertEquals(actualHeadingText,"Create Primary Account Holder");
    }


}