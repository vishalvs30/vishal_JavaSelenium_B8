package ReadExcel;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ebaydependent {

    WebDriver driver;

    @Test
    public void login() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        System.out.println("eBay homepage opened");
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        driver.findElement(By.id("gh-ac")).sendKeys("Mobile Phone");
        driver.findElement(By.id("gh-btn")).click();
        System.out.println("Search for Mobile Phone done");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void logout() {
        driver.quit();
        System.out.println("Browser closed (logout simulated)");
    }
}

