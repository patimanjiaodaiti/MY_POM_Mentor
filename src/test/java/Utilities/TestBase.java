package Utilities;

import Pages.Elements;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    //in order to automate every test cases we need to setup the webDriver environment
    //we are making the webDriver instance variable so we could access in other packages
    public static WebDriver driver;
    public static Actions act;
    //act is used for mouse hoover or keyboard functions
    public static WebDriverWait wait;
    //explicitly wait for every external actions and expected condition
    public static Elements e;
    //in order to access the myLibrary methods we need to create the static variable
    public static myLibrary myLib;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        //it set up the chrome driver system properties
        driver=new ChromeDriver();//creating the object of the browser
        act = new Actions(driver);
        wait=new WebDriverWait(driver,20);
        e = new Elements();
        myLib = new myLibrary(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //we only set up once. time out for find element(s) method. waits for html code to upload

    }
    @AfterMethod
    public void endTest(){
        act.pause(3000).perform();
        driver.quit();
        driver=null;
        //it will garbuage collect the file memory

    }

}
