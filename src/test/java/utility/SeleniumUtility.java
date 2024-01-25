package utility;

import base.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends Setup {
    public String getElementText(WebElement element){
        return element.getText();
    }
    public void clickElement(WebElement element){
        element.click();
    }
    public String getElementTextWait(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        return driverWait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
    public void setElementDate(WebElement element,String data){
        element.sendKeys(data);

    }





}
