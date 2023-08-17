import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionCart extends env_target {
    @Test
    public void add_remove_products(){
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
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("add-to-cart-sauce-labs-backpack"))
        );
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
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '6')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("remove-sauce-labs-backpack"))
        );
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
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Set element locate
        driver.findElement(By.name("continue-shopping")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void checkout(){
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
                ExpectedConditions.visibilityOfElementLocated(By.name("add-to-cart-sauce-labs-backpack"))
        );
        //Set element locate
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Your Information')]"))
        );
        //Set element locate
        driver.findElement(By.name("firstName")).sendKeys("Red");
        driver.findElement(By.id("last-name")).sendKeys("Bulls");
        driver.findElement(By.name("postalCode")).sendKeys("12321");
        driver.findElement(By.id("continue")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Overview')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@data-test='finish'][@name='finish']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Complete!')]"))
        );
        //Set element locate
        driver.findElement(By.name("back-to-products")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Products')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void cancel_checkout(){
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
                ExpectedConditions.visibilityOfElementLocated(By.name("add-to-cart-sauce-labs-backpack"))
        );
        //Set element locate
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Your Information')]"))
        );
        //Set element locate
        driver.findElement(By.name("firstName")).sendKeys("Red");
        driver.findElement(By.id("last-name")).sendKeys("Bulls");
        driver.findElement(By.name("postalCode")).sendKeys("12321");
        driver.findElement(By.id("continue")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Checkout: Overview')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@data-test='cancel'][@name='cancel']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Products')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
