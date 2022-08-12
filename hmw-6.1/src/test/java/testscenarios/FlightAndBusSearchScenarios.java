package testscenarios;


import api.FlightTicketRequest;
import com.mashape.unirest.http.exceptions.UnirestException;
import framework.ConfigReader;
import framework.DriverSetup;
import model.Root;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class FlightAndBusSearchScenarios {

    static WebDriver driver;
    static Properties properties;
    HomePage homePage;
    FlightTicketRequest flightTicketRequest;
    String keyword = "ada";

    @BeforeClass
    public void setup() {
        properties = ConfigReader.initialize_Properties();
        driver = DriverSetup.initialize_Driver("chrome");
        homePage = new HomePage(driver);
        flightTicketRequest = new FlightTicketRequest();

    }

    @Test(priority = 1, enabled = false)
    public void searchForKeyword() throws InterruptedException {

        homePage.searchForFlightTicket(keyword);

    }

    @Test(priority = 2, enabled = false)
    public void checkListForSearch() throws UnirestException, IOException {
        Map<String, Root> flightMap = new HashMap();
        Map<String, Root> flightMapAPi = new HashMap();
        List<String> flightList = homePage.listForFlightTicketSearchByStream();
        List<String> searchFlightList = new ArrayList<>();
        searchFlightList.stream().forEach(e -> {
            searchFlightList.add(flightList.[(Integer.parseInt(e)].getCity_code() + "," +
                    flightList[Integer.parseInt(e)].getCountry_name() + "," +
                    flightList[Integer.parseInt(e)].getAirport() + "," +
                    flightList[Integer.parseInt(e)].getCity_name());

        });
    }


    @Test
    public void verifySoftAssertion() {
        Assertion assertion = new SoftAssert();
        assertion.assertEquals("a", "b");
        System.out.println("bu okunur");
        Assert.assertEquals("a", "b");
        System.out.println("bu okunmaz");
    }

}
