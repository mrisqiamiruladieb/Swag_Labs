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

public class FooterLinksBdd extends env_target {
    @Given("User have login")
    public void userHaveLogin() {
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

    @When("User verify twitter link button")
    public void userVerifyTwitterLinkButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='_blank'][contains(text(), 'Twitter')]"))
        );
    }

    @And("User click twitter link button")
    public void userClickTwitterLinkButton() {
        //Implementasi POM
        homePages footer = new homePages(driver);

        footer.clickTwitterLinkButton();
    }

    @Then("User verify twitter link result")
    public void userVerifyTwitterLinkResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.numberOfWindowsToBe(2)
        );
        //Quit chrome
        driver.quit();
    }

    @When("User verify facebook link button")
    public void userVerifyFacebookLinkButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='_blank'][contains(text(), 'Facebook')]"))
        );
    }

    @And("User click facebook link button")
    public void userClickFacebookLinkButton() {
        //Implementasi POM
        homePages footer = new homePages(driver);

        footer.clickFacebookLinkButton();
    }

    @Then("User verify facebook link result")
    public void userVerifyFacebookLinkResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.numberOfWindowsToBe(2)
        );
        //Quit chrome
        driver.quit();
    }

    @When("User verify linkedin link button")
    public void userVerifyLinkedinLinkButton() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='_blank'][contains(text(), 'LinkedIn')]"))
        );
    }

    @And("User click linkedin link button")
    public void userClickLinkedinLinkButton() {
        //Implementasi POM
        homePages footer = new homePages(driver);

        footer.clickLinkedInLinkButton();
    }

    @Then("User verify linkedin link result")
    public void userVerifyLinkedinLinkResult() {
        //Set waktu tunggu
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.numberOfWindowsToBe(2)
        );
        //Quit chrome
        driver.quit();
    }
}
