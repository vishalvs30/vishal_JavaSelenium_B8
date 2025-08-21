package StepDefination;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pageclass {
	WebDriver driver;
	By email=By.id("userid");
	By pass = By.id("pass");
	By signin = By.id("signin-continue-btn");
	By cont = By.id("pass");
	By search = By.id("gh-ac");
	By addtocart = By.id("atcBtn_btn_1");
	By cart = By.cssSelector("a[href=\"https://cart.ebay.com?_trksid=p4540640.m167481.l8876\"]");
	
	By remove = By.cssSelector("button[data-test-id=\"cart-remove-item\"]");
	
	By category = By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]");
	By categoryname = By.cssSelector("a[href=\"https://www.ebay.com/b/Motorcycles/6024/bn_1865434\"]");
	
	
	By product = By.xpath("//*[@id=\"placement101875\"]/div/div/div/div/div/div[1]/div[2]/div[1]/div/a/div/div[1]/div");
	
	By allcategory = By.xpath("//*[@id=\"gh-cat\"]");
	By artcategory = By.xpath("//*[@id=\"gh-cat\"]");
	By searchcategory = By.id("gh-search-btn");
	
	By country = By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button");
	By flag = By.linkText("Spain");
	
	
	By motor = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a");
	By fashion = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a");
	By sports = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a");
	By health = By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[8]/a");

	public pageclass(WebDriver driver) {
		this.driver = driver;
	}
	
	public void email_in(String username1) {
		driver.navigate().to("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh&ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(email).click();
		driver.findElement(email).sendKeys(username1);
		driver.findElement(signin).click();	  		
	}
	public void pass_in(String password1) {
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys(password1);
		driver.findElement(cont).click();
	}
	public void search_in(String search1) {
		      driver.findElement(search);
		      driver.findElement(search).clear();
		      driver.findElement(search).sendKeys(search1);
		      driver.findElement(search).sendKeys(Keys.ENTER);
	               
		}
	public void addcart() {		        
		driver.navigate().to("https://www.ebay.com/itm/266896713942?_trkparms=amclksrc%3DITM%26aid%3D777008%26algo%3DPERSONAL.TOPIC%26ao%3D1%26asc%3D20231108131718%26meid%3D3f013dc0c0734d1e955471d87b6c4188%26pid%3D101910%26rk%3D1%26rkt%3D1%26itm%3D266896713942%26pmt%3D0%26noa%3D1%26pg%3D4375194%26algv%3DFeaturedDealsV2&_trksid=p4375194.c101910.m150506&_trkparms=parentrq%3Acacd136c1980a2e05375b758ffe0eb4c%7Cpageci%3Afe51af84-7e43-11f0-b323-32ca38f29bae%7Ciid%3A1%7Cvlpname%3Avlp_homepage");	      
		driver.findElement(addtocart).click();
	     	  
	}
	public void deletecart() {
		  driver.findElement(cart).click();
		  driver.findElement(remove).click();
		  		  
	}
	public void shopbycategory() {
		  driver.findElement(category).click();
		  driver.findElement(categoryname).click();	  		  
	}
	public void description() throws InterruptedException {
		driver.navigate().to("https://www.ebay.com/itm/266896713942?_trkparms=amclksrc%3DITM%26aid%3D777008%26algo%3DPERSONAL.TOPIC%26ao%3D1%26asc%3D20231108131718%26meid%3D508964e5af9c4721b1e776c346a32cd3%26pid%3D101910%26rk%3D1%26rkt%3D1%26itm%3D266896713942%26pmt%3D0%26noa%3D1%26pg%3D4375194%26algv%3DFeaturedDealsV2&_trksid=p4375194.c101910.m150506&_trkparms=parentrq%3Acaeb61a81980a0d5df440248ffedd864%7Cpageci%3A9e20a568-7e48-11f0-9a57-76d4caac80d1%7Ciid%3A1%7Cvlpname%3Avlp_homepage");
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));	
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		driver.findElement(product).click();

	}
	public void allcategory() {
		WebElement all = driver.findElement(allcategory);
		all.click();
		Select any = new Select(all);
		any.selectByVisibleText("Art");		
		driver.findElement(searchcategory).click();
	}
	
	public void  lang() {
		Actions act  = new Actions(driver);	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		WebElement con = driver.findElement(country);
		act.moveToElement(con).perform();
		driver.findElement(flag).click();;		
		
	}
	
	public void scroll() {
		Actions act  = new Actions(driver);	
		WebElement motor1 = driver.findElement(motor);
		act.moveToElement(motor1).perform();
		WebElement fashion1 = driver.findElement(fashion);
		act.moveToElement(fashion1).perform();
		WebElement sports1 = driver.findElement(sports);
		act.moveToElement(sports1).perform();
		WebElement health1 = driver.findElement(health);
		act.moveToElement(health1).perform();
	}
	
}
