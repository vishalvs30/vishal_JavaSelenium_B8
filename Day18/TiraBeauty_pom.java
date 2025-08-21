package POMDemo;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TiraBeauty_pom {

    WebDriver driver;
    pageClassTira page1;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tirabeauty.com/");
        page1 = new pageClassTira(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // 1. Login
    @Test(priority = 1)
    public void loginTest() {
        page1.clickLogin();
        page1.email_in();
        page1.pass_in();
        page1.submit_in();
        Assert.assertTrue(driver.getTitle().contains("Tira"), "Login failed");
    }

    // 2. Multiple searches
    @Test(priority = 2)
    public void multipleSearchTest() {
        List<String> items = Arrays.asList("Lipstick", "Perfume", "Shampoo");
        for (String item : items) {
            page1.searchProduct(item);
            Assert.assertTrue(driver.getPageSource().toLowerCase().contains(item.toLowerCase()),
                    "Search failed for: " + item);
        }
    }

    // 3. Add to cart
    @Test(priority = 3)
    public void addToCartTest() {
        page1.searchProduct("Lipstick");
        page1.openFirstProduct();
        page1.add_to_cart();
        page1.go_to_cart();
        Assert.assertTrue(driver.getTitle().contains("Cart"), "Add to cart failed");
    }

    // 4. Delete from cart
    @Test(priority = 4)
    public void deleteFromCartTest() {
        page1.go_to_cart();
        page1.remove_from_cart();
        Assert.assertTrue(driver.getPageSource().toLowerCase().contains("empty"), "Delete from cart failed");
    }

    // 5. Change login name
    @Test(priority = 5)
    public void changeLoginNameTest() {
        page1.go_to_profile();
        page1.change_name();
        Assert.assertTrue(driver.getPageSource().contains("New User"), "Name change failed");
    }

    // 6. Change current address
    @Test(priority = 6)
    public void changeAddressTest() {
        page1.go_to_profile();
        page1.change_address();
        Assert.assertTrue(driver.getPageSource().contains("New Delhi"), "Address change failed");
    }

    // 7. Shop by category
    @Test(priority = 7)
    public void shopByCategoryTest() {
        page1. select_category();
        Assert.assertTrue(driver.getTitle().contains("Makeup"), "Category navigation failed");
    }

    // 8. Right click product image and get description
    @Test(priority = 8)
    public void productDescriptionTest() {
        page1.searchProduct("Perfume");
        page1.openFirstProductAndRightClick();
        String desc = page1.getProductDescription();
        Assert.assertNotNull(desc, "Description not found");
    }

    // 9. Shop by all categories
    @Test(priority = 9)
    public void shopByAllCategoriesTest() {
        page1.select_category();
        Assert.assertTrue(driver.getTitle().contains("All Categories"), "All categories check failed");
    }

    // 10. Change language
    @Test(priority = 10)
    public void changeLanguageTest() {
        page1.change_language();
        Assert.assertTrue(driver.getPageSource().contains("हिंदी"), "Language change failed");
    }
}


