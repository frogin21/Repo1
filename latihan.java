import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//Import Packages/Statements
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.*;

public class c_testing {

@Test

public void search_c(){
//Instantiate the webdriver object:
WebDriver driver= new FirefoxDriver();


//Open the web
driver.get ("http://mataharimall.com/");
driver.manage().window().maximize();


//Find the element of name and xpath then typing the input in fields
driver.findElement(By.xpath("/html/body/div[4]/div[1]")).click();
driver.findElement(By.name("query")).sendKeys("handphone");

//Clicking on search button
driver.findElement(By.name("")).click(); 

//Get page title in selenium webdriver
String actual=driver.getTitle();

//Assertion //will return pass or fail
String expected ="Search for handphone | MatahariMall.com";
Assert.assertEquals(actual, expected);
}
}