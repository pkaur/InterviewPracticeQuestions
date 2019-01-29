/*1)  Define the method credentials() which is defined as a Dataprovider using the annotation. This method returns array of object array.

2) Add a method test() to your DataProviderTest class. This method takes two strings as input parameters.

3) Add the annotation @Test(dataProvider = “Authentication”) to this method. The attribute dataProvider is mapped to “Authentication”.
*//*

package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class DataProviderTest {

    private static WebDriver driver;

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {

        return new Object[][]{{"testuser_1", "Test@123"}, {"testuser_1", "Test@123"}};

    }

// Here we are calling the Data Provider object with its Name

    @Test(dataProvider = "Authentication")

    public void test(String sUsername, String sPassword) {

        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.store.demoqa.com");

        driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        driver.findElement(By.id("log")).sendKeys(sUsername);

        driver.findElement(By.id("pwd")).sendKeys(sPassword);

        driver.findElement(By.id("login")).click();

        driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

        driver.quit();

    }*/