package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class myLibrary {
    //creating our own customs method

    WebDriver driver; //custome method like screenshot we need driver

    public myLibrary(WebDriver driver){//we need to create constructor method here else it will not take screen shot cz it can't recognize the driver
        this.driver=driver;//two drivers are looking at same place
        //WebDriver driver => is the one from test base
    }

    public void TakeScreenShot(String saveAs){//String saveAs=> how we want to save the screen shot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File myFile= ts.getScreenshotAs(OutputType.FILE);//we are assigning output the file class
        //now we need to endicate where to store the file
        try {
            FileUtils.copyFile(myFile,new File("Captures/"+saveAs+".png"));
        } catch (Exception e) {
            //checked exception catch body will not execute so we don't need to write anything
        }
        //in() indicate which file to store
        //then where to store needs to written as :new File("Captures/"+saveAs+".png")

    }
    public void sleep(double a){//user must provide double value
        try {
            Thread.sleep((int)(a*1000));
            //Thread.sleep(A*10000);
        }catch (Exception e){}
    }
}
