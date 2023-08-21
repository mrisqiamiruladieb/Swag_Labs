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
    By OpenMenuButton = By.xpath("//button[@id='react-burger-menu-btn'][contains(text(), 'Open Menu')]");
    By CartButton = By.xpath("//a[@class='shopping_cart_link']");

    //Di sidebar
    By LogoutButton = By.xpath("//a[@id='logout_sidebar_link'][contains(text(), 'Logout')]");
    By AllItemsButton = By.xpath("//a[@id='inventory_sidebar_link'][contains(text(), 'All Items')]");
    By AboutButton = By.xpath("//a[@id='about_sidebar_link'][contains(text(), 'About')]");
    By ResetAppStateButton = By.xpath("//a[@id='reset_sidebar_link'][contains(text(), 'Reset App State')]");

    //Di home
    By AddToCartSauceLabsBackpackButton = By.name("add-to-cart-sauce-labs-backpack");
    By AddToCartSauceLabsBikeLightButton = By.id("add-to-cart-sauce-labs-bike-light");
    By AddToCartSauceLabsBoltTShirtButton = By.name("add-to-cart-sauce-labs-bolt-t-shirt");
    By AddToCartSauceLabsFleeceJacketButton = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By AddToCartSauceLabsOnesieButton = By.name("add-to-cart-sauce-labs-onesie");
    By AddToCartSauceLabsAllThingsTShirtRedButton = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

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

    public void clickOpenMenuButton(){ driver.findElement(OpenMenuButton).click(); }

    public void clickLogoutButton(){ driver.findElement(LogoutButton).click(); }

    public void clickAddToCartSauceLabsBikeLightButton(){
        driver.findElement(AddToCartSauceLabsBikeLightButton).click();
    }

    public void clickCartButton(){ driver.findElement(CartButton).click(); }

    public void clickAllItemsButton(){ driver.findElement(AllItemsButton).click(); }

    public void clickAboutButton(){ driver.findElement(AboutButton).click(); }

    public void clickResetAppStateButton(){ driver.findElement(ResetAppStateButton).click(); }

    public void clickAddToCartSauceLabsBackpackButton(){ driver.findElement(AddToCartSauceLabsBackpackButton).click(); }

    public void clickAddToCartSauceLabsBoltTShirtButton(){ driver.findElement(AddToCartSauceLabsBoltTShirtButton).click(); }

    public void clickAddToCartSauceLabsFleeceJacketButton(){ driver.findElement(AddToCartSauceLabsFleeceJacketButton).click(); }

    public void clickAddToCartSauceLabsOnesieButton(){ driver.findElement(AddToCartSauceLabsOnesieButton).click(); }

    public void clickAddToCartSauceLabsAllThingsTShirtRedButton(){
        driver.findElement(AddToCartSauceLabsAllThingsTShirtRedButton).click();
    }
}
