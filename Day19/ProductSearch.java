package Day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch {
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
		
		WebElement num=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span"));
		int nu=Integer.parseInt(num.getText());
		if(nu>0) {
		System.out.println("Item added successfully");
		}
		else {
		System.out.println("Item not added");
		}
		Thread.sleep(7000);
		driver.close();
		}
		
}
