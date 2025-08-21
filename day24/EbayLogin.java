package ReadExcel;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EbayLogin {
    
    @Parameters({"username", "password"})
    @Test
    public void loginTest(@Optional("vishalvswami7@gmail.com")String user,@Optional("Ebay@140825") String pass) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://signin.ebay.com/");

        driver.findElement(By.id("userid")).sendKeys(user);
        driver.findElement(By.id("signin-continue-btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("pass")).sendKeys(pass);
        System.out.println("Tried login with: " + user);

        driver.quit();
    }
}


