package page;

import base.UiBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends UiBase {
public Homepage(){
    PageFactory.initElements(getDriver(), this);
}
@FindBy(xpath = "//h2[contains(text() , 'TEK Insurance App')]")
        public static WebElement Heading;
}
