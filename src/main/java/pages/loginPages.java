package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPages {
    WebDriver driver;

    //Konstruktor definisi driver
    public loginPages(WebDriver driver){ this.driver = driver; }

    //Locator
    By LoginButton = By.xpath("//input[@type='submit'][@value='Login']");
    By usernameField = By.name("user-name");
    By passwordField = By.id("password");

    //Method
    public void clickLoginButton(){
        driver.findElement(LoginButton).click();
    }

    public void inputUserAccountData(String username, String password){
        //username
        driver.findElement(usernameField).sendKeys(username);
        //password
        driver.findElement(passwordField).sendKeys(password);
    }
}
