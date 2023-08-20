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

    //Di header
    By ProductSortButton = By.xpath("//select[@class='product_sort_container'][@data-test='product_sort_container']");
    By AscendingNameProductSortOption = By.xpath("//option[@value='az'][contains(text(), 'Name (A to Z)')]");

    By DescendingNameProductSortOption = By.xpath("//option[@value='za'][contains(text(), 'Name (Z to A)')]");

    By AscendingPriceProductSortOption = By.xpath("//option[@value='lohi'][contains(text(), 'Price (low to high)')]");

    By DescendingPriceProductSortOption = By.xpath("//option[@value='hilo'][contains(text(), 'Price (high to low)')]");

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

    public void clickProductSortButton(){ driver.findElement(ProductSortButton).click(); }

    public void clickAscendingNameProductSortOption(){ driver.findElement(AscendingNameProductSortOption).click(); }

    public void clickDescendingNameProductSortOption(){ driver.findElement(DescendingNameProductSortOption).click(); }

    public void clickAscendingPriceProductSortOption(){ driver.findElement(AscendingPriceProductSortOption).click(); }

    public void clickDescendingPriceProductSortOption(){ driver.findElement(DescendingPriceProductSortOption).click(); }
}
