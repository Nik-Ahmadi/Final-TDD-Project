package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSelenium {
    WebDriver driver;
    @BeforeTest
    public void openBrowser(){
         driver = new ChromeDriver();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
    @Test
    public void navigateGoogle(){
        driver.get("https://google.com");
        String googleTitle = driver.getTitle();
        Assert.assertEquals(googleTitle,"Google");
    }

}
