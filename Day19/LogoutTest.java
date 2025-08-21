package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LogoutTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		System.out.println("Welocme to Login Page");
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement pswd=driver.findElement(By.id("password"));
		pswd.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		String actualurl="https://www.saucedemo.com/";
		String expectedurl=driver.getCurrentUrl();
		if(expectedurl.equals(actualurl)) {
		System.out.println("Login Failed");
		}
		else {
		System.out.println("Login Success");
		}
		
		WebElement sort = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		Select sel = new Select(sort);
		sel.selectByVisibleText("Name (Z to A)");
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		WebElement itemname=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
		String itm=itemname.getText();
		WebElement 
		num=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		int nu=Integer.parseInt(num.getText());
		if(nu>0) {
		System.out.println("Item added successfully");
		}
		else {
		System.out.println("Item not added");
		}
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(3000);
		
		WebElement fname=driver.findElement(By.id("first-name"));
		fname.sendKeys("v");
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys("vish");
		WebElement zcode=driver.findElement(By.id("postal-code"));
		zcode.sendKeys("54501");
		driver.findElement(By.id("continue")).click();
		WebElement st=driver.findElement(By.className("inventory_item_name"));
		String s=st.getText();
		if(s.equals(itm)) {
		System.out.println("Verification Successful");
		}
		else {
		System.out.println("Verification unsuccessful");
		}
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		String expexted="https://www.saucedemo.com/";
		String act=driver.getCurrentUrl();
		if(act.equals(expexted)) {
		System.out.println("Login page displayed successfully after clicking logout");
		}
		Thread.sleep(7000);
		driver.close();
		}
}
