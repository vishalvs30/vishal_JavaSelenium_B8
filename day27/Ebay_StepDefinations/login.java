package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	@Given("login page should be open in default browser")
	public void login_page_should_be_open_in_default_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("^Email(.*)$")
	public void email_username1(String username1) {
		pageclass pg = new pageclass(driver);
		pg.email_in(username1);
	}

	@And("^Password(.*)$")
	public void password_password1(String password1) {
		pageclass pg = new pageclass(driver);
		pg.pass_in(password1);
	}


	@Then("login successfully and open home page")
	public void login_successfully_and_open_home_page() {
	    driver.close();
	}

}
