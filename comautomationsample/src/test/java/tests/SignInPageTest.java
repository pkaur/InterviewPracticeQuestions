package tests;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LaunchPage;
import pages.LoginPage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class SignInPageTest extends TestBase{

    @Test(dataProvider = "getData", priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword (TestData data) {

        LaunchPage launchPage = new LaunchPage(driver);
        //*************PAGE METHODS********************
        launchPage.goToN11().goToLoginPage().loginToN11(data).verifyErrorMessage("No Flipboard account exists with this username or email address. Please sign up for a new account or visit our Support page if you need more help.");
    }

  /*  @DataProvider(name = "getData")
    public static Object[][] credentials() {

        return new Object[][] { { "puhfbdxnu", "Test@123" }, { "ghdcdhcdhc", "12345678" },{"gdhsgchdg","cdgsdfhcdbfv"},{"cghdvcdxvc","dgvhdbchdxcbhxdbcd"}};

    }*/

    @DataProvider
    public Object[][] getData() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("/Users/niteshnayak/IdeaProjects/comautomationsample/src/main/resources/test.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataSet");
        List<TestData> testData = new Gson().fromJson(dataSet, new TypeToken<List<TestData>>() {
        }.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }

    /*@Test (priority = 1)
    public void invalidLoginTest_EmptyUserEmptyPassword () {
        //*************PAGE INSTANTIATIONS*************
        LoginPage loginPage = new LoginPage(driver);

        //*************PAGE METHODS********************
        loginPage.goToN11()
                .goToLoginPage()
                .loginToN11("","")
                .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
                .verifyLoginPassword("Bu alanın doldurulması zorunludur.");
    }*/
}
