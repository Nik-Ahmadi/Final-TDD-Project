package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {

    private final String URL = "https://dev.insurance.tekschool-students.com/";
    private static WebDriver driver;
    private String browser = "Chrome";
    public void openBrowser(){
         if(browser.equals("Chrome")){
             driver = new ChromeDriver();
         }else if(browser.equals("Firefox")){
             driver = new FirefoxDriver();
         }else if(browser.equals("Edge")){
             driver = new EdgeDriver();
         }else{
             System.out.println("Invalid Browser");
         }
    }
    public void closeBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void navigateURL(){
        driver.get(URL);
    }

}
