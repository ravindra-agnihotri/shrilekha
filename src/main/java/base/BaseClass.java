package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
       return driver;
    }
}
