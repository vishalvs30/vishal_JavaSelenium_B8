package EbayTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbaySearchStep {
	WebDriver driver;
	@Given("Open Ebay home page for searching product")
	public void open_ebay_home_page_for_searching_product() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("^search (.*)")
	public void search_search1(String search1) {
		EbayPageclass pg = new EbayPageclass(driver);
		pg.search_in(search1);
		System.out.println("Searched for: " + search1); 

	}

	@Then("Display result")
	public void display_result() {
	    driver.close();
	}
}
