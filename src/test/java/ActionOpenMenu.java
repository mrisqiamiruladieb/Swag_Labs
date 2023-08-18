import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionOpenMenu extends env_target {
    @Test
    public void all_items(){
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
                ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-bike-light"))
        );
        //Set element locate
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='react-burger-menu-btn']" +
                        "[contains(text(), 'Open Menu')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn'][contains(text(), 'Open Menu')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='inventory_sidebar_link'][contains(text(), 'All Items')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@id='inventory_sidebar_link'][contains(text(), 'All Items')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='title'][contains(text(), 'Products')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void about(){
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
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='react-burger-menu-btn'][contains(text(), 'Open Menu')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn'][contains(text(), 'Open Menu')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='about_sidebar_link'][contains(text(), 'About')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@id='about_sidebar_link'][contains(text(), 'About')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.urlToBe("https://saucelabs.com/")
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void reset_app_state(){
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
                ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-sauce-labs-bike-light"))
        );
        //Set element locate
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn'][contains(text(), 'Open Menu')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='reset_sidebar_link'][contains(text(), 'Reset App State')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//a[@id='reset_sidebar_link'][contains(text(), 'Reset App State')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[@class='shopping_cart_badge'][contains(text(), '1')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
