package stepDef;

import config.env_target;
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
        //Set element locate
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click();
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
        //Set element locate
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Set element locate
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '2')]"))
        );
        //Set element locate
        driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '3')]"))
        );
        //Set element locate
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '4')]"))
        );
        //Set element locate
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '5')]"))
        );
        //Set element locate
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
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
        //Set element locate
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
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
        //Set element locate
        driver.findElement(By.name("remove-sauce-labs-backpack")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '5')]"))
        );
        //Set element locate
        driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '4')]"))
        );
        //Set element locate
        driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '3')]"))
        );
        //Set element locate
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '2')]"))
        );
        //Set element locate
        driver.findElement(By.name("remove-sauce-labs-onesie")).click();
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
        //Set element locate
        driver.findElement(By.name("continue-shopping")).click();
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
        //Set element locate
        driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]")).click();
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
        //Set element locate
        driver.findElement(By.name("firstName")).sendKeys("Red" + dataRand);
        driver.findElement(By.id("last-name")).sendKeys("Bulls" + dataRand);
        driver.findElement(By.name("postalCode")).sendKeys("" + dataRand);
    }

    @And("User click continue button")
    public void userClickContinueButton() {
        //Set element locate
        driver.findElement(By.id("continue")).click();
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
        //Set element locate
        driver.findElement(By.xpath("//button[@data-test='finish'][@name='finish']")).click();
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
        //Set element locate
        driver.findElement(By.name("back-to-products")).click();
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
        //Set element locate
        driver.findElement(By.xpath("//button[@data-test='cancel'][@name='cancel']")).click();
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
        //Set element locate
        driver.findElement(By.id("item_4_title_link")).click();
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
        //Set element locate
        driver.findElement(By.name("firstName")).sendKeys(firstname);
        driver.findElement(By.id("last-name")).sendKeys(lastname);
        driver.findElement(By.name("postalCode")).sendKeys(zip);
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
