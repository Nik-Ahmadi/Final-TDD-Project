package utility;

import base.Setup;
import org.openqa.selenium.WebElement;

public class SeleniumUtility extends Setup {
    public String getElementText(WebElement element){
        return element.getText();
    }
    public void clickElement(WebElement element){
        element.click();
    }
   // public String getElementTextWait(WebElement element, int duration){
        //W
    //}

}
