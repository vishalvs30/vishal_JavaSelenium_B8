package Testng_package;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Ebay_Project_Testing {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void Down() {
        driver.quit();
    }

    // 1. Login Test Case
    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
    	
        WebElement login=driver.findElement(By.linkText("Sign in"));
        login.click();
        Thread.sleep(2000);
        WebElement Username= driver.findElement(By.id("userid"));
        Username.sendKeys("vishalvswami7@gmail.com");
        Username.sendKeys(Keys.ENTER);
        
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);
        
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys("Ebay@140825");
        password.sendKeys(Keys.ENTER);
        driver.findElement(By.id("sgnBt")).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.getTitle().contains("My eBay"), "Login failed");
    	
 }

//     2. Multiple Searches using ArrayList
    @Test(priority = 2)
    public void multipleSearchesTest() throws InterruptedException {
        List<String> items = new ArrayList<>();
        items.add("Laptop");
        items.add("Shoes");
        items.add("Watches");

        for (String item : items) {
            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            searchBox.clear();
            searchBox.sendKeys(item);
            searchBox.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            Assert.assertTrue(driver.getTitle().toLowerCase().contains(item.toLowerCase()), "Search for " + item + " failed");
            driver.navigate().back();
            Thread.sleep(2000);
        }
    }

    // 3. Add to cart
    @Test(priority = 3)
    public void addToCartTest() throws InterruptedException {
    	 WebElement add = driver.findElement(By.id("gh-ac"));
         add.clear();
         add.sendKeys("Laptop");
         add.sendKeys(Keys.ENTER);
         Thread.sleep(3000);
         driver.get("https://www.ebay.com/itm/177334525191?_skw=Laptop&itmmeta=01K2HJR4D4Z8WHYYW8BJHB1CEZ&hash=item2949f61d07:g:e18AAeSwOXZom-VU&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1dmzmyQc4QHy5Wqk73TYT8GtpLJo8wDB7kHk1HlNOTqWiekjOPKhFHH7uXwq%2BMkAsJtxNw1OXIGgIHZ25M0MONp%2FyuZXwttQkN%2BJXp0nf%2F9H4mLY4cmCy1HYuihVNv4TEBAW8jCeueAUFs0QY28pU%2FkX0DcosjXwcLxTXyhca%2BYmk5ZVWsvNcR9ESGtYLV94hg0pTNwhu7ob%2FGp1m%2FAPvC8BM2nheE9o47IwFxNkYC1YMFdMqdAIqsdDXd44Du1%2BnorjH49C4h3kGe698MPH9Kt%7Ctkp%3ABFBM-sbgspRm");
         Thread.sleep(3000);

         driver.findElement(By.id("atcBtn_btn_1")).click();
         Thread.sleep(3000);
    }
    
    @Test(priority = 4)
    public void deleteFromCart() throws InterruptedException {
    	driver.get("https://cart.ebay.com/");
        driver.findElement(By.className("gh-cart__icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[data-test-id='cart-remove-item']")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void ChangeLoginName() {
        driver.findElement(By.id("gh-ug")).click();
        driver.findElement(By.partialLinkText("Account settings")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("NewUsername");
        driver.findElement(By.id("save")).click();
    }
    
    @Test(priority = 6)
    public void shopByCategoriesTest() throws InterruptedException {
    	WebElement dropdown = driver.findElement(By.cssSelector("#gh-cat"));
        dropdown.click();
        Thread.sleep(1000);

      
        driver.findElement(By.cssSelector("#gh-cat option[value='267']")).click(); 

        Thread.sleep(3000);
        driver.findElement(By.id("gh-search-btn")).click();
    }
  @Test(priority = 7)
  public void shopByAllCategoriesTest() throws InterruptedException {
      driver.findElement(By.className("gh-categories__title")).click();
      Thread.sleep(2000);
      driver.findElement(By.className("gh-categories__col")).click();
      Thread.sleep(2000);
     // Assert.assertTrue(driver.getTitle().contains("All Categories"));	
  }
  
  @Test(priority = 8)
  public void RightClickDescription() {
	  Actions actions = new Actions(driver);

      WebElement cam = driver.findElement(By.id("gh-ac"));
      cam.sendKeys("Nikon Camera");  
      cam.sendKeys(Keys.ENTER); 
      WebElement productImage = driver.findElement(By.xpath("//div[@class='s-item__image']/img"));
      actions.contextClick(productImage).perform();
      
  }
    


    @Test(priority = 9)
	public void languageChange() throws InterruptedException {

		Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		WebElement country = driver.findElement(By.cssSelector("button[class=\"gf-flag__button\"]"));
		country.sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		driver.findElement(By.linkText("China")).click();

	}
   
    

    


    

    
}



