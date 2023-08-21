package stepDef;

import config.env_target;
import pages.loginPages;
import pages.homePages;
import pages.cartPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class ActionCartBddTdd extends env_target {
    @Given("User successfully logged in")
    public void userSuccessfullyLoggedIn() {
        //add and remove items and leave only one item in the cart
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

    @When("User verify products to add to cart")
    public void userVerifyProductsToAddToCart() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("add-to-cart-sauce-labs-backpack"))
        );
    }

    @And("User click add products to cart")
    public void userClickAddProductsToCart() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Implementasi POM
        homePages homepages = new homePages(driver);

        homepages.clickAddToCartSauceLabsBackpackButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Implementasi POM
        homepages.clickAddToCartSauceLabsBikeLightButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '2')]"))
        );
        //Implementasi POM
        homepages.clickAddToCartSauceLabsBoltTShirtButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '3')]"))
        );
        //Implementasi POM
        homepages.clickAddToCartSauceLabsFleeceJacketButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '4')]"))
        );
        //Implementasi POM
        homepages.clickAddToCartSauceLabsOnesieButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '5')]"))
        );
        //Implementasi POM
        homepages.clickAddToCartSauceLabsAllThingsTShirtRedButton();
    }

    @Then("User verifies the number of products added")
    public void userVerifiesTheNumberOfProductsAdded() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '6')]"))
        );
    }

    @When("User click the cart button")
    public void userClickTheCartButton() {
        //Implementasi POM
        homePages header = new homePages(driver);

        header.clickCartButton();
    }

    @And("User verify products to remove from cart")
    public void userVerifyProductsToRemoveFromCart() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("remove-sauce-labs-backpack"))
        );
    }

    @And("User click remove products from cart")
    public void userClickRemoveProductsFromCart() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Implementasi POM
        cartPages cartpages = new cartPages(driver);

        cartpages.clickRemoveSauceLabsBackpackButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '5')]"))
        );
        //Implementasi POM
        cartpages.clickRemoveSauceLabsBikeLightButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '4')]"))
        );
        //Implementasi POM
        cartpages.clickRemoveSauceLabsBoltTShirtButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '3')]"))
        );
        //Implementasi POM
        cartpages.clickRemoveSauceLabsFleeceJacketButton();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '2')]"))
        );
        //Implementasi POM
        cartpages.clickRemoveSauceLabsOnesieButton();
    }

    @And("User verifies the number of products removed")
    public void userVerifiesTheNumberOfProductsRemoved() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );

    }

    @And("User click continue shopping button")
    public void userClickContinueShoppingButton() {
        //Implementasi POM
        cartPages cartpages = new cartPages(driver);

        cartpages.clickContinueShoppingButton();
    }

    @Then("User verify remove products result")
    public void userVerifyRemoveProductsResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User verify checkout button")
    public void userVerifyCheckoutButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]"))
        );
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() {
        //Implementasi POM
        cartPages cartpages = new cartPages(driver);

        cartpages.clickCheckoutButton();
    }

    @Then("User verify personal data checkout page")
    public void userVerifyPersonalDataCheckoutPage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Your Information')]"))
        );
    }

    @When("User fill data on personal data checkout page")
    public void userFillDataOnPersonalDataCheckoutPage() {
        //Generate Random Data
        Random rand = new Random();
        //Menggunakan angka
        int dataRand = rand.nextInt(10000);
        //Implementasi POM
        cartPages checkout = new cartPages(driver);

        checkout.inputUserInformationData("Red" + dataRand, "Bulls" + dataRand, "" + dataRand);
    }

    @And("User click continue button")
    public void userClickContinueButton() {
        //Implementasi POM
        cartPages checkout = new cartPages(driver);

        checkout.clickContinueButton();
    }

    @Then("User verify checkout overview page")
    public void userVerifyCheckoutOverviewPage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Overview')]"))
        );
    }

    @When("User click finish button")
    public void userClickFinishButton() {
        //Implementasi POM
        cartPages checkout = new cartPages(driver);

        checkout.clickFinishButton();
    }

    @Then("User verify checkout result")
    public void userVerifyCheckoutResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Complete!')]"))
        );
    }

    @When("User click back to products button")
    public void userClickBackToProductsButton() {
        //Implementasi POM
        cartPages cartpages = new cartPages(driver);

        cartpages.clickBackToProductsButton();
    }

    @Then("User verify products page")
    public void userVerifyProductsPage() {
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

    @When("User click cancel button")
    public void userClickCancelButton() {
        //Implementasi POM
        cartPages checkout = new cartPages(driver);

        checkout.clickCancelButton();
    }

    @Then("User get data error message")
    public void userGetDataErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error-message-container error']"))
        );
        //Quit chrome
        driver.quit();
    }

    @And("User verify detail product link")
    public void userVerifyDetailProductLink() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("item_4_title_link"))
        );
    }

    @And("User click detail product link")
    public void userClickDetailProductLink() {
        //Implementasi POM
        cartPages cartpages = new cartPages(driver);

        cartpages.clickDetailProductLinkButton();
    }

    @Then("User verify back to products button")
    public void userVerifyBackToProductsButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("back-to-products"))
        );
    }

    @When("^User input (.*), (.*), (.*) on personal data checkout page$")
    public void userInputFirstnameLastnameZipOnPersonalDataCheckoutPage(String firstname, String lastname, String zip) {
        //Implementasi POM
        cartPages checkout = new cartPages(driver);

        checkout.inputUserInformationData(firstname, lastname, zip);
    }

    @Then("^User get verify checkout overview page (.*)$")
    public void userGetVerifyCheckoutOverviewPageResult(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Overview')]"))
            );
        } else if (result == "Failed") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='error-message-container error']"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
