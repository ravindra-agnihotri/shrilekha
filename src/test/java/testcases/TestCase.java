package testcases;

import base.BaseClass;
import methodFactory.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.Callable;

public class TestCase {
    static WebDriver driver= BaseClass.getDriver();

    @Test(priority = 0)
    public void openURL(){

        driver.get("https://demo.automationtesting.in/");
    }
@Test(priority = 1)
    public void register() {
        driver.findElement(By.xpath("//button[@id='btn2']")).click();
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//button[@id='btn2']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Shri");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Soni");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Indore");
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("soni@yopmail.com");
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8109815865");
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        driver.findElement(By.xpath("//input[@value='Cricket']")).click();
        ////select[@id='Skills']
        CommonMethods.selectDropdownValue(driver.findElement(By.xpath("//select[@id='Skills']"))).selectByValue("Android");
        CommonMethods.selectDropdownValue(driver.findElement(By.xpath("//select[@id='yearbox']"))).selectByValue("1925");
        CommonMethods.selectDropdownValue(driver.findElement(By.xpath("//select[@placeholder='Month']"))).selectByValue("June");
        CommonMethods.selectDropdownValue(driver.findElement(By.xpath("//select[@id='daybox']"))).selectByValue("8");
        ////input[@ id="firstpassword"]
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("@122");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("@1234");
        ////button[@id="submitbtn"]
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
    }
    @Test(priority = 2)
    public void abc(){
        CommonMethods.scroll(driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")));
       //table[@class="ui-datepicker-calendar"]//tr//td[@data-handler="selectDay"]//a
        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        //ul[@id='select2-country-results']//li
        CommonMethods.clickElements("//ul[@id='select2-country-results']//li","Denmark");
       CommonMethods.scroll(driver.findElement(By.xpath("//a[text()='SwitchTo']")));
        CommonMethods.doAction(driver).moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).click(driver.findElement(By.xpath("//a[text()='Alerts']"))).build().perform();
       CommonMethods.scroll(driver.findElement(By.xpath("//a[text()='SwitchTo']")));
        CommonMethods.doAction(driver).moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).click(driver.findElement(By.xpath("//a[text()='Windows']"))).build().perform();
       CommonMethods.doAction(driver).moveToElement(driver.findElement(By.xpath("//li[@class='dropdown']//a[text()='SwitchTo']"))).build().perform();
//    moveToElement(driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Drag and Drop ']"))).build().perform();
      CommonMethods.clickElements("//ul[@class='dropdown-menu']//li//a","Alerts");
      driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
      driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
      driver.switchTo().alert().accept();
      driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
      driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
      driver.switchTo().alert().sendKeys("adad");


        };
        }



