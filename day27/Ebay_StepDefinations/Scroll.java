package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scroll {
	WebDriver driver;

	@Given("Scroll mouse on each category")
	public void scroll_mouse_on_each_category() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("Scroll")
	public void scroll() {
		pageclass pg = new pageclass(driver);
		pg.scroll();

	}

	@Then("Display")
	public void display() {
	    driver.close();
	}

}
