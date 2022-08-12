package pageobjects;

import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;
    Helper elementHelper;
    By searchInput = By.id("search-input");
    By profileToggle = By.className("tt-dropdown-toggle");
    By nameSurname = By.id("loginInputName");
    By email = By.id("loginInputEmail");
    By password = By.id("loginInputPassword");
    By passwordConfirm = By.id("loginInputPasswordConfirm");
    By submitButton = By.className("btn");
    By signup = By.className("icon-f-94 search-icon");
    By searchIcon = By.cssSelector("button[type=submit]");

    By productsOnSearch = By.className("tt-product thumbprod-center");
    By addToCart = By.id("addToCart");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementHelper = new Helper(driver);
    }


    public void searchItem() {
        this.elementHelper.findElement(searchInput).click();
        this.elementHelper.typeForInput("parfum", this.elementHelper.findElement(searchInput));
        this.elementHelper.findElement(searchIcon).click();
        this.elementHelper.findElement(productsOnSearch).click();
        this.elementHelper.findElement(addToCart).click();

    }

    public void signUp() {
        this.elementHelper.findElement(profileToggle).click();
        this.elementHelper.findElement(signup).click();
        this.elementHelper.findElement(nameSurname).click();
        this.elementHelper.findElement(nameSurname).sendKeys("Mustafa KADAK");
        this.elementHelper.findElement(email).click();
        this.elementHelper.findElement(email).sendKeys("deneme@kadak.com");
        this.elementHelper.findElement(password).click();
        this.elementHelper.findElement(password).sendKeys("kadakkadak1111");
        this.elementHelper.findElement(passwordConfirm).click();
        this.elementHelper.findElement(passwordConfirm).sendKeys("kadakkadak1111");
        this.elementHelper.findElement(submitButton).click();
    }

}