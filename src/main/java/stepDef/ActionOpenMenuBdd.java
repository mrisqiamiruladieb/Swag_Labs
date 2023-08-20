package stepDef;

import config.env_target;
import pages.loginPages;
import pages.homePages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionOpenMenuBdd extends env_target {
    @Given("User has logged in")
    public void userHasLoggedIn() {
        //Set driver location path
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        //Maximize driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Set url
        driver.get(baseUrl);
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@value='Login']"))
        );
        //Implementasi POM
        loginPages loginpages = new loginPages(driver);

        loginpages.inputUserAccountData("standard_user", "secret_sauce");
        loginpages.clickLoginButton();
    }

    @When("User verify product to add to cart")
    public void userVerifyProductToAddToCart() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-bike-light"))
        );
    }

    @Then("User click add product to cart button")
    public void userClickAddProductToCartButton() {
        //Implementasi POM
        homePages homepages = new homePages(driver);

        homepages.clickAddToCartSauceLabsBikeLightButton();
    }

    @When("User verify cart contents")
    public void userVerifyCartContents() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
    }

    @Then("User click cart button")
    public void userClickCartButton() {
        //Implementasi POM
        homePages header = new homePages(driver);

        header.clickCartButton();
    }

    @When("User verify open menu link button")
    public void userVerifyOpenMenuLinkButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='react-burger-menu-btn']" +
                        "[contains(text(), 'Open Menu')]"))
        );
    }

    @Then("User click open menu link button")
    public void userClickOpenMenuLinkButton() {
        //Implementasi POM
        homePages header = new homePages(driver);

        header.clickOpenMenuButton();
    }

    @When("User verify all items button")
    public void userVerifyAllItemsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='inventory_sidebar_link'][contains(text(), 'All Items')]"))
        );
    }

    @And("User click all items button")
    public void userClickAllItemsButton() {
        //Implementasi POM
        homePages sidebar = new homePages(driver);

        sidebar.clickAllItemsButton();
    }

    @Then("User verify all items button result")
    public void userVerifyAllItemsButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Products')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @When("User verify about button")
    public void userVerifyAboutButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='about_sidebar_link'][contains(text(), 'About')]"))
        );
    }

    @And("User click about button")
    public void userClickAboutButton() {
        //Implementasi POM
        homePages sidebar = new homePages(driver);

        sidebar.clickAboutButton();
    }

    @Then("User verify about button result")
    public void userVerifyAboutButtonResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://saucelabs.com/")
        );
        //Quit chrome
        driver.quit();
    }

    @When("User verify reset app state button")
    public void userVerifyResetAppStateButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='reset_sidebar_link'][contains(text(), 'Reset App State')]"))
        );
    }

    @And("User click reset app state button")
    public void userClickResetAppStateButton() {
        //Implementasi POM
        homePages sidebar = new homePages(driver);

        sidebar.clickResetAppStateButton();
    }

    @Then("User verify reset app state result")
    public void userVerifyResetAppStateResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
