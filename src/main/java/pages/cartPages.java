package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPages {
    WebDriver driver;

    //Konstruktor definisi driver
    public cartPages(WebDriver driver){ this.driver = driver; }

    //Locator
    By RemoveSauceLabsBackpackButton = By.name("remove-sauce-labs-backpack");
    By RemoveSauceLabsBikeLightButton = By.id("remove-sauce-labs-bike-light");
    By RemoveSauceLabsBoltTShirtButton = By.name("remove-sauce-labs-bolt-t-shirt");
    By RemoveSauceLabsFleeceJacketButton = By.id("remove-sauce-labs-fleece-jacket");
    By RemoveSauceLabsOnesieButton = By.name("remove-sauce-labs-onesie");
    By ContinueShoppingButton = By.name("continue-shopping");
    By CheckoutButton = By.xpath("//button[@class='btn btn_action btn_medium checkout_button'][contains(text(), 'Checkout')]");
    By firstnameField = By.name("firstName");
    By lastnameField = By.id("last-name");
    By postalcodeField = By.name("postalCode");
    By ContinueButton = By.id("continue");
    By FinishButton = By.xpath("//button[@data-test='finish'][@name='finish']");
    By BackToProductsButton = By.name("back-to-products");
    By CancelButton = By.xpath("//button[@data-test='cancel'][@name='cancel']");
    By DetailProductLinkButton = By.id("item_4_title_link");

    //Method
    public void clickRemoveSauceLabsBackpackButton(){
        driver.findElement(RemoveSauceLabsBackpackButton).click();
    }

    public void clickRemoveSauceLabsBikeLightButton(){
        driver.findElement(RemoveSauceLabsBikeLightButton).click();
    }

    public void clickRemoveSauceLabsBoltTShirtButton(){
        driver.findElement(RemoveSauceLabsBoltTShirtButton).click();
    }

    public void clickRemoveSauceLabsFleeceJacketButton(){
        driver.findElement(RemoveSauceLabsFleeceJacketButton).click();
    }

    public void clickRemoveSauceLabsOnesieButton(){
        driver.findElement(RemoveSauceLabsOnesieButton).click();
    }

    public void clickContinueShoppingButton(){
        driver.findElement(ContinueShoppingButton).click();
    }

    public void clickCheckoutButton(){
        driver.findElement(CheckoutButton).click();
    }

    public void inputUserInformationData(String firstname, String lastname, String postalcode){
        driver.findElement(firstnameField).sendKeys(firstname);
        driver.findElement(lastnameField).sendKeys(lastname);
        driver.findElement(postalcodeField).sendKeys(postalcode);
    }

    public void clickContinueButton(){
        driver.findElement(ContinueButton).click();
    }

    public void clickFinishButton(){
        driver.findElement(FinishButton).click();
    }

    public void clickBackToProductsButton(){
        driver.findElement(BackToProductsButton).click();
    }

    public void clickCancelButton(){
        driver.findElement(CancelButton).click();
    }

    public void clickDetailProductLinkButton(){
        driver.findElement(DetailProductLinkButton).click();
    }
}
