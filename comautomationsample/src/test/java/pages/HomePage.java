package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    By profile_avatar = By.className("avatar");
    By settings_dropdown = By.className("logged-in-as");
    By signout_OfApp = By.cssSelector("div.dropdown-item.sign-out");


    public LoginPage signout_userProfile(){
        click(profile_avatar);
        click(settings_dropdown);
        click(signout_OfApp);
        return new LoginPage(driver);
        }
}
