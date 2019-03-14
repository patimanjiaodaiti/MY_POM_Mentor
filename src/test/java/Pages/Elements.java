package Pages;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements extends TestBase {
    //it can't recognize the driver if we don't create pagefactory
    //we will create default constructor method below
    //In this process we are connecting two classes
    public Elements(){
        PageFactory.initElements(driver,this);//(driver=>is TestBase class which has the driver,Elements.class)
    }


    public @FindBy(xpath = ".//input[@type=\"text\" and @class=\"gLFyf gsfi\"]")
    WebElement searchBox;
}
