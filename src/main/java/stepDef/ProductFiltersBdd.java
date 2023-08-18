package stepDef;

import config.env_target;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductFiltersBdd extends env_target {
    @Given("User is on products page")
    public void userIsOnProductsPage() {
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
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']"))
        );
    }

    @When("User click product sort button")
    public void userClickProductSortButton() {
        //Set element locate
        driver.findElement(By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']")).click();
    }

    @Then("User verify ascending name product sort option")
    public void userVerifyAscendingNameProductSortOption() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='az'][contains(text(), 'Name (A to Z)')]"))
        );
    }

    @When("User click ascending name product sort option")
    public void userClickAscendingNameProductSortOption() {
        //Set element locate
        driver.findElement(By.xpath("//option[@value='az'][contains(text(), 'Name (A to Z)')]")).click();
    }

    @Then("User verify ascending name product sort result")
    public void userVerifyAscendingNameProductSortResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Sauce Labs Backpack')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Then("User verify descending name product sort option")
    public void userVerifyDescendingNameProductSortOption() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='za'][contains(text(), 'Name (Z to A)')]"))
        );
    }

    @When("User click descending name product sort option")
    public void userClickDescendingNameProductSortOption() {
        //Set element locate
        driver.findElement(By.xpath("//option[@value='za'][contains(text(), 'Name (Z to A)')]")).click();
    }

    @Then("User verify descending name product sort result")
    public void userVerifyDescendingNameProductSortResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Test.allTheThings() T-Shirt (Red)')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Then("User verify ascending price product sort option")
    public void userVerifyAscendingPriceProductSortOption() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='lohi'][contains(text(), 'Price (low to high)')]"))
        );
    }

    @When("User click ascending price product sort option")
    public void userClickAscendingPriceProductSortOption() {
        //Set element locate
        driver.findElement(By.xpath("//option[@value='lohi'][contains(text(), 'Price (low to high)')]")).click();
    }

    @Then("User verify ascending price product sort result")
    public void userVerifyAscendingPriceProductSortResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Sauce Labs Onesie')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Then("User verify descending price product sort option")
    public void userVerifyDescendingPriceProductSortOption() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='hilo'][contains(text(), 'Price (high to low)')]"))
        );
    }

    @When("User click descending price product sort option")
    public void userClickDescendingPriceProductSortOption() {
        //Set element locate
        driver.findElement(By.xpath("//option[@value='hilo'][contains(text(), 'Price (high to low)')]")).click();
    }

    @Then("User verify descending price product sort result")
    public void userVerifyDescendingPriceProductSortResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Sauce Labs Fleece Jacket')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
