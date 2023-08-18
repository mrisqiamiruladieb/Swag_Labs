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

public class LogoutBdd extends env_target {
    @Given("User is already logged in")
    public void userIsAlreadyLoggedIn() {
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

    @When("User verify open menu button")
    public void userVerifyOpenMenuButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='react-burger-menu-btn']" +
                        "[contains(text(), 'Open Menu')]"))
        );
    }

    @Then("User click open menu button")
    public void userClickOpenMenuButton() {
        //Set element locate
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn'][contains(text(), 'Open Menu')]")).click();
    }

    @When("User verify logout button")
    public void userVerifyLogoutButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logout_sidebar_link'][contains(text(), 'Logout')]"))
        );
    }

    @And("User click logout button")
    public void userClickLogoutButton() {
        //Set element locate
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link'][contains(text(), 'Logout')]")).click();
    }

    @Then("User verify logout result")
    public void userVerifyLogoutResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit'][@value='Login']"))
        );
        //Quit chrome
        driver.quit();
    }
}
