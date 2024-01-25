package page;

import base.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePrimaryAccountPage extends Setup {
    public CreatePrimaryAccountPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(id = "email")
    public static WebElement Email;
    @FindBy(xpath = "//option[@value='Mr.']")
    public static WebElement Title;
    @FindBy(id = "firstName")
    public static WebElement FirstName;

    @FindBy(id = "lastName")
    public static WebElement LastName;

    @FindBy(xpath = "//option[@value = 'MALE']")
    public static WebElement Gender;

    @FindBy(xpath = "//option[@value = 'MARRIED']")
    public static  WebElement MaritalStatus;
    @FindBy(id = "employmentStatus")
    public static WebElement EmploymentStatus;
    @FindBy(id = "dateOfBirth")
    public static WebElement DateOfBirth;

    @FindBy(xpath = "//button[@class = 'chakra-button css-jut409']")
    public static WebElement CreateAccountButton;

    @FindBy(xpath = "//h2[contains(text(), 'Sign up your account')]")
    public static WebElement SignUpHeading;
}
