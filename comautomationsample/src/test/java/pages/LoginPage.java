package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.TestData;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    //*********Web Elements*********
    By usernameBy = By.name("username");
    By passwordBy = By.name("password");
    By loginButtonBy = By.xpath("//button[contains(text(),'Sign In')]");
    By errorMessage = By.className("auth__error-message");


    //*********Page Methods*********
    public LoginPage loginToN11 (TestData data){

        driver.navigate().to("https://bluebottle.flipboard.com/signin");
        //Enter Username(Email)
        writeText(usernameBy,data.getUsername());
        //Enter Password
        writeText(passwordBy, data.getPassword());
        //Click Login Button
        click(loginButtonBy);
        return this;
    }

    public LoginPage verifyErrorMessage (String expectedText) {
        assertEquals(errorMessage, expectedText);
        return this;
    }

}
