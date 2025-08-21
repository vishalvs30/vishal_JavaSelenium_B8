package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class slide {
	WebDriver driver;

	@Given("Scroll down and check deals")
	public void scroll_down_and_check_deals() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}

	@When("slide forward and backward")
	public void slide_forward_and_backward() throws InterruptedException {
		Actions act  = new Actions(driver);	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1600)");
	    WebElement forward = driver.findElement(By.cssSelector("button[aria-label=\"Go to the next slide, Today's Deals - Carousel\"]"));
	    forward.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    WebElement backward = driver.findElement(By.cssSelector("button[aria-label=\"Go to the previous slide, Today's Deals - Carousel\"]"));
	    backward.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	}

	@Then("Display deals")
	public void display_deals() {
	    driver.close();
	}
}
