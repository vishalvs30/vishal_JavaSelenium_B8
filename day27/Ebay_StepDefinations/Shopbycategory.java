package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sbycategory {
	WebDriver driver;
	@Given("Open Browser Home Page")
	public void open_browser_home_page() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("Click on by Category and Search")
	public void click_on_by_category_and_search() {
		pageclass pg = new pageclass(driver);
		pg.shopbycategory();

	}

	@Then("Display List of products")
	public void display_list_of_products() {
	    driver.close();

}
}
