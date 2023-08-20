package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePages {
    WebDriver driver;

    //Konstruktor definisi driver
    public homePages(WebDriver driver){ this.driver = driver; }

    //Locator
    //Di footer
    By TwitterLinkButton = By.xpath("//a[@target='_blank'][contains(text(), 'Twitter')]");
    By FacebookLinkButton = By.xpath("//a[@target='_blank'][contains(text(), 'Facebook')]");
    By LinkedInLinkButton = By.xpath("//a[@target='_blank'][contains(text(), 'LinkedIn')]");

    //Method
    public void clickTwitterLinkButton(){
        driver.findElement(TwitterLinkButton).click();
    }

    public void clickFacebookLinkButton(){
        driver.findElement(FacebookLinkButton).click();
    }

    public void clickLinkedInLinkButton(){
        driver.findElement(LinkedInLinkButton).click();
    }
}
