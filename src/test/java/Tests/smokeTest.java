package Tests;

import Pages.Elements;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class smokeTest extends TestBase {
    //Elements e= new Elements(); I can't do it instance cz it will create drivers default value
//    Elements e;
//
//    @BeforeMethod
//    public void xx(){
//        e= new Elements();
//    }
    @Test
    public void test1(){
//        Elements e= new Elements();
        driver.navigate().to("https://www.google.com");
        myLib.sleep(1.5);
        e.searchBox.sendKeys("Apple"+ Keys.ENTER);
        myLib.TakeScreenShot("googleTest");
    }
}
