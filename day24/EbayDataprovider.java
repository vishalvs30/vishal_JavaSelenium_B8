package ReadExcel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EbayDataprovider {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"user1@example.com", "Password1"},
            {"user2@example.com", "Password2"},
            {"vishalvswami7@gmail.com", "Ebay@140825"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String user, String pass) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://signin.ebay.com/");

        driver.findElement(By.id("userid")).sendKeys(user);
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("pass")).sendKeys(pass);
        System.out.println("Attempted login with: " + user);

        driver.quit();
    }
}


