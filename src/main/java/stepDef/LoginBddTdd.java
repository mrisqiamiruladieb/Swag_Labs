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

public class LoginBddTdd extends env_target {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
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
    }

    @When("User fill username and password")
    public void userFillUsernameAndPassword() {
        //Set element locate
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User click login button")
    public void userClickLoginButton() {
        //Set element locate
        driver.findElement(By.xpath("//input[@type='submit'][@value='Login']")).click();
    }

    @Then("User verify login result")
    public void userVerifyLoginResult() {
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

    @When("User fill invalid username and password")
    public void userFillInvalidUsernameAndPassword() {
        //Generate Random Data
        Random rand = new Random();
        //Menggunakan angka
        int userRand = rand.nextInt(1000);
        //Set element locate
        driver.findElement(By.name("user-name")).sendKeys("what is sauce" + userRand);
        driver.findElement(By.id("password")).sendKeys("I'm_from_a_long_time_ago" + userRand);
    }

    @Then("User get error message")
    public void userGetErrorMessage() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']" +
                        "[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"))
        );
        //Quit chrome
        driver.quit();
    }

    //Aturan code TDD
    @When("^User input (.*) and (.*)$")
    public void userInputUsernameAndPassword(String username, String password) {
        //Set element locate
        driver.findElement(By.name("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    //Aturan code TDD
    @Then("^User get verify login (.*)$")
    public void userGetVerifyLoginResult(String result) {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        if (result == "Passed"){
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Products')]"))
            );
        } else if (result == "Failed") {
            //Set case stop tunggu
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@data-test='error']" +
                            "[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"))
            );
        }
        //Quit chrome
        driver.quit();
    }
}
