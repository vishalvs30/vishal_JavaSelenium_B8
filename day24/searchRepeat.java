package ReadExcel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class searchRepeat {

    @Test(invocationCount = 3)
    public void searchTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
        driver.findElement(By.id("gh-btn")).click();

        System.out.println("Search executed, Title: " + driver.getTitle());
        driver.quit();
    }
}

