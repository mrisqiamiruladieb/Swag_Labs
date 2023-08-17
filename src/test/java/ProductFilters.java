import config.env_target;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductFilters extends env_target {
    @Test
    public void ascending_name(){
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
        //Set element locate
        driver.findElement(By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='az'][contains(text(), 'Name (A to Z)')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//option[@value='az'][contains(text(), 'Name (A to Z)')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Sauce Labs Backpack')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void descending_name(){
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
        //Set element locate
        driver.findElement(By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='za'][contains(text(), 'Name (Z to A)')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//option[@value='za'][contains(text(), 'Name (Z to A)')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Test.allTheThings() T-Shirt (Red)')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void ascending_price(){
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
        //Set element locate
        driver.findElement(By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='lohi'][contains(text(), 'Price (low to high)')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//option[@value='lohi'][contains(text(), 'Price (low to high)')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Sauce Labs Onesie')]"))
        );
        //Quit chrome
        driver.quit();
    }

    @Test
    public void descending_price(){
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
        //Set element locate
        driver.findElement(By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[@value='hilo'][contains(text(), 'Price (high to low)')]"))
        );
        //Set element locate
        driver.findElement(By.xpath("//option[@value='hilo'][contains(text(), 'Price (high to low)')]")).click();
        //Set case stop tunggu
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inventory_item_name'][contains(text(), 'Sauce Labs Fleece Jacket')]"))
        );
        //Quit chrome
        driver.quit();
    }
}
