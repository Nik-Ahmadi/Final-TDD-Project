package test;

import base.UiBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatePrimaryAccountTest extends UiBase {
    @Test
    public void createAccountFormSubmission(){
        clickElement(homepage.createAccountButton);
        String actualHeadingText = getElementTextWait(homepage.createPrimaryAccountForm);
        Assert.assertEquals(actualHeadingText,"Create Primary Account Holder");

        setElementDate(createPrimaryAccountPage.Email, "asdf1234@gmail.com");
        clickElement(createPrimaryAccountPage.Title);
        setElementDate(createPrimaryAccountPage.FirstName, "Darrol");
        setElementDate(createPrimaryAccountPage.LastName , "Deny");
        clickElement(createPrimaryAccountPage.Gender);
        clickElement(createPrimaryAccountPage.MaritalStatus);
        setElementDate(createPrimaryAccountPage.EmploymentStatus,"Employed");
        setElementDate(createPrimaryAccountPage.DateOfBirth, "10/18/1990");
        clickElement(createPrimaryAccountPage.DateOfBirth);
        clickElement(createPrimaryAccountPage.CreateAccountButton);

       String actualSignUpHeading = getElementTextWait(createPrimaryAccountPage.SignUpHeading);
       Assert.assertEquals(actualSignUpHeading,"Sign up your account");

    }
}
