package methodFactory;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CommonMethods {
    static WebDriver driver= BaseClass.driver;

    public static void scroll(WebElement element){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element );

    }

    public static Select selectDropdownValue(WebElement element){
        Select select= new Select(element);
        return select;
    }

    public static Actions doAction(WebDriver driver){
        Actions actions= new Actions(driver);
        return actions;
    }

    public static void clickElements(String xpath, String value){
        List<WebElement> dropdown = driver.findElements(By.xpath(xpath));
        for (int i = 0; i <= dropdown.size() - 1; i++) {
            if (dropdown.get(i).getText().equals(value)) {
                dropdown.get(i).click();
                break;

            }
        }
    }
}
