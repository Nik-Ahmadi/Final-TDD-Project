package Demo;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGActivity {
    @Test
    public void firstTest(){
        System.out.println("Hello World");
    }
    @Test
    public void sumThis(){
        System.out.println("This is another Test");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("This line code must run before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("this code must after all Test");
    }
    @Test
    public void asserting(){
        Assert.assertEquals(10,10);
    }
}
