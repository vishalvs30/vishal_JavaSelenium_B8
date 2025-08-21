package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SallCategory {
	WebDriver driver;

	@Given("Click on ALL Category button")
	public void click_on_all_category_button() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("Click on ALL Category and Search")
	public void click_on_all_category_and_search() {
		pageclass pg = new pageclass(driver);
		pg.allcategory();

	}

	@Then("Display List of products in that category")
	public void display_list_of_products_in_that_category() {
	    driver.close();
	}
}
