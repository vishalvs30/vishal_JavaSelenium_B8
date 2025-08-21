package ReadExcel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EbayEnable {

    WebDriver driver;

    @Test
    public void activeTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }

    @Test(enabled = false)
    public void disabledTest() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("This should not run");
        driver.quit();
    }
}



