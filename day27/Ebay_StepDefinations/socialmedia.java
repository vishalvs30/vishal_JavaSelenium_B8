package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class social {
	WebDriver driver;

	@Given("Ebay Social Account Symbol")
	public void ebay_social_account_symbol() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("click On Symbol")
	public void click_on_symbol() {
	    driver.findElement(By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[3]/div[2]/ul/li[1]/a")).click();
	}

	@Then("Display Page")
	public void display_page() {
	    driver.close();
	}
}
