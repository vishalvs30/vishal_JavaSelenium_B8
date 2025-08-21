package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class country {
	WebDriver driver;

	@Given("All Flags")
	public void all_flags() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("Click on any flag")
	public void click_on_any_flag() {
		pageclass pg = new pageclass(driver);
		pg.lang();

	}

	@Then("Choosed flag")
	public void choosed_flag() {
	    driver.close();
	}
}
