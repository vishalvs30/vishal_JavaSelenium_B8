package POMDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pageClassTira {

    WebDriver driver;

    By loginLink = By.linkText("Login");
    By email = By.id("login-email");
    By password = By.id("login-password");
    By continueBtn = By.id("login-continue");
    By submitBtn = By.id("login-button");

    By searchBox = By.name("q");
    By firstProduct = By.cssSelector(".product-card a");
    By addToCartBtn = By.id("add-to-cart");
    By cartIcon = By.id("cart-icon");
    By removeItem = By.xpath("//button[contains(text(),'Remove')]");

    By profileMenu = By.id("profile-menu");
    By nameField = By.id("profile-name");
    By addressField = By.id("profile-address");
    By saveBtn = By.id("save-settings");

    By categoryMenu = By.id("category-menu");
    By language = By.id("language-selector");

    
    public pageClassTira(WebDriver driver) {
        this.driver = driver;
    }

    // Login
    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    public void email_in() {
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("testuser@gmail.com");
    }

    public void pass_in() {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("password123");
    }

    public void con_in() {
        driver.findElement(continueBtn).click();
    }

    public void submit_in() {
        driver.findElement(submitBtn).click();
    }

    //Search Actions 
    public void search_in() {
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys("Lipstick");
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }

    //  Cart Actions 
    public void add_to_cart() {
        driver.findElement(addToCartBtn).click();
    }

    public void go_to_cart() {
        driver.findElement(cartIcon).click();
    }

    public void remove_from_cart() {
        driver.findElement(removeItem).click();
    }

    // Profile Actions
    public void go_to_profile() {
        driver.findElement(profileMenu).click();
    }

    public void change_name() {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys("New User");
        driver.findElement(saveBtn).click();
    }

    public void change_address() {
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys("New Delhi, India");
        driver.findElement(saveBtn).click();
    }

    //  Category Actions 
    public void select_category() {
        driver.findElement(categoryMenu).click();
        driver.findElement(By.linkText("Makeup")).click();
    }

    // Language Actions 
    public void change_language() {
        driver.findElement(language).click();
        driver.findElement(By.linkText("Hindi")).click();
    }


	 
}
