package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchPage extends BasePage {

    public LaunchPage(WebDriver driver){
        super(driver);
    }

    //*********Web Elements*********
    By signInButtonBy = By.xpath("//*[@data-vars-button-name='main-header-login']");
    By signUpButtonBy = By.xpath("//*[@data-vars-button-name='main-header-signup-cta']");


    //*********Page Methods*********

    public LaunchPage goToN11 (){
        driver.get("https://bluebottle.flipboard.com");
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage(driver);
    }

    public LoginPage gotToSignUpPage(){
        click(signUpButtonBy);
        return new LoginPage(driver);
    }
}
