import framework.ConfigReader;
import framework.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class SearchTest {
    static WebDriver driver;
    HomePage homePage;

    @BeforeClass
    public void setup(){
        driver = DriverSetup.initialize_Driver(ConfigReader.initialize_Properties().get("browser").toString());
        homePage = new HomePage(driver);
    }

    @Test(priority = 1)
    public void searchParfum(){
        homePage.searchItem();
    }

    @Test(priority = 2)
    public void signUp(){
        homePage.signUp();
    }







}
